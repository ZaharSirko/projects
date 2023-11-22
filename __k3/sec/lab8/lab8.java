package __k3.sec.lab8;
import javax.crypto.SecretKey;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;

public class lab8 extends JFrame {
    private JButton chooseFileButton;
    private JButton encryptButton;
    private JButton decryptButton;
    private JButton generateKeyButton;
    private JButton signButton;
    private JButton verifyButton;
    private JButton hashButton;
    private JFileChooser fileChooser;
    private File selectedFile;
    private JTextArea outputTextArea;

    private SecretKey secretKey;
    private PublicKey publicKey;
    private PrivateKey privateKey;
    private byte[] signature;
    private  String path = "__k3//sec//lab8//files//";

    public lab8() {
        setTitle("Crypto App");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 1, 0, 10));

        chooseFileButton = new JButton("Choose File");
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        generateKeyButton = new JButton("Generate Keys");
        signButton = new JButton("Sign");
        verifyButton = new JButton("Verify Signature");
        hashButton = new JButton("Compute Hash");

        panel.add(chooseFileButton);
        panel.add(generateKeyButton);
        panel.add(encryptButton);
        panel.add(decryptButton);
        panel.add(signButton);
        panel.add(verifyButton);
        panel.add(hashButton);

        add(panel, BorderLayout.WEST);

        outputTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        add(scrollPane, BorderLayout.CENTER);

        KeyPair keyPair = cryptoOp.generateKeyPair("RSA");
        privateKey = keyPair.getPrivate();
        publicKey = keyPair.getPublic();

        chooseFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    outputTextArea.append("File Selected: " + selectedFile.getName() + "\n");
                }

            }
        });

        generateKeyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secretKey = cryptoOp.generateSecretKey("AES");
                outputTextArea.append("AES Key Generated\n");

            }
        });

        encryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedFile != null && secretKey != null) {
                    File encryptedFile = new File(path+"encrypted.txt");
                    cryptoOp.encryptFile(selectedFile, encryptedFile, secretKey, "AES");
                    outputTextArea.append("Encryption Completed\n");
                } else {
                    outputTextArea.append("Please select a file and generate a key first\n");
                }

            }
        });

        decryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedFile != null && secretKey != null) {
                    File decryptedFile = new File(path+"decrypted.txt");
                    cryptoOp.decryptFile(new File(path+"encrypted.txt"), decryptedFile, secretKey, "AES");
                    outputTextArea.append("Decryption Completed\n");
                } else {
                    outputTextArea.append("Please select a file and generate a key first\n");
                }

            }
        });


        signButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedFile != null && privateKey != null) {
                  signature = cryptoOp.signFile(selectedFile, privateKey, "SHA256withRSA");
                  try {
                    Files.write(Paths.get( path+"signature.bin"), signature);
                    outputTextArea.append("File Signed\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                } else {
                    outputTextArea.append("Please select a file and generate keys first\n");
                }

            }
        });

        verifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedFile != null && publicKey != null) {
                    byte[] signatureToVerify = signature; 
                    boolean isVerified = cryptoOp.verifySignature(selectedFile, signatureToVerify, publicKey, "SHA256withRSA");
                    if (isVerified) {
                        outputTextArea.append("Signature Verified\n");
                    } else {
                        outputTextArea.append("Signature Verification Failed\n");
                    }
                } else {
                    outputTextArea.append("Please select a file and generate keys first\n");
                }

            }
        });

        hashButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedFile != null) {
                    byte[] hash = cryptoOp.computeHash(selectedFile, "SHA-256");
                    try {
                        Files.write(Paths.get(path+"hash.txt"), hash);
                        outputTextArea.append("File Hash: " + bytesToHex(hash) + "\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    outputTextArea.append("Please select a file first\n");
                }

            }
        });
    }
    

    private String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            lab8 app = new lab8();
            app.setVisible(true);
        });
    }

}


