package _jav.GUI.JCheckBox;


import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox_MyFrame extends JFrame implements ActionListener {
    JTextField textField ;
    JButton button;
    JCheckBox checkBox;
    ImageIcon image,image2;
    CheckBox_MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        image =new ImageIcon("D:\\Microsoft VS Code\\projects\\GUI\\JCheckBox\\asd (1).png");
        image2 =new ImageIcon("D:\\Microsoft VS Code\\projects\\GUI\\JCheckBox\\asd (2).png");


        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I`m not volodia");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
        checkBox.setIcon(image);
        checkBox.setSelectedIcon(image2);

 
        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button){
       System.out.println( checkBox.isSelected());
        

       }
        
    }


    
}
