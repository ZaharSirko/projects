package __k3.sec.lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab9 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private jdb database;

    public lab9() throws ClassNotFoundException {
        setTitle("Authentication App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);


        database = new jdb();

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                 
                if (!username.matches("[a-zA-Z0-9_]+")) {
                    JOptionPane.showMessageDialog(null, "Invalid username format");
                    return;
                }
                else
                {

                boolean authenticated = database.authenticateUser(username, password);
                usernameField.setText("");  
                passwordField.setText("");
                if (authenticated) {
          
                    String userRole = database.getUserRole(username);

                    openMainApplication(username, userRole);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    private void openMainApplication(String username, String userRole) {
        JOptionPane.showMessageDialog(null, "Welcome, " + username + "! Your role is: " + userRole);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new lab9();
                } catch (ClassNotFoundException e) {

                    e.printStackTrace();
                }
            }
        });
    }
}
