package __own._jav.GUI.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class BorderLayout_main {
    
    public static void main(String[] args) {

      

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel Dark_grey_panel = new JPanel();
       Dark_grey_panel.setBackground(Color.DARK_GRAY);
       Dark_grey_panel.setPreferredSize(new Dimension(100,100));
       

       JPanel green_panel = new JPanel();
       green_panel.setBackground(Color.GREEN);
       green_panel.setBounds(0,0,300,300);
       green_panel.setPreferredSize(new Dimension(100,100));

       JPanel pink_panel = new JPanel();
       pink_panel.setBackground(Color.PINK);
       pink_panel.setBounds(0,300,300,300);
       pink_panel.setPreferredSize(new Dimension(100,100));


       JPanel orange_panel = new JPanel();
       orange_panel.setBackground(Color.orange);
       orange_panel.setBounds(300,300,300,300);
       orange_panel.setPreferredSize(new Dimension(100,100));

       JPanel panel5 = new JPanel();
       panel5.setBackground(Color.MAGENTA);
       panel5.setPreferredSize(new Dimension(100,100));

       frame.add(green_panel,BorderLayout.NORTH);
       frame.add(orange_panel,BorderLayout.WEST);
       frame.add(Dark_grey_panel,BorderLayout.SOUTH);
       frame.add(pink_panel,BorderLayout.CENTER); 
       frame.add(panel5,BorderLayout.EAST);

    }
}
