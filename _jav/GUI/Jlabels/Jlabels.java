package _jav.GUI.Jlabels;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Jlabels {

    public static void main(String[] args) {
      
        ImageIcon image = new ImageIcon("D:\\Microsoft VS Code\\projects\\GUI\\Jlabels\\BOGDAT.jpg");

        Border border = BorderFactory.createLineBorder(Color.GREEN); // create border
      JLabel label = new JLabel();
      label.setText("BOGDAT  RECOMMENDS"); // Set text of label
      label.setIcon(image);
      label.setHorizontalTextPosition(JLabel.CENTER);  // set tex LEFT, CENTER, RIGHT of imageicon
      label.setVerticalTextPosition(JLabel.BOTTOM); // set text TOP BOTTOM OR CENTER of imageicon
      label.setForeground(new Color(32,54,81));  // set font color of text 
      label.setFont(new Font("MV Boli",Font.PLAIN,20));  // set font of text
      label.setIconTextGap(0);  //set gap of text to image
      label.setBackground(Color.BLACK); // set bg color
      label.setOpaque(true); // display bg color 
      label.setBorder(border); // set border
      label.setVerticalAlignment(JLabel.TOP); // set vertical position of text+imageicon  within label
      label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text+imageicon  within label
      //label.setBounds(0, 0, 800, 800); // set x y position within frame as well as dimensions

        JFrame frame = new JFrame();
       // frame.setSize(900,900);
        //frame.setLayout(null);
        frame.setTitle("BOGDAT.JAVA");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setIconImage(image.getImage());  // change icon of frame
        frame.pack(); // alway to the end of frames
    
}
}
