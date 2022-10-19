package _jav.GUI.JSlider;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
public class slider_demo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    slider_demo(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        Font font = new Font("MV Boli",Font.PLAIN,20);

        slider = new JSlider(0,100,50);  // min,max,start pos
        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTrack(true);
        slider.setMinorTickSpacing(10);
        
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(font);

        slider.setOrientation(SwingConstants.VERTICAL);
        //slider.setOrientation(SwingConstants.HORIZONTAL);

        slider.addChangeListener(this);

        label.setText("%c= "+slider.getValue());
        label.setFont(font);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("%c= "+slider.getValue());
        
    }
}
