package _jav.GUI.open_new_GUI_window;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class New_window {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hi");
    New_window(){

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(label);
    }
}
