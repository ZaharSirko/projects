package _jav.GUI.l2D_Graphics;

import javax.swing.*;

public class _2D_Graphics_frame extends JFrame {
    
    _2D_Graphics_panel panel;
    _2D_Graphics_frame(){
        panel = new _2D_Graphics_panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);   
        this.setVisible(true);


    }


}
