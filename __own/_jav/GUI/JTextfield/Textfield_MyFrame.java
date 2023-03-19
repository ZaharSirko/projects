package __own._jav.GUI.JTextfield;


import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Textfield_MyFrame extends JFrame implements ActionListener {
    JTextField textField ;
    JButton button;
    Textfield_MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,50));
        textField.setFont(new Font("Consolas",Font.PLAIN,25));
        textField.setForeground(new Color(200,100,75));
        textField.setBackground(new Color(20,100,75));
        textField.setCaretColor( Color.white);
        textField.setText("asdas");
       // textField.setEditable(false);

        button = new JButton("Submit");
        button.addActionListener(this);
 
        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button){
        System.out.println("HI "+textField.getText());

       }
        
    }


    
}
