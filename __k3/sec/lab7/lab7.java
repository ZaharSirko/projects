package __k3.sec.lab7;
import javax.crypto.Cipher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;

public class lab7 extends JFrame {
    private JTextField lengthTextField;
    private JTextArea resultTextArea;
    private JButton generateButton, testButton;
    private SecureRandom secureRandom;
    private KeyPairGenerator keyPairGenerator;
    private RSAPublicKey publicKey;
    private RSAPrivateKey privateKey;
    Cipher cipher;

    public lab7() {
        setTitle("Pseudo Random Sequence Generator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(1, 2));
        inputPanel.add(new JLabel("Length:"));
        lengthTextField = new JTextField();
        inputPanel.add(lengthTextField);
        add(inputPanel, BorderLayout.NORTH);

        resultTextArea = new JTextArea();
        add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        generateButton = new JButton("Generate Sequence");
        testButton = new JButton("Run Tests");
        buttonPanel.add(generateButton);
        buttonPanel.add(testButton);
        add(buttonPanel, BorderLayout.SOUTH);

        secureRandom = new SecureRandom();

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateSequence();
            }
        });

        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runTests();
            }
        });

        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048, secureRandom); 
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            publicKey = (RSAPublicKey) keyPair.getPublic();
            privateKey = (RSAPrivateKey) keyPair.getPrivate();

            cipher = Cipher.getInstance("RSA");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void generateSequence() {
        try {
            String lengthStr = lengthTextField.getText();
    
            if (lengthStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the sequence length.");
                return;
            }
    
            int length = Integer.parseInt(lengthStr);
    
            StringBuilder sequence = new StringBuilder();
    
            for (int i = 0; i < length; i++) {
                byte[] randomBytes = secureRandom.generateSeed(1);
                int randomNumber = new java.math.BigInteger(randomBytes).intValue();
                int bit = Math.abs(randomNumber) % 2;
                sequence.append(bit);
            }
            if (sequence.length()>=246) {
                JOptionPane.showMessageDialog(this, "Entered the sequence length must be less then 246.");
                return;
            }
            String encryptedSequence = encryptString(sequence.toString());
            resultTextArea.setText(encryptedSequence);
    
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }

    private void runTests() {
        String encryptedSequence = resultTextArea.getText();

    if (encryptedSequence.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please generate a sequence first.");
        return;
    }
    String decryptedSequence = decryptString(encryptedSequence);
    int decryptedLength = decryptedSequence.length();
    resultTextArea.setText(decryptedSequence);
    int onesCount = decryptedSequence.replaceAll("0", "").length();
    int zerosCount = decryptedLength - onesCount;
        double cumulativeSumsTestPValue =  tests.calculateCumulativeSumsTestPValue(decryptedSequence);
        double frequencyTestPValue = tests.calculateFrequencyTestPValue(onesCount, zerosCount, decryptedLength);
        double runTestPValue = tests.calculateRunTestPValue(decryptedSequence);

        resultTextArea.append("\nFrequency Test (Test on the proportion of 1s):\n");
        resultTextArea.append("Ones count: " + onesCount + "\n");
        resultTextArea.append("Zeros count: " + zerosCount + "\n");
        resultTextArea.append("Frequency Test P-value: " + frequencyTestPValue + "\n\n");

        resultTextArea.append("Run Test (Test for sequence of consecutive identical bits):\n");
        resultTextArea.append("Run Test P-value: " + runTestPValue + "\n\n");

        resultTextArea.append("Cumulative Sums Test (Test for cumulative sums):\n");
        resultTextArea.append("Cumulative Sums Test P-value: " + cumulativeSumsTestPValue + "\n");

     
        tests.saveKeyToFile(encryptedSequence);
        tests.saveSequenceToFile(decryptedSequence);
        tests.saveTestResultsToFile(frequencyTestPValue, runTestPValue, cumulativeSumsTestPValue);
    }

    private String encryptString(String plainText) {
        try {
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private String decryptString(String encryptedText) {
        try {
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                lab7 generator = new lab7();
                generator.setVisible(true);
            }
        });
    }
}
