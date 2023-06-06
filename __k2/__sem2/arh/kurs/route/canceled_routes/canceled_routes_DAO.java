package __k2.__sem2.arh.kurs.route.canceled_routes;

import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class canceled_routes_DAO extends _connection implements canceled_routes_interface {
    public canceled_routes_DAO(){
        conn();
    }

    @Override
    public List<canceled_routes> getAllCanceledRoutes() throws SQLException {
     List<canceled_routes> canceled_route = new ArrayList<>();
     try{
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(" SELECT  canceled_routes_id,canceled_routes.routes_id,routes_from,routes_direction,routes_to,canceled_routes_type From canceled_routes "
         + "INNER JOIN routes ON  routes.routes_id =canceled_routes.routes_id ORDER BY canceled_routes_id");
         while (resultSet.next()) {
             int canceled_routes_id = resultSet.getInt("canceled_routes_id");
             int id = resultSet.getInt("routes_id");
             String from = resultSet.getString("routes_from");
             String direction = resultSet.getString("routes_direction");
             String to = resultSet.getString("routes_to");
             String type = resultSet.getString("canceled_routes_type");

             canceled_routes canceled_routes = new canceled_routes(canceled_routes_id, id, from, direction, to, type);
             canceled_route.add(canceled_routes);
         }
         resultSet.close();
         statement.close();
       } catch (SQLException e) {
          e.printStackTrace();
     }
     return canceled_route;
    }

    @Override
    public void addСanceled_routes(canceled_routes routes) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO canceled_routes(canceled_routes_id,canceled_routes_type,routes_id) values"
            + "(?,?,?)");
            statement.setInt(1, routes.getCanceled_routes_id());
            statement.setString(2, routes.getCanceled_routes_type());
            statement.setInt(3, routes.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateСanceled_routes(canceled_routes routes) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE canceled_routes Set canceled_routes_type=?,routes_id=? WHERE canceled_routes_id=?");
            statement.setString(1, routes.getCanceled_routes_type());
            statement.setInt(2, routes.getId());
            statement.setInt(3, routes.getCanceled_routes_id());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteСanceled_routes(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM canceled_routes WHERE canceled_routes_id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


 
}
    

