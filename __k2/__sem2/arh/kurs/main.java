package __k2.__sem2.arh.kurs;
import java.sql.*;

public class main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+"kursova","postgres","boomlog123321");
            // Ваш код для виконання запитів до бази даних
            String sql = "SELECT * FROM routes";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Обробка результатів
            while (resultSet.next()) {
                int id = resultSet.getInt("routes_id");
                String routes_from = resultSet.getString("routes_from");
                String routes_direction = resultSet.getString("routes_direction");
                String routes_to = resultSet.getString("routes_to");
                System.out.println("ID: " + id + ", Name: " + routes_from + ", routes_direction: " + routes_direction+ ", routes_to: " + routes_to);
            }

            // Закриття ресурсів
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

