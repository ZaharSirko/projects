package __own._jav.GUI.MouseListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MouseListener_frame2 extends JFrame implements MouseListener {


    JLabel label;
    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;
    MouseListener_frame2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(500,500);  
        this.setLayout(new FlowLayout());
 
        
        this.setLocationRelativeTo(null);

        label = new JLabel();
        label.addMouseListener(this);

        image1 =new ImageIcon("D:\\Microsoft VS Code\\projects\\_jav\\GUI\\JCheckBox\\asd (1).png");
        image2 =new ImageIcon("D:\\Microsoft VS Code\\projects\\_jav\\GUI\\JCheckBox\\asd (2).png");
        image3 = new ImageIcon("vova.png");
        label.setIcon(image3);

        this.add(label);
        this.pack();
        this.setVisible(true);
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(image1);
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(image3);
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(image2);
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
        
    } 
}
