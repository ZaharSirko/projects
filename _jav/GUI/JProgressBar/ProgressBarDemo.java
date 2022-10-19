package _jav.GUI.JProgressBar;
import javax.swing.*;
import java.awt.*;
public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo(){
        Font font = new Font("MV Boli",Font.PLAIN,20);


        bar.setValue(0);
        bar.setBounds(0,0,500,50);
        bar.setStringPainted(true);
        bar.setFont(font);
        bar.setForeground(Color.ORANGE);
        bar.setBackground(Color.BLACK);
        
    
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(bar);


        fill();
    }
    public void fill() {
        int counter = 0;
        while(counter<=100){
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=1;

        }
        bar.setString("Done: |*/*|");
            
    }

    
}
