package __k2.__sem2.diskr.lab3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MyFrame  extends JFrame implements ActionListener  {
    JTextField textField ;
    JButton b_isReflexive;
    JButton b_isAntiReflexive;
    JButton b_isSymmetrical;
    JButton b_isAntiSymmetrical;
    JButton b_exit;
    JButton b_setArray;
    JLabel label;
    JTextArea textAreaBooleanMatrix;
    JTextArea textAreaResult;
    int[][] booleanMatrix = {
        { 1,  1,  1,  0,  1},
        { 0,  1,  1,  0 , 0},
        { 0,  0,  1,  0,  0},
        { 0,  0,  1,  1 , 1},
        { 1,  1,  0,  0,  1}
         };
    MyFrame () throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        b_isReflexive = new JButton();
        b_isReflexive.setBounds(0,0,125,50);
        b_isReflexive.addActionListener(this);
        b_isReflexive.setText("isReflexive");
        b_isReflexive.setFocusable(false);
        b_isReflexive.setHorizontalTextPosition(JButton.CENTER);

        b_isAntiReflexive = new JButton();
        b_isAntiReflexive.setBounds(0,50,125,50);
        b_isAntiReflexive.addActionListener(this);
        b_isAntiReflexive.setText("isAntiReflexive");
        b_isAntiReflexive.setFocusable(false);
        b_isAntiReflexive.setHorizontalTextPosition(JButton.CENTER);

        b_isSymmetrical = new JButton();
        b_isSymmetrical.setBounds(0,100,125,50);
        b_isSymmetrical.addActionListener(this);
        b_isSymmetrical.setText("isSymmetrical");
        b_isSymmetrical.setFocusable(false);
        b_isSymmetrical.setHorizontalTextPosition(JButton.CENTER);

        b_isAntiSymmetrical = new JButton();
        b_isAntiSymmetrical.setBounds(0,150,125,50);
        b_isAntiSymmetrical.addActionListener(this);
        b_isAntiSymmetrical.setText("isAntiSymmetrical");
        b_isAntiSymmetrical.setFocusable(false);
        b_isAntiSymmetrical.setHorizontalTextPosition(JButton.CENTER);

        b_setArray = new JButton();
        b_setArray.setBounds(0,200,125,50);
        b_setArray.addActionListener(this);
        b_setArray.setText("SetArray");
        b_setArray.setFocusable(false);
        b_setArray.setHorizontalTextPosition(JButton.CENTER);

        b_exit = new JButton();
        b_exit.setBounds(0,250,125,50);
        b_exit.addActionListener(this);
        b_exit.setText("Exit");
        b_exit.setFocusable(false);
        b_exit.setHorizontalTextPosition(JButton.CENTER);
        
        textAreaBooleanMatrix = new JTextArea();
        String outputBooleanMatrix = "";
    
        for(int i = 0; i < booleanMatrix.length; i++) {
            for (int j = 0; j < booleanMatrix.length; j++) {
                outputBooleanMatrix += booleanMatrix[i][j] + " ";
            }
            outputBooleanMatrix += "\n";
        }
        textAreaBooleanMatrix.setText(outputBooleanMatrix);
        textAreaBooleanMatrix.setBounds(150, 20, 100, 100);
        
       

        textAreaResult = new JTextArea();
        textAreaResult.setBounds(150, 170, 200, 20);
       
        JLabel labelA = new JLabel("BooleanMatrix");
        labelA.setBounds(150, 0, 100, 20);
        this.add(labelA);


        JLabel labelResult = new JLabel("Result");
        labelResult.setBounds(150, 150, 50, 20);
        this.add(labelResult);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(b_isAntiReflexive);
        this.add(b_isAntiSymmetrical);
        this.add(b_isReflexive);
        this.add(b_isSymmetrical);
        this.add(b_setArray);
        this.add(b_exit);
        this.add(textAreaBooleanMatrix);
        this.add(textAreaResult);
        
           
    }
     
    public void setArray(JTextArea textAreaBooleanMatrix){
        String text = textAreaBooleanMatrix.getText().toString();
        String[] rows = text.split("\n");
         booleanMatrix = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(" ");
            booleanMatrix[i] = new int[cols.length];
            for (int j = 0; j < cols.length; j++) {
                booleanMatrix[i][j] = Integer.parseInt(cols[j]);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b_isAntiReflexive){
             textAreaResult.setText( String.valueOf(_lab3.isAntiReflexive(booleanMatrix)));
        }
        if(e.getSource()==b_isAntiSymmetrical){
            
           
            textAreaResult.setText(String.valueOf(_lab3.isAntiSymmetrical(booleanMatrix)));
            
        }
        if(e.getSource()==b_isReflexive){
            textAreaResult.setText(String.valueOf(_lab3.isReflexive(booleanMatrix)));
        }
        if(e.getSource()==b_isSymmetrical){
            textAreaResult.setText(String.valueOf(_lab3.isSymmetrical(booleanMatrix)));
        }
        if(e.getSource()==b_setArray){
            setArray(textAreaBooleanMatrix);
        }
        if(e.getSource()==b_exit){
            System.exit(0);
    }
        
    }
    
}
