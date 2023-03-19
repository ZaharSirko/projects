package __own._jav.GUI.MouseListener;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class MouseListener_frame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon image;
    MouseListener_frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(500,500);  
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.PINK);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
        
    } 

    @Override
    public void mouseClicked(MouseEvent e) {
      System.out.println("Click");
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Enter");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("EXIT");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       System.out.println("Pressed");
       label.setBackground(Color.BLUE);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Realesed");
        label.setBackground(Color.black);
        
    }
    
}
