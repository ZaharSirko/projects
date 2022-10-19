package _jav.GUI.JColorChooser;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChooser_frame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChooser_frame() {
             Font font = new Font("MV Boli",Font.PLAIN,40);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            this.setLayout(new FlowLayout());


            button = new JButton("Pick color");
            button.addActionListener(this);

            label = new JLabel();
            label.setBackground(Color.white);
            label.setText("Some TEXT //|*.*|//");
            label.setFont(font);
            label.setOpaque(true );
    
    
    


            this.add(label);
            this.add(button);
            this.pack();
            this.setVisible(true);
        }


    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==button){
        new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Pick color", Color.black);
       // label.setForeground(color); 
        label.setBackground(color);
     }
        
    }
    

    }

