package _jav.GUI.JMenuBar;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class MenuBar_frame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu EditMenu;
    JMenu HelpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    MenuBar_frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(420,420);  
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        EditMenu = new JMenu("Edit");
        HelpMenu = new JMenu("Help");

       loadItem = new JMenuItem("Load");
       saveItem = new JMenuItem("Save");
       exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

       // loadItem.setIcon(defaultIcon);


        
        fileMenu.setMnemonic(KeyEvent.VK_F);  // Alt + f for file
        EditMenu.setMnemonic(KeyEvent.VK_E);  // Alt + e for edit
        HelpMenu.setMnemonic(KeyEvent.VK_H);  // Alt + h for help

        loadItem.setMnemonic(KeyEvent.VK_L);  // l for load
        saveItem.setMnemonic(KeyEvent.VK_S);  // s for load
        exitItem.setMnemonic(KeyEvent.VK_E);  // e for load



        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(EditMenu);
        menuBar.add(HelpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource()==loadItem){
            System.out.println("U load item");

        }
        if(e.getSource()==saveItem){
            System.out.println("U save item");

        }
        if(e.getSource()==exitItem){
            System.exit(0);

        }
    }
    
}
