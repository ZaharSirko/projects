package _jav.GUI.JRadioBox;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;


public class RadioBox_MyFrame extends JFrame implements ActionListener {
    JRadioButton play;
    JRadioButton stop;
    JRadioButton restart;
    JButton button;
    Clip clip;
    RadioBox_MyFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException{



        File file = new File("Glimpsing-Infinity-Asher-Fulero.wav");
            
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            clip =AudioSystem.getClip();

            clip.open(audioStream);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());


        play = new JRadioButton("Play");
        stop = new JRadioButton("Stop");
        restart = new JRadioButton("Restart");

        ButtonGroup group = new ButtonGroup();
        group.add(stop);
        group.add(play);
        group.add(restart);


        play.addActionListener(this);
        stop.addActionListener(this);
        restart.addActionListener(this);


     

        this.add(play);
        this.add(stop);
        this.add(restart);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            System.out.println("play");
            clip.start();
        }
       else if(e.getSource()==stop){
        System.out.println("stop");
            clip.stop();
            
        }
       else if(e.getSource()==restart){
        System.out.println("restart");
            clip.setMicrosecondPosition(0);
            
        }
   
        
    }


    
}
