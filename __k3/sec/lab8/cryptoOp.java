package __k3.sec.lab8;

import javax.crypto.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

public class cryptoOp {
    
        public static void encryptFile(File inputFile, File outputFile, SecretKey secretKey, String algorithm) {
            try {
                Cipher cipher = Cipher.getInstance(algorithm);
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
    
                FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream = new FileOutputStream(outputFile);
    
                CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
    
                byte[] buffer = new byte[4096];
                int bytesRead;
    
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    cipherOutputStream.write(buffer, 0, bytesRead);
                }
    
                cipherOutputStream.close();
                inputStream.close();
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
        public static void decryptFile(File inputFile, File outputFile, SecretKey secretKey, String algorithm) {
            try {
                Cipher cipher = Cipher.getInstance(algorithm);
                cipher.init(Cipher.DECRYPT_MODE, secretKey);
    
                FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream = new FileOutputStream(outputFile);
    
                CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
    
                byte[] buffer = new byte[4096];
                int bytesRead;
    
                while ((bytesRead = cipherInputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
    
                cipherInputStream.close();
                inputStream.close();
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
        public static SecretKey generateSecretKey(String algorithm) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
                keyGenerator.init(256); // Key size
                return keyGenerator.generateKey();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }
    
        public static byte[] signFile(File file, PrivateKey privateKey, String algorithm) {
            try {
                Signature signature = Signature.getInstance(algorithm);
                signature.initSign(privateKey);
    
                FileInputStream inputStream = new FileInputStream(file);
                byte[] buffer = new byte[4096];
                int bytesRead;
    
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    signature.update(buffer, 0, bytesRead);
                }
    
                inputStream.close();
                return signature.sign();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    
        public static boolean verifySignature(File file, byte[] signatureToVerify, PublicKey publicKey, String algorithm) {
            try {
                Signature signature = Signature.getInstance(algorithm);
                signature.initVerify(publicKey);
    
                FileInputStream inputStream = new FileInputStream(file);
                byte[] buffer = new byte[4096];
                int bytesRead;
    
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    signature.update(buffer, 0, bytesRead);
                }
    
                inputStream.close();
                return signature.verify(signatureToVerify);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    
        public static byte[] computeHash(File file, String algorithm) {
            try {
                MessageDigest digest = MessageDigest.getInstance(algorithm);
    
                FileInputStream inputStream = new FileInputStream(file);
                byte[] buffer = new byte[4096];
                int bytesRead;
    
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    digest.update(buffer, 0, bytesRead);
                }
    
                inputStream.close();
                return digest.digest();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public static KeyPair generateKeyPair(String algorithm) {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
                keyPairGenerator.initialize(2048); 
                
                return keyPairGenerator.generateKeyPair();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
