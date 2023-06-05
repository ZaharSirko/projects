package __k2.__sem2.arh.kurs.route.delayed_routes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class delayed_routes_DAO extends _connection implements delayed_routes_interface {
    public delayed_routes_DAO(){
        conn();
    }
    @Override
    public List<delayed_routes> getAllDelayedRoutes() throws SQLException {

        List<delayed_routes> delayed_route = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT delayed_routes,delayed_routes.routes_id,routes_from,routes_direction,routes_to,delayed_routes_reason from delayed_routes "
            + "INNER JOIN routes on  routes.routes_id =delayed_routes.routes_id");
            while (resultSet.next()) {
                int delayed_routes_id = resultSet.getInt("delayed_routes");
                int routes_id = resultSet.getInt("routes_id");
                String from = resultSet.getString("routes_from");
                String direction = resultSet.getString("routes_direction");
                String to = resultSet.getString("routes_to");
                String reason = resultSet.getString("delayed_routes_reason");
   
                delayed_routes delayed_routes = new delayed_routes(delayed_routes_id, routes_id, from, direction, to, reason);
                delayed_route.add(delayed_routes);
            }
            resultSet.close();
            statement.close();
          } catch (SQLException e) {
             e.printStackTrace();
        }
        return delayed_route;
    }

    @Override
    public void addDelayed_routes(delayed_routes routes) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO delayed_routes(delayed_routes,routes_id,delayed_routes_reason) VALUES"
            + "(?,?,?)");
            statement.setInt(1, routes.getDelayed_routes());
            statement.setString(3, routes.getDelayed_routes_reason());
            statement.setInt(2, routes.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateDelayed_routes(delayed_routes routes) {
        try {
            PreparedStatement statement = connection.prepareStatement(" UPDATE delayed_routes Set routes_id=?,delayed_routes_reason=? Where delayed_routes=?");
            statement.setString(2, routes.getDelayed_routes_reason());
            statement.setInt(1, routes.getId());
            statement.setInt(3, routes.getDelayed_routes());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void deleteDelayed_routes(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM delayed_routes WHERE delayed_routes = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public delayed_routes getDelayedRoutesById(int id) {

        delayed_routes delayed_route = null;
        try {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM delayed_routes WHERE delayed_routes = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int routes_id = resultSet.getInt("routes_id");
            String reason = resultSet.getString("delayed_routes_reason");
            delayed_route = new delayed_routes(id, routes_id,reason);

        }
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
         e.printStackTrace();
    }
        return delayed_route;
    }
    
}
