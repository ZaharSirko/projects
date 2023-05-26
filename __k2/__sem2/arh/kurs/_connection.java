package __k2.__sem2.arh.kurs;
import java.sql.*;
public class _connection {
  protected static  Connection connection;
  protected static Connection conn(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+"kursova","postgres","boomlog123321");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    }


