
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;


public class lab6 {

    private JTextField inputFileTextField;
    private JTextArea messageTextArea;
    private JTextArea hashResultTextArea;
    private JTextField bitPositionField;
    private JTextField roundsField;
    private JTextArea avalancheResultTextArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Crypto Hash App");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Вибір файлу та завантаження повідомлення
        JLabel inputFileLabel = new JLabel("Input File:");
        JTextField inputFileTextField = new JTextField();
        inputFileLabel.setBounds(20, 20, 100, 25);
        inputFileTextField.setBounds(130, 20, 200, 25);
        JButton browseButton = new JButton("Browse");
        browseButton.setBounds(340, 20, 80, 25);
        frame.add(inputFileLabel);
        frame.add(inputFileTextField);
        frame.add(browseButton);

        // Відображення та обчислення хешу повідомлення
        JLabel messageLabel = new JLabel("Message:");
        JTextArea messageTextArea = new JTextArea();
        messageLabel.setBounds(20, 60, 100, 25);
        messageTextArea.setBounds(130, 60, 300, 150);
        messageTextArea.setLineWrap(true);
        JLabel hashResultLabel = new JLabel("Hash Result:");
        JTextArea hashResultTextArea = new JTextArea();
        hashResultLabel.setBounds(20, 220, 100, 25);
        hashResultTextArea.setBounds(130, 220, 300, 150);
        hashResultTextArea.setLineWrap(true);
        JButton calculateHashButton = new JButton("Calculate Hash");
        calculateHashButton.setBounds(20, 380, 150, 25);
        frame.add(messageLabel);
        frame.add(messageTextArea);
        frame.add(hashResultLabel);
        frame.add(hashResultTextArea);
        frame.add(calculateHashButton);

        // Дослідження лавинного ефекту
        JLabel bitPositionLabel = new JLabel("Bit Position:");
        JTextField bitPositionField = new JTextField();
        bitPositionLabel.setBounds(20, 420, 100, 25);
        bitPositionField.setBounds(130, 420, 50, 25);
        JLabel roundsLabel = new JLabel("Rounds:");
        JTextField roundsField = new JTextField();
        roundsLabel.setBounds(190, 420, 60, 25);
        roundsField.setBounds(260, 420, 50, 25);
        JLabel avalancheResultLabel = new JLabel("Avalanche Result:");
        JTextArea avalancheResultTextArea = new JTextArea();
        avalancheResultLabel.setBounds(20, 460, 150, 25);
        avalancheResultTextArea.setBounds(180, 460, 250, 100);
        avalancheResultTextArea.setLineWrap(true);
        avalancheResultTextArea.setEditable(false);
        JButton analyzeAvalancheButton = new JButton("Analyze Avalanche");
        analyzeAvalancheButton.setBounds(20, 580, 150, 25);
        frame.add(bitPositionLabel);
        frame.add(bitPositionField);
        frame.add(roundsLabel);
        frame.add(roundsField);
        frame.add(analyzeAvalancheButton);
        frame.add(avalancheResultLabel);
        frame.add(avalancheResultTextArea);

      
        JButton plotGraphButton = new JButton("Plot Graph");
        plotGraphButton.setBounds(200, 580, 100, 25);
        frame.add(plotGraphButton);


    
  

        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
                int returnVal = fileChooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    inputFileTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                        StringBuilder text = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            text.append(line);
                        }
                        messageTextArea.setText(text.toString());
                        reader.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        calculateHashButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = messageTextArea.getText();
                try {
                    byte[] textBytes = text.getBytes("UTF-8");
                    MessageDigest digest = MessageDigest.getInstance("SHA-256");
                    byte[] hashBytes = digest.digest(textBytes);
                    String hashHex = bytesToHex(hashBytes);
                    hashResultTextArea.setText(hashHex);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        analyzeAvalancheButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = messageTextArea.getText();
                int bitPosition = Integer.parseInt(bitPositionField.getText());
                int rounds = Integer.parseInt(roundsField.getText());
                
                AvalancheEffectAnalyzer analyzer = new AvalancheEffectAnalyzer(text, bitPosition, rounds);
                analyzer.analyze();
                int[] bitChangesPerRound = analyzer.getBitChangesPerRound();
                avalancheResultTextArea.setText("Bit Changes per Round: " + Arrays.toString(bitChangesPerRound));

                analyzer.saveAnalysisDataToFile("D://Microsoft VS Code//projects//__k3//sec//lab6//avalanche_data.csv");
            }
        });


        plotGraphButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filename = "D://Microsoft VS Code//projects//__k3//sec//lab6//avalanche_data.csv"; 
                DefaultCategoryDataset dataset = createDatasetFromCSV(filename);
                JFreeChart chart = ChartBuilder.createChart(dataset, "Avalanche Effect Analysis", "Round", "Bit Changes");
                Component[] components = frame.getContentPane().getComponents();
                for (Component component : components) {
                    if (component instanceof ChartPanel) {
                        ChartPanel chartPanel = (ChartPanel) component;
                        chartPanel.setChart(chart);
                        chartPanel.revalidate();
                        frame.repaint(); 
                        return; 
                    }
                }
                ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
                chartPanel.setBounds(500, 20, 800, 600);
                frame.setSize(1350, 750);
                frame.add(chartPanel);
                frame.revalidate();
                frame.repaint(); 
            }
        });
        
        

        frame.setSize(550, 750);
        frame.setVisible(true);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    private static DefaultCategoryDataset createDatasetFromCSV(String filename) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    int round = Integer.parseInt(data[0]);
                    int bitChanges = Integer.parseInt(data[1]);
                    dataset.addValue(bitChanges, "Bit Changes", String.valueOf(round));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
        return dataset;
    }
       
}
