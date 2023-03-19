package __own._jav.GUI.JFrame;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
public class JFrame_my_frame extends JFrame {
  
    JFrame_my_frame(){
        this.setTitle("ASD"); // title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on application
        this.setSize(420,420);  //set x y
        this.setResizable(false); // can`t change sire
        this.setVisible(true); // set visible
    
        ImageIcon image = new ImageIcon("D:\\Microsoft VS Code\\projects\\_jav\\GUI\\JFrame\\280.png");  // create   ImageIcon

        this.setIconImage(image.getImage());  // change icon of this
    
       // this.getContentPane().setBackground(Color.pink);  // change bg color
    
       this.getContentPane().setBackground(new Color(50,7,76)); // OxFFFFFF ...
}
}
