package _jav.GUI.JComboBox;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class ComboBox_MyFrame extends JFrame implements ActionListener {
    
    JComboBox comboBox ;
    
    ComboBox_MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
 


        String[] animals = {"Cat","Dog","Bird"};
    
        comboBox  = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Penguin");

        //comboBox.insertItemAt("Lion", 0);
        //comboBox.setSelectedIndex(0);

        //comboBox.removeItem("Cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAll();


    
        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== comboBox){
            System.out.println(comboBox.getSelectedItem());
           // System.out.println(comboBox.getSelectedIndex());


        }

        
    }


    
}
