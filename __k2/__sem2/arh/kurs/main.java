package __k2.__sem2.arh.kurs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/kursova"; // Замініть на своє підключення до бази даних
        String username = "username"; // Замініть на своє ім'я користувача
        String password = "boomlog123321"; // Замініть на свій пароль
 
        try {
            // Встановлення з'єднання з базою даних
            Connection connection = DriverManager.getConnection(url, username, password);

            // Виконання запиту
            String sql = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Обробка результатів
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Закриття ресурсів
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
