package __k2.__sem2.arh.kurs;

import java.sql.*;

public class req1 extends _connection {
    public void req1() throws SQLException{
        connection = conn();
        String sql = "SELECT * FROM routes";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
    
            // Обробка результатів
            while (resultSet.next()) {
                int id = resultSet.getInt("routes_id");
                String routes_from = resultSet.getString("routes_from");
                String routes_direction = resultSet.getString("routes_direction");
                String routes_to = resultSet.getString("routes_to");
                System.out.println(" " + id + " " + routes_from + "  " + routes_direction+ " " + routes_to);
            }
    
            // Закриття ресурсів
            resultSet.close();
            statement.close();
            connection.close();
    }
}
