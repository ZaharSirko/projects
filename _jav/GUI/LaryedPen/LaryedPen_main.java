package _jav.GUI.LaryedPen;
import javax.swing.*;


import java.awt.*;

public class LaryedPen_main {

    public static void main(String[] args) {



        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(new Color(32,100,43));
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(new Color(22,50,32));
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(new Color(54,200,70));
        label3.setBounds(150,150,200,200);


        JLayeredPane layeredPane = new JLayeredPane(); 
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label1, Integer.valueOf(1));
        layeredPane.add(label2,Integer.valueOf(0));
        layeredPane.add(label3,Integer.valueOf(2));  //JLayeredPane.DRAG_LAYER




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
