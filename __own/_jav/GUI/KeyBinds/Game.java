package __own._jav.GUI.KeyBinds;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class Game {
    JFrame frame;
    JLabel label;
    Action UpAction;
    Action downAction;
    Action leftAction;
    Action rightAction;


    Game(){

        frame = new JFrame("KeyBind Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
      

        label = new JLabel();
        label.setBackground(Color.CYAN);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        UpAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP" /*w*/), "UpAction");
        label.getActionMap().put("UpAction",UpAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"/*s */), "downAction");
        label.getActionMap().put("downAction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"/*a */), "leftAction");
        label.getActionMap().put("leftAction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"/*d */), "rightAction");
        label.getActionMap().put("rightAction",rightAction);


        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
           label.setLocation(label.getX(), label.getY()-10);
            
        }

    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
            
        }

    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
            
        }

    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
            
        }

    }
}
