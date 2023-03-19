package __own._jav.GUI.l2D_Animation;

import javax.swing.*;

public class _2D_Animation_frame extends JFrame {
    
    _2D_Animation_panel panel;
    _2D_Animation_frame(){
        panel = new _2D_Animation_panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);   
        this.setVisible(true);


    }


}
