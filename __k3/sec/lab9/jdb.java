package __k3.sec.lab9;

import java.sql.*;

public class jdb {
    private Connection connection;

    public jdb() throws ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+"sec_lab9","postgres","boomlog123321");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean authenticateUser(String username, String password) {
        try {

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE users_name=? AND users_password=?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getUserRole(String username) {
        try {
      
            PreparedStatement statement = connection.prepareStatement("SELECT role_name FROM role INNER JOIN users ON users.role_id = role.role_id WHERE users_name=?");
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("role_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
