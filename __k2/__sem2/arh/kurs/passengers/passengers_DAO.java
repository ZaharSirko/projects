package __k2.__sem2.arh.kurs.passengers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class passengers_DAO extends _connection implements passengers_interface {
    public passengers_DAO(){
        conn();
    }
    @Override
    public List<passengers> getAllPassengers() throws SQLException {
      List <passengers> passengers = new ArrayList<>();
      try{
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from passengers");
        while(resultSet.next()){
            int passengers_id = resultSet.getInt("passengers_id");
            String passengers_surename = resultSet.getString("passengers_surename");
            String passengers_name = resultSet.getString("passengers_name");
            String passengers_gender = resultSet.getString("passengers_gender");
            int passengers_age = resultSet.getInt("passengers_age");
            String routes_to = resultSet.getString("routes_to");
 
            passengers passenger = new passengers(passengers_id, passengers_name, passengers_surename, passengers_age, passengers_gender, routes_to);
            passengers.add(passenger);
        }
        statement.close();
        resultSet.close();

      }catch (SQLException e) {
        e.printStackTrace();
   }
        return passengers;
    }

    @Override
    public void addPassenger(passengers passenger) {
        try {
            PreparedStatement statement = connection.prepareStatement(  "insert into passengers(passengers_id, passengers_surename,passengers_name,"
            + "passengers_gender,passengers_age,routes_to) VALUES (?,?,?,?,?,?)");
            
            statement.setInt(1, passenger.getId());
            statement.setString(2, passenger.getSurename());
            statement.setString(3, passenger.getName());
            statement.setString(4, passenger.getGender());
            statement.setInt(5, passenger.getAge());
            statement.setString(6, passenger.getRoutes_to());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
       }
    }

    @Override
    public void updatePassenger(passengers passenger) {
        try {
            PreparedStatement statement = connection.prepareStatement("Update passengers Set passengers_surename=?,passengers_name=?,passengers_gender=?"
            +",passengers_age=?,routes_to=? WHERE passengers_id=?");
            statement.setString(1, passenger.getSurename());
            statement.setString(2, passenger.getName());
            statement.setString(3, passenger.getGender());
            statement.setInt(4, passenger.getAge());
            statement.setString(5, passenger.getRoutes_to());

            statement.executeUpdate();
            statement.close();
         } catch (SQLException e) {
            e.printStackTrace();
       }
        
    }

    @Override
    public void deletePassenger(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM passengers WHERE passengers_id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public passengers getPassengerById(int id) {
        passengers passengers = null;
        try{
          PreparedStatement statement = connection.prepareStatement("Slect * from passengers WHERE passengers_id =?");
          statement.setInt(1, id);
          ResultSet resultSet = statement.executeQuery();
          while(resultSet.next()){
              int passengers_id = resultSet.getInt("passengers_id");
              String passengers_surename = resultSet.getString("passengers_surename");
              String passengers_name = resultSet.getString("passengers_name");
              String passengers_gender = resultSet.getString("passengers_gender");
              int passengers_age = resultSet.getInt("passengers_age");
              String routes_to = resultSet.getString("routes_to");
   
            passengers = new passengers(passengers_id, passengers_name, passengers_surename, passengers_age, passengers_gender, routes_to);
              
          }
          statement.close();
          resultSet.close();
  
        }catch (SQLException e) {
          e.printStackTrace();
     }
          return passengers;
    }
    
}
