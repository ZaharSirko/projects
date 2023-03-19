package __own._jav.GUI.JPanel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Jpanel_ {
    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("D:\\Microsoft VS Code\\projects\\_jav\\GUI\\JPanel\\104.jpg");


        JLabel label = new JLabel();
        label.setText("Hellow");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,300,250);

       JPanel Dark_grey_panel = new JPanel();
       Dark_grey_panel.setBackground(Color.DARK_GRAY);
       Dark_grey_panel.setBounds(300,0,300,300);
       

       JPanel green_panel = new JPanel();
       green_panel.setBackground(Color.GREEN);
       green_panel.setBounds(0,0,300,300);
       

       JPanel pink_panel = new JPanel();
       pink_panel.setBackground(Color.PINK);
       pink_panel.setBounds(0,300,300,300);
      // pink_panel.setLayout(new BorderLayout());
      pink_panel.setLayout(null);

       JPanel orange_panel = new JPanel();
       orange_panel.setBackground(Color.orange);
       orange_panel.setBounds(300,300,300,300);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
         frame.setSize(900,900);
         frame.setVisible(true);

         pink_panel.add(label);
         frame.add(Dark_grey_panel);
         frame.add(green_panel);
         frame.add(pink_panel);
         frame.add(orange_panel);
    }
}
