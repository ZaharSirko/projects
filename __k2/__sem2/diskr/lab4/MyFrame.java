package __k2.__sem2.diskr.lab4;
import java.awt.Font;
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
    JButton b_primeNumbers;
    JButton b_findCongruentMod;
    JButton b_exit;
    JLabel label;
    JTextArea textAreaA;
    JTextArea textAreaB;
    JTextArea textAreaResult;
    JTextArea textAreaResultB;
    JLabel labelResultB;
    Integer a = 611;
    Integer b = 636;
    MyFrame () throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        b_findGcd = new JButton();
        b_findGcd.setBounds(0,0,125,50);
        b_findGcd.addActionListener(this);
        b_findGcd.setText("findGcd");
        b_findGcd.setFocusable(false);
        b_findGcd.setHorizontalTextPosition(JButton.CENTER);

        b_findLcm = new JButton();
        b_findLcm.setBounds(0,50,125,50);
        b_findLcm.addActionListener(this);
        b_findLcm.setText("findLcm");
        b_findLcm.setFocusable(false);
        b_findLcm.setHorizontalTextPosition(JButton.CENTER);

        b_primeFactors = new JButton();
        b_primeFactors.setBounds(0,100,125,50);
        b_primeFactors.addActionListener(this);
        b_primeFactors.setText("primeFactors");
        b_primeFactors.setFocusable(false);
        b_primeFactors.setHorizontalTextPosition(JButton.CENTER);

        b_findDivisors = new JButton();
        b_findDivisors.setBounds(0,150,125,50);
        b_findDivisors.addActionListener(this);
        b_findDivisors.setText("findDivisors");
        b_findDivisors.setFocusable(false);
        b_findDivisors.setHorizontalTextPosition(JButton.CENTER);

        b_primeNumbers = new JButton();
        b_primeNumbers.setBounds(0,200,125,50);
        b_primeNumbers.addActionListener(this);
        b_primeNumbers.setText("primeNumbers");
        b_primeNumbers.setFocusable(false);
        b_primeNumbers.setHorizontalTextPosition(JButton.CENTER);


        b_findCongruentMod = new JButton();
        b_findCongruentMod.setBounds(0,250,125,50);
        b_findCongruentMod.addActionListener(this);
        b_findCongruentMod.setText("findCongruentMod");
        b_findCongruentMod.setFocusable(false);
        b_findCongruentMod.setHorizontalTextPosition(JButton.CENTER);
        b_findCongruentMod.setFont(new Font("",Font.BOLD,10));

        
        b_exit = new JButton();
        b_exit.setBounds(0,300,125,50);
        b_exit.addActionListener(this);
        b_exit.setText("Exit");
        b_exit.setFocusable(false);
        b_exit.setHorizontalTextPosition(JButton.CENTER);
        
        textAreaA = new JTextArea();
        String outputA = a.toString();
        textAreaA.setText(outputA);
        textAreaA.setBounds(150, 20, 200, 20);
       

        textAreaB = new JTextArea();
        String outputB = b.toString();
        textAreaB.setText(outputB);
        textAreaB.setBounds(150, 70, 200, 20);


        textAreaResult = new JTextArea();
        textAreaResult.setBounds(150, 110, 225, 20);
        textAreaResult.setLineWrap(true);
        textAreaResult.setWrapStyleWord(true);

        textAreaResultB = new JTextArea();
        textAreaResultB.setBounds(400, 110, 225, 20);
        textAreaResultB.setLineWrap(true);
        
       
        JLabel labelA = new JLabel("A");
        labelA.setBounds(150, 0, 20, 20);
        this.add(labelA);

        JLabel labelB = new JLabel("B");
        labelB.setBounds(150, 50, 20, 20);
        this.add(labelB);

        JLabel labelResult = new JLabel("Result");
        labelResult.setBounds(150, 90, 50, 20);
        this.add(labelResult);

        labelResultB = new JLabel("Result B");
        labelResultB.setBounds(400, 90, 50, 20);
        this.add(labelResultB);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,450);
        this.setVisible(true);
        this.add(b_findLcm);
        this.add(b_findGcd);
        this.add(b_findDivisors);
        this.add(b_findCongruentMod);
        this.add(b_primeFactors);
        this.add(b_primeNumbers);
        this.add(b_exit);
        this.add(textAreaA);
        this.add(textAreaB);
        this.add(textAreaResult);
        this.add(textAreaResultB);

    }
     
    public void setValues(JTextArea textAreaA, JTextArea textAreaB){
        String textA = textAreaA.getText();
        a = Integer.parseInt(textA);
        String textB = textAreaB.getText();
        b = Integer.parseInt(textB);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() != null){
            setValues(textAreaA,textAreaB);
        }
        if(e.getSource()==b_findGcd){
             textAreaResult.setText(_lab4.findGcd(a, b).toString());
        }
        if(e.getSource()==b_findLcm){
           
            textAreaResult.setText(_lab4.findLcm(a, b).toString());
       }
       if(e.getSource()==b_findDivisors){
        textAreaResult.setText(_lab4.findDivisors(a));
        textAreaResultB.setText(_lab4.findDivisors(b));
   }
   else if(e.getSource()!=b_findDivisors && e.getSource()!=b_primeNumbers){
    textAreaResultB.setText(" ");
   }
   if(e.getSource()==b_primeFactors){
           
    textAreaResult.setText(_lab4.primeFactors(a));
}
if(e.getSource()==b_primeNumbers){
    textAreaResult.setBounds(150, 110, 200, 250);
    textAreaResultB.setBounds(400, 110, 200, 250);
    textAreaResult.setText(_lab4.primeNumbers(a));
    textAreaResultB.setText(_lab4.primeNumbers(b));
}
else if(e.getSource()!=b_primeNumbers) {
    textAreaResult.setBounds(150, 110, 225, 20);
    textAreaResultB.setBounds(400, 110, 225, 20);
}
if(e.getSource()==b_findCongruentMod){
           
    textAreaResult.setText(_lab4.findCongruentMod(a, b).toString());
}
        if(e.getSource()==b_exit){
            System.exit(0);
    }   
    }
}
    

