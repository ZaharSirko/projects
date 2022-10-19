package _jav.GUI.l2D_Graphics;

import javax.swing.*;
import java.awt.*;

public class _2D_Graphics_panel extends JPanel {

    Image image;
    _2D_Graphics_panel() {
        image = new ImageIcon("vova.png").getImage();
        this.setPreferredSize(new Dimension(500,500));

    }
    
    public void paint(Graphics g){

        Graphics2D g2d  = (Graphics2D) g;
        
        
        g2d.drawImage(image, 0, 0, null);
        g2d.setColor(Color.CYAN);
        //   g2d.setStroke(new BasicStroke(6));
        //g2d.drawLine(0, 0, 500, 500);
        // g2d.drawRect(0, 0, 200, 300);
        //  g2d.fillRect(0, 0, 200, 300);
        //  g2d.setPaint(Color.ORANGE);
        //  g2d.drawOval(0, 0, 200, 300);

       //   g2d.fillOval(0, 0, 200, 300);

        g2d.drawArc(0, 0,100, 100, 0, 180);
        g2d.fillArc(0, 0,100, 100, 0, 180);
         g2d.setPaint(Color.PINK);
         g2d.fillArc(0, 0,100, 100, 180, 180);

         int[] xPoints = {150,200,350};
        int[] yPoints = {250,100,250};
        g2d.setColor(Color.green);
        g2d.drawPolygon(xPoints, yPoints, 3);
         g2d.fillPolygon(xPoints, yPoints, 3);


       // g2d.setColor(Color.BLUE);   
       // g2d.setFont(new Font("Ink Free",Font.BOLD,30));
       // g2d.drawString("Hellow World XD", 50, 50);


   

    }


    
}
