package __k2.__sem2.arh.kurs.ticket.redeemed_tickets;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class redeemed_tickets_DAO extends _connection implements redeemed_tickets_interface {
    public redeemed_tickets_DAO(){
        conn();
    }
    @Override
    public List<redeemed_tickets> getAllRedeemedTickets() throws SQLException {
        List<redeemed_tickets> redeemed_tickets=  new ArrayList<>();
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT tickets_id,redeemed_tickets_type,redeemed_tickets.routes_id,routes_from,routes_direction,routes_to,redeemed_tickets_count from redeemed_tickets "
          +"INNER JOIN routes on routes.routes_id = redeemed_tickets.routes_id");
           while(resultSet.next()){
           int redeemed_tickets_id = resultSet.getInt("tickets_id");
           String type = resultSet.getString("redeemed_tickets_type");
           int routes_id = resultSet.getInt("routes_id");
           String routes_from = resultSet.getString("routes_from");
           String routes_direction = resultSet.getString("routes_direction");
           String routes_to = resultSet.getString("routes_to");
           int redeemed_tickets_count = resultSet.getInt("redeemed_tickets_count");
           redeemed_tickets redeemed_ticket = new redeemed_tickets(redeemed_tickets_id, type, routes_id, routes_from, routes_direction, routes_to, redeemed_tickets_count);
           redeemed_tickets.add(redeemed_ticket);
           }
           statement.close();
           resultSet.close();
        } catch (SQLException e) {
           e.printStackTrace();
       }
           return redeemed_tickets;
    }

    @Override
    public void addRedeemedTickets(redeemed_tickets redeemed_tickets) {
        
        try {
            PreparedStatement statement = connection.prepareStatement("insert into redeemed_tickets(tickets_id,redeemed_tickets_type,routes_id,redeemed_tickets_count) values"
            + "(?,?,?,?)");
            statement.setInt(1, redeemed_tickets.getTicket_id());
            statement.setString(2, redeemed_tickets.getType());
            statement.setInt(3, redeemed_tickets.getId());
            statement.setInt(4, redeemed_tickets.getRedeemed_tickets());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateRedeemedTickets(redeemed_tickets redeemed_tickets) {
        
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE redeemed_tickets Set redeemed_tickets_type=?,routes_id=?,redeemed_tickets_count=? where tickets_id=?");
            statement.setInt(4, redeemed_tickets.getTicket_id());
            statement.setString(1, redeemed_tickets.getType());
            statement.setInt(2, redeemed_tickets.getId());
            statement.setInt(3, redeemed_tickets.getRedeemed_tickets());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteRedeemedTickets(int redeemed_tickets_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM redeemed_tickets WHERE tickets_id = ?");
            statement.setInt(1, redeemed_tickets_id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
