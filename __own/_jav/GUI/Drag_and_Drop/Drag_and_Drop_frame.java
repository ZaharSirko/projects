package  __own._jav.GUI.Drag_and_Drop;

import javax.swing.JFrame;

public class Drag_and_Drop_frame extends JFrame {
    DragPanel DragPanel = new DragPanel();

    Drag_and_Drop_frame(){


        
        this.setTitle("Drag and Drop");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(DragPanel);

    }
}
