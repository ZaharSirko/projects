package __k2.__sem2.diskr.lab2;
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
    JButton b_and;
    JButton b_or;
    JButton b_xor;
    JButton b_decard;
    JButton b_exit;
    JButton b_setArray;
    JLabel label;
    JTextArea textAreaA;
    JTextArea textAreaB;
    JTextArea textAreaU;
    JTextArea textAreaResult;
    int[] u = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] a = {2, 7, 8, 5, 1, 9};
    int[] b = {1, 2, 4, 5, 9, 6};
    MyFrame () throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        b_and = new JButton();
        b_and.setBounds(0,0,125,50);
        b_and.addActionListener(this);
        b_and.setText("And");
        b_and.setFocusable(false);
        b_and.setHorizontalTextPosition(JButton.CENTER);

        b_or = new JButton();
        b_or.setBounds(0,50,125,50);
        b_or.addActionListener(this);
        b_or.setText("Or");
        b_or.setFocusable(false);
        b_or.setHorizontalTextPosition(JButton.CENTER);

        b_xor = new JButton();
        b_xor.setBounds(0,100,125,50);
        b_xor.addActionListener(this);
        b_xor.setText("Xor");
        b_xor.setFocusable(false);
        b_xor.setHorizontalTextPosition(JButton.CENTER);

        b_decard = new JButton();
        b_decard.setBounds(0,150,125,50);
        b_decard.addActionListener(this);
        b_decard.setText("Decard");
        b_decard.setFocusable(false);
        b_decard.setHorizontalTextPosition(JButton.CENTER);


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

        textAreaU = new JTextArea();
        String outputU = "";
    
        for(int i = 0; i < u.length; i++) {
            outputU += u[i] + " ";
        }
        textAreaU.setText(outputU);
        textAreaU.setBounds(150, 120, 200, 20);

        textAreaResult = new JTextArea();
        textAreaResult.setBounds(150, 170, 200, 20);
       
        JLabel labelA = new JLabel("A");
        labelA.setBounds(150, 0, 20, 20);
        this.add(labelA);

        JLabel labelB = new JLabel("B");
        labelB.setBounds(150, 50, 20, 20);
        this.add(labelB);

        JLabel labelU = new JLabel("U");
        labelU.setBounds(150, 100, 20, 20);
        this.add(labelU);


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
        this.add(textAreaU);
        this.add(textAreaResult);
        
           
    }
     
    public void setArray(JTextArea textAreaA, JTextArea textAreaB,JTextArea textAreaU){
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

            String textU = textAreaU.getText();
        String[] numbersU = textU.split("\\s+");

         u = new int[numbersU.length];
        for (int i = 0; i < numbersU.length; i++) {
             u[i] = Integer.parseInt(numbersU[i]);
            }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b_and){
           
             textAreaResult.setText(_lab2.and(_lab2.tobits(u, a), _lab2.tobits(u, b)));
        }
        if(e.getSource()==b_or){
            
           
            textAreaResult.setText(_lab2.or(_lab2.tobits(u, a), _lab2.tobits(u, b)));
            
        }
        if(e.getSource()==b_xor){
            textAreaResult.setText(_lab2.xor(_lab2.tobits(u, a), _lab2.tobits(u, b)));
        }
        if(e.getSource()==b_decard){
        textAreaResult.setBounds(150, 170, 200, 200);
        String operation = "";
        String bits1 = _lab2.tobits(u, a) ;
        String bits2 = _lab2.tobits(u, b);
        char[] a = bits1.toCharArray();
        char[] b = bits2.toCharArray();
         char[][] bit = new char[a.length][b.length];
         for (int i = 0; i < bit.length; i++) {
            for (int j = 0; j < bit.length; j++) {
                operation+=(a[i]+" "+b[j]+" ");
            }
            operation+="\n";
         }
            textAreaResult.setText(operation);
        }
        if(e.getSource()==b_setArray){
            setArray(textAreaA, textAreaB,textAreaU);
        }
        if(e.getSource()==b_exit){
            System.exit(0);
    }
        
    }
    
}
