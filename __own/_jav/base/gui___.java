package __own._jav.base;
import javax.swing.JOptionPane ;

public class gui___ {
    public static void main(String[] args){
String name = JOptionPane.showInputDialog("Enter name");
JOptionPane.showMessageDialog(null,"Your name is "+ name);

int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
JOptionPane.showMessageDialog(null,"Your age is "+ age+" asd");

double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
JOptionPane.showMessageDialog(null,"Your height is "+ height+" cm ");
    }
}
