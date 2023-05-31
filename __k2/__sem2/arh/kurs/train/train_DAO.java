package __k2.__sem2.arh.kurs.train;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;
import __k2.__sem2.arh.kurs.route.route;

public class train_DAO extends _connection implements train_interface{
    train_DAO(){
        conn();
    }
    @Override
    public List<train> getAllTrainsRoutes() throws SQLException {
      List<train> trainsRoutes = new ArrayList<>();
      try {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT train_id,routes.routes_id,train_name,routes_ticket_price,routes_duration,routes_from,routes_direction,routes_to FROM train "
        +"INNER JOIN routes ON  routes.routes_id = train.routes_id");

        while(resultSet.next()){
            int trainId = resultSet.getInt("train_id");
            int routesId = resultSet.getInt("routes_id");
            String trainName = resultSet.getString("train_name");
            int routesTicketPrice = resultSet.getInt("routes_ticket_price");
            int routesDuration = resultSet.getInt("routes_duration");
            String routesFrom = resultSet.getString("routes_from");
            String routesDirection = resultSet.getString("routes_direction");
            String routesTo = resultSet.getString("routes_to");

            train train = new train(trainId,routesId,trainName,routesTicketPrice,routesDuration,routesFrom,routesDirection,routesTo);
            trainsRoutes.add(train);
        }
        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
   }
        return trainsRoutes;
    }

    @Override
    public List<route> getTrainRoutes(int trainId) throws SQLException {
        List<route> routes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM routes WHERE routes_id = (SELECT routes_id FROM train WHERE train_id = ?)");
            statement.setInt(1, trainId);
            ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int routesId = resultSet.getInt("routes_id");
                    String from = resultSet.getString("routes_from");
                    String direction = resultSet.getString("routes_direction");
                    String to = resultSet.getString("routes_to");

                    route route = new route(routesId,from,direction,to);
                    routes.add(route);
                }
                resultSet.close();
                statement.close();
    }
    catch (SQLException e) {
        e.printStackTrace();
   }
    return routes;
}

    @Override
    public void addTrains(train train) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO train (train_id, train_name, routes_ticket_price, routes_duration) " +
            "VALUES (?, ?, ?, ?)");

            statement.setInt(1, train.getTrain_id());
            statement.setString(2, train.getTrain_name());
            statement.setInt(3, train.getRoutes_ticket_price());
            statement.setInt(4, train.getRoutes_duration());

            statement.executeUpdate();
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateTrains(train trains) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE train SET train_name = ?, routes_ticket_price = ?, routes_duration = ? " +
            "WHERE train_id = ?");

            statement.setString(1, trains.getTrain_name());
            statement.setInt(2, trains.getRoutes_ticket_price());
            statement.setInt(3, trains.getRoutes_duration());

            statement.executeUpdate();
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTrains(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM train WHERE train_id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public train getTrainsById(int id) {
        train trains = null;
        try {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM train WHERE train_id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int route_id = resultSet.getInt("routes_id");
            int train_id = resultSet.getInt("train_id");
            String name = resultSet.getString("train_name");
            int routes_ticket_price = resultSet.getInt("routes_ticket_price");
            int routes_duration = resultSet.getInt("routes_duration");
             trains = new train(route_id, train_id, name, routes_ticket_price, routes_duration);
        }
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
         e.printStackTrace();
    }
        return trains;
    }
    
}
