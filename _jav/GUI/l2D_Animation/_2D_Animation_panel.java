package _jav.GUI.l2D_Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _2D_Animation_panel extends JPanel  implements ActionListener{


    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    Image image;

    _2D_Animation_panel() {
        image = new ImageIcon("asd.png").getImage();
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        timer = new Timer(10,this);
        timer.start();  

    }

    public void paint(Graphics g ){

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, x, y, null);   
    } 



    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-image.getWidth(null)|| x<0){
            xVelocity = xVelocity * -1;
        }

       x = x + xVelocity;

    if(y>=PANEL_HEIGHT-image.getHeight(null)|| y<0){
        yVelocity = yVelocity * -1;
    }

   y = y + yVelocity;
       repaint();
    }
    
  

    
}
