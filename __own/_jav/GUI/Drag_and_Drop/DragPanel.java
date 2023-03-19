package  __own._jav.GUI.Drag_and_Drop;
import java.awt.*;
import java.awt.Point;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;




public class DragPanel extends JPanel {
   // ImageIcon image = new ImageIcon("D:\\Microsoft VS Code\\projects\\GUI\\JPanel\\104.jpg");
    ImageIcon image = new ImageIcon("asd.png");
    final int width = image.getIconWidth();
    final int height = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel(){

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
       

    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed (MouseEvent e){
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){

            Point currentPoint = e.getPoint();
            imageCorner.translate((int)(currentPoint.getX()-prevPt.getX()), 
                                  (int)(currentPoint.getY()-prevPt.getY())
                                  );
            prevPt= currentPoint;
            repaint();

        }
        
    }
    
}
