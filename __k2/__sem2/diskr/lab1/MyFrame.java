package __k2.__sem2.diskr.lab1;

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
    JButton b_union;
    JButton b_intersection;
    JButton b_difference;
    JButton b_symmetrical_difference;
    JButton b_exit;
    JButton b_setArray;
    JLabel label;
    JTextArea textAreaA;
    JTextArea textAreaB;
    JTextArea textAreaResult;
    int[] a = {6, 7, 1, 9, 4, 2};
    int[] b = {5, 1, 7, 2, 4, 3}; 
    MyFrame () throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        b_union = new JButton();
        b_union.setBounds(0,0,125,50);
        b_union.addActionListener(this);
        b_union.setText("Union");
        b_union.setFocusable(false);
        b_union.setHorizontalTextPosition(JButton.CENTER);

        b_intersection = new JButton();
        b_intersection.setBounds(0,50,125,50);
        b_intersection.addActionListener(this);
        b_intersection.setText("Intersection");
        b_intersection.setFocusable(false);
        b_intersection.setHorizontalTextPosition(JButton.CENTER);

        b_difference = new JButton();
        b_difference.setBounds(0,100,125,50);
        b_difference.addActionListener(this);
        b_difference.setText("Difference");
        b_difference.setFocusable(false);
        b_difference.setHorizontalTextPosition(JButton.CENTER);

        b_symmetrical_difference = new JButton();
        b_symmetrical_difference.setBounds(0,150,125,50);
        b_symmetrical_difference.addActionListener(this);
        b_symmetrical_difference.setText("Symmetrical_difference");
        b_symmetrical_difference.setFocusable(false);
        b_symmetrical_difference.setHorizontalTextPosition(JButton.CENTER);
        b_symmetrical_difference.setFont(new Font("",Font.BOLD,8));

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
        textAreaResult.setBounds(150, 120, 200, 20);
       
        JLabel labelA = new JLabel("A");
        labelA.setBounds(150, 0, 20, 20);
        this.add(labelA);

        JLabel labelB = new JLabel("B");
        labelB.setBounds(150, 50, 20, 20);
        this.add(labelB);

        JLabel labelResult = new JLabel("Result");
        labelResult.setBounds(150, 100, 50, 20);
        this.add(labelResult);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(b_union);
        this.add(b_intersection);
        this.add(b_difference);
        this.add(b_symmetrical_difference);
        this.add(b_setArray);
        this.add(b_exit);
        this.add(textAreaA);
        this.add(textAreaB);
        this.add(textAreaResult);
        
           
    }
     
    public void setArray(JTextArea textAreaA, JTextArea textAreaB){
        String textA = textAreaA.getText();
        String[] numbersA = textA.split("\\s+"); 

         a = new int[numbersA.length];
        for (int i = 0; i < numbersA.length; i++) {
             a[i] = Integer.parseInt(numbersA[i]);
            }

        String textB = textAreaB.getText();
        String[] numbersB = textB.split("\\s+");

         b = new int[numbersB.length];
        for (int i = 0; i < numbersB.length; i++) {
             b[i] = Integer.parseInt(numbersB[i]);
            }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b_union){
            String outputres1 = "";
            String outputres2 = "";
            String outputres3 = "";
            int[] c = new int[a.length+b.length];
            for (int i = 0; i < c.length/2; i++) {
               c[i] = a[i];
               c[i+c.length/2] = b[i];
                outputres1 +=c[i] + " ";
                outputres2 += c[i+c.length/2] + " ";
            }
            textAreaResult.setText(outputres3 = outputres1+ outputres2);
        }
        if(e.getSource()==b_intersection){
            
            String outputres = "";
            if(a.length>b.length||a.length<b.length){
                outputres ="Enter more number";
            }
            else{
                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b.length; j++) {
                       if(a[i]==b[j]){
                          outputres += a[i]+" ";
                       }
                    }
                  }
            }
            textAreaResult.setText(outputres);
            
        }
        if(e.getSource()==b_difference){
            textAreaResult.setText(_lab1.difference(a, b).toString());
        }
        if(e.getSource()==b_symmetrical_difference){
  
            textAreaResult.setText(_lab1.symmetrical_difference(a, b).toString());
        }
        if(e.getSource()==b_setArray){
            setArray(textAreaA, textAreaB);
        }
        if(e.getSource()==b_exit){
            System.exit(0);
    }
        
    }
    
}
