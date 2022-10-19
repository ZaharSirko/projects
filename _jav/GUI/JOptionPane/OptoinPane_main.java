package _jav.GUI.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptoinPane_main {
    
    public static void main(String[] args) {


       // JOptionPane.showMessageDialog(null, "Some txt", "title", JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Some txt", "title", JOptionPane.INFORMATION_MESSAGE);  // !
        // JOptionPane.showMessageDialog(null, "Some txt", "title", JOptionPane.QUESTION_MESSAGE);       // ?
      //  while(true){
       //     JOptionPane.showMessageDialog(null, "Some VIRUS!", "title", JOptionPane.WARNING_MESSAGE);   !
      //  }
     //  JOptionPane.showMessageDialog(null, "Some txt", "title", JOptionPane.ERROR_MESSAGE);      // x


      //int answer = JOptionPane.showConfirmDialog(null, "Conding?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);


      // String name =  JOptionPane.showInputDialog("What is your name: ");  System.out.println("Hellow "+name);

      String[] response = {"asd","dsa","sda"};
      ImageIcon image = new ImageIcon("BOGDAT.jpg");

      JOptionPane.showOptionDialog(null, "Some txt", "asd", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, image, response, 0);


        
        
    }
}
