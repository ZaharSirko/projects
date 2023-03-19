package __own._jav.GUI.Jbutton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
//import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MyFrame  extends JFrame implements ActionListener  {
    
    JButton button;
    JButton button2;
    JLabel label;
    Clip clip;
    MyFrame () throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {

            File file = new File("Glimpsing-Infinity-Asher-Fulero.wav");
            
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            clip =AudioSystem.getClip();

            clip.open(audioStream);

            
        ImageIcon image = new ImageIcon("D:\\Microsoft VS Code\\projects\\_jav\\GUI\\Jbutton\\asd.png");

        label = new JLabel();
        label.setIcon(image);
        label.setBounds(150,200,100,100);
        label.setVisible(false);



      button = new JButton();
      button.setBounds(85,85,238,85);
      button.addActionListener(this);  //button.addActionListener(e -> sout("asd")); 
      button.setText("POG");
      button.setFocusable(false);
      button.setIcon(image);
      button.setHorizontalTextPosition(JButton.CENTER);
      //button.setVerticalTextPosition(JButton.BOTTOM);
      button.setForeground(Color.BLUE);
      button.setFont(new Font("Comic Sans",Font.BOLD,25));
      button.setIconTextGap(-14);
      button.setBackground(Color.pink);
      //button.setBorder(BorderFactory.createEtchedBorder());



      button2 = new JButton();
      button2.setBounds(0,0,238,85);
      button2.addActionListener(this);  //button.addActionListener(e -> sout("asd")); 
      button2.setText("POG");
      button2.setFocusable(false);
      button2.setIcon(image);
      button2.setHorizontalTextPosition(JButton.CENTER);
      //button.setVerticalTextPosition(JButton.BOTTOM);
      button2.setForeground(Color.BLUE);
      button2.setFont(new Font("Comic Sans",Font.BOLD,25));
      button2.setIconTextGap(-14);
      button2.setBackground(Color.pink);
      button2.setVerticalAlignment(JButton.TOP);
      //button.setBorder(BorderFactory.createEtchedBorder());



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //button.setEnabled(false);  only once clickable
            label.setVisible(true);
            clip.start();

            
            
        }
        if(e.getSource()==button2){
            //button.setEnabled(false);  only once clickable
            label.setVisible(false);
            clip.stop();
            
            
        }

        
        
    }
    
}
