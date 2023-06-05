package __k2.__sem2.arh.kurs.locomative;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import __k2.__sem2.arh.kurs._connection;

public class locomative_DAO extends _connection implements locomative_interface {
    public locomative_DAO(){
        conn();
    }
    @Override
    public List<locomative> getAllLocomative() {
       List<locomative> locomatives = new ArrayList<>();
       try {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from locomotive");
        while(resultSet.next()){
            int id = resultSet.getInt("locomotiveid");
            String name = resultSet.getString("locomotive_name");
            int age = resultSet.getInt("locomotive_age");
            int department= resultSet.getInt("locomotive_department");
            int completed_routes = resultSet.getInt("locomotive_completed_routes");
            int completed_routes_before_repair = resultSet.getInt("locomotive_completed_routes_before_repair");
            locomative  locomative = new locomative(id, name, age, department, completed_routes, completed_routes_before_repair);
            locomatives.add(locomative);
        }
        statement.close();
        resultSet.close();
       } catch (SQLException e) {
        e.printStackTrace();
   }
       
        return locomatives;
    }

    @Override
    public void addLocomative(locomative Locomative) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO locomotive (locomotiveid,locomotive_name,locomotive_age,locomotive_department,"
            +"locomotive_completed_routes,locomotive_completed_routes_before_repair) VALUES "
            + "(?,?,?,?,?,?)");
            statement.setInt(1, Locomative.getId());
            statement.setString(2, Locomative.getName());
            statement.setInt(3, Locomative.getAge());
            statement.setInt(4, Locomative.getDepartment());
            statement.setInt(5, Locomative.getCompleted_routes());
            statement.setInt(6, Locomative.getCompleted_routes_before_repair());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateLocomative(locomative Locomative) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE locomotive SET locomotive_name =?,locomotive_age =?,locomotive_department =?,"
            +"locomotive_completed_routes =?,locomotive_completed_routes_before_repair =? where locomotiveid =?");
            statement.setInt(6, Locomative.getId());
            statement.setString(1, Locomative.getName());
            statement.setInt(2, Locomative.getAge());
            statement.setInt(3, Locomative.getDepartment());
            statement.setInt(4, Locomative.getCompleted_routes());
            statement.setInt(5, Locomative.getCompleted_routes_before_repair());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void deleteLocomative(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM locomotive WHERE locomotiveid = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public locomative getLocomativeById(int id) {
        locomative locomative = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM brigade_worker WHERE brigade_worker_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("locomotive_name");
                int age = resultSet.getInt("locomotive_age");
                int department= resultSet.getInt("locomotive_department");
                int completed_routes = resultSet.getInt("locomotive_completed_routes");
                int completed_routes_before_repair = resultSet.getInt("locomotive_completed_routes_before_repair");

                 locomative = new locomative(id, name, age, department, completed_routes, completed_routes_before_repair);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return locomative;
    }
    
}
