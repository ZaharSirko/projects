package __k2.__sem2.diskr.lab4;
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
    JButton b_findGcd;
    JButton b_findLcm;
    JButton b_primeFactors;
    JButton b_findDivisors;
    JButton b_findCongruentMod;
    JButton b_exit;
    JLabel label;
    JTextArea textAreaA;
    JTextArea textAreaB;
    JTextArea textAreaResult;
    int a = 611;
    int b = 636;
    MyFrame () throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        b_findGcd = new JButton();
        b_findGcd.setBounds(0,0,125,50);
        b_findGcd.addActionListener(this);
        b_findGcd.setText("And");
        b_findGcd.setFocusable(false);
        b_findGcd.setHorizontalTextPosition(JButton.CENTER);

        b_findLcm = new JButton();
        b_findLcm.setBounds(0,50,125,50);
        b_findLcm.addActionListener(this);
        b_findLcm.setText("Or");
        b_findLcm.setFocusable(false);
        b_findLcm.setHorizontalTextPosition(JButton.CENTER);

        b_primeFactors = new JButton();
        b_primeFactors.setBounds(0,100,125,50);
        b_primeFactors.addActionListener(this);
        b_primeFactors.setText("Xor");
        b_primeFactors.setFocusable(false);
        b_primeFactors.setHorizontalTextPosition(JButton.CENTER);

        b_findDivisors = new JButton();
        b_findDivisors.setBounds(0,150,125,50);
        b_findDivisors.addActionListener(this);
        b_findDivisors.setText("Decard");
        b_findDivisors.setFocusable(false);
        b_findDivisors.setHorizontalTextPosition(JButton.CENTER);


        b_findCongruentMod = new JButton();
        b_findCongruentMod.setBounds(0,200,125,50);
        b_findCongruentMod.addActionListener(this);
        b_findCongruentMod.setText("SetArray");
        b_findCongruentMod.setFocusable(false);
        b_findCongruentMod.setHorizontalTextPosition(JButton.CENTER);

        
        b_exit = new JButton();
        b_exit.setBounds(0,250,125,50);
        b_exit.addActionListener(this);
        b_exit.setText("Exit");
        b_exit.setFocusable(false);
        b_exit.setHorizontalTextPosition(JButton.CENTER);
        
        textAreaA = new JTextArea();
        String outputA = "";
    
        for(int i = 0; i < a.length; i++) {
          outputA += a[i] + " ";
        }
        textAreaA.setText(outputA);
        textAreaA.setBounds(150, 20, 200, 20);
       

        textAreaB = new JTextArea();
        String outputB = "";
    
        for(int i = 0; i < b.length; i++) {
            outputB += b[i] + " ";
        }
        textAreaB.setText(outputB);
        textAreaB.setBounds(150, 70, 200, 20);


        textAreaResult = new JTextArea();
        textAreaResult.setBounds(150, 170, 200, 20);
       
        JLabel labelA = new JLabel("A");
        labelA.setBounds(150, 0, 20, 20);
        this.add(labelA);

        JLabel labelB = new JLabel("B");
        labelB.setBounds(150, 50, 20, 20);
        this.add(labelB);

        JLabel labelResult = new JLabel("Result");
        labelResult.setBounds(150, 150, 50, 20);
        this.add(labelResult);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(b_and);
        this.add(b_or);
        this.add(b_decard);
        this.add(b_xor);
        this.add(b_setArray);
        this.add(b_exit);
        this.add(textAreaA);
        this.add(textAreaB);
        this.add(textAreaResult);
        
           
    }
     
    public void setArray(JTextArea textAreaA, JTextArea textAreaB){
        String textA = textAreaA.getText();
        a = Integer.parseInt(textA);
        String textB = textAreaB.getText();
        b = Integer.parseInt(textB);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b_and){
           
             textAreaResult.setText("asd");
        }
        if(e.getSource()==b_exit){
            System.exit(0);
    }   
    }
}
    

