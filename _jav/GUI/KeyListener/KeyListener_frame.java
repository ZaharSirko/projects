package _jav.GUI.KeyListener;
//import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class KeyListener_frame extends JFrame implements KeyListener{
    
    JLabel label;
    ImageIcon image;

    KeyListener_frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(500,500);  
        this.setLayout(null);

        image = new ImageIcon("D:\\Microsoft VS Code\\projects\\_jav\\GUI\\KeyListener\\asd.png");

        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
       // label.setBackground(Color.ORANGE);
       // label.setOpaque(true);
        label.setIcon(image);
        


        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a' : label.setLocation(label.getX()-10, label.getY());
            break;
            case 'w' : label.setLocation(label.getX(), label.getY()-10);
            break;
            case 's' : label.setLocation(label.getX(), label.getY()+10);
            break;
            case 'd' : label.setLocation(label.getX()+10, label.getY());
            break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("U released key char "+ e.getKeyChar());
        System.out.println("U released key code "+ e.getKeyCode());
        switch(e.getKeyCode()){
        case 37 : label.setLocation(label.getX()-10, label.getY());
        break;
        case 38 : label.setLocation(label.getX(), label.getY()-10);
        break;
        case 39 : label.setLocation(label.getX()+10, label.getY());
        break;
        case 40 : label.setLocation(label.getX(), label.getY()+10);
        break;
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {

        
    }

 
}
