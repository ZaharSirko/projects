package __k2.__sem2.arh.kurs.route;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class route_DAO extends _connection implements route_interface {
    public route_DAO(){
     conn();
    }

    @Override
    public List<route> getAllRoutes(){
        List<route> routes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM routes");
            while (resultSet.next()) {
                int id = resultSet.getInt("routes_id");
                String from = resultSet.getString("routes_from");
                String direction = resultSet.getString("routes_direction");
                String to = resultSet.getString("routes_to");

                route route = new route(id, from, direction, to);
                routes.add(route);
            }
            resultSet.close();
            statement.close();
          } catch (SQLException e) {
             e.printStackTrace();
        }
        return routes;
    }

    @Override
    public void addRoutes(route routes) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into routes(routes_id,routes_from,routes_direction,routes_to) values"
            + "(?,?,?,?)");
            statement.setInt(1, routes.getId());
            statement.setString(2, routes.getFrom());
            statement.setString(3, routes.getDirection());
            statement.setString(4, routes.getTo());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateRoutes(route routes) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE routes Set routes_from=?,routes_direction=?,routes_to=? Where routes_id=?");
            statement.setInt(4, routes.getId());
            statement.setString(1, routes.getFrom());
            statement.setString(2, routes.getDirection());
            statement.setString(3, routes.getTo());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void deleteRoutes(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM routes WHERE routes_id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

