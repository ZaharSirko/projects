package __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class not_redeemed_tickets_DAO extends _connection implements not_redeemed_tickets_interface {
    not_redeemed_tickets_DAO(){
        conn();
    }
    @Override
    public List<not_redeemed_tickets> getAllNotRedeemedTickets() throws SQLException {
        List<not_redeemed_tickets> redeemed_tickets=  new ArrayList<>();
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT tickets_id,not_redeemed_tickets_type,not_redeemed_tickets.routes_id,routes_from,routes_direction,routes_to,not_redeemed_tickets_count from not_redeemed_tickets "
          +"INNER JOIN routes on routes.routes_id = not_redeemed_tickets.routes_id");
           while(resultSet.next()){
           int redeemed_tickets_id = resultSet.getInt("tickets_id");
           String type = resultSet.getString("not_redeemed_tickets_type");
           int routes_id = resultSet.getInt("routes_id");
           String routes_from = resultSet.getString("routes_from");
           String routes_direction = resultSet.getString("routes_direction");
           String routes_to = resultSet.getString("routes_to");
           int not_redeemed_tickets_count = resultSet.getInt("not_redeemed_tickets_count");
           not_redeemed_tickets redeemed_ticket = new not_redeemed_tickets(redeemed_tickets_id, type, routes_id, routes_from, routes_direction, routes_to, not_redeemed_tickets_count);
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
    public void addNotRedeemedTickets(not_redeemed_tickets redeemed_tickets) {
        
        try {
            PreparedStatement statement = connection.prepareStatement("insert into not_redeemed_tickets(tickets_id,not_redeemed_tickets_type,routes_id,not_redeemed_tickets_count) values"
            + "(?,?,?,?)");
            statement.setInt(1, redeemed_tickets.getTicket_id());
            statement.setString(2, redeemed_tickets.getType());
            statement.setInt(3, redeemed_tickets.getId());
            statement.setInt(4, redeemed_tickets.getNotRedeemed_tickets());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateNotRedeemedTickets(not_redeemed_tickets redeemed_tickets) {
        
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE not_redeemed_tickets ON tickets_id=?,not_redeemed_tickets_type=?,routes_id=?,not_redeemed_tickets_count=?");
            statement.setInt(1, redeemed_tickets.getTicket_id());
            statement.setString(2, redeemed_tickets.getType());
            statement.setInt(3, redeemed_tickets.getId());
            statement.setInt(4, redeemed_tickets.getNotRedeemed_tickets());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteNotRedeemedTickets(int redeemed_tickets_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM not_redeemed_tickets WHERE tickets_id = ?");
            statement.setInt(1, redeemed_tickets_id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public not_redeemed_tickets getNotRedeemedTicketsById(int redeemed_tickets_id) {
        not_redeemed_tickets not_redeemed_tickets = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT tickets_id,not_redeemed_tickets_type,not_redeemed_tickets.routes_id,routes_from,routes_direction,routes_to,not_redeemed_tickets_count from not_redeemed_tickets "
           +"INNER JOIN routes on routes.routes_id = not_redeemed_tickets.routes_id");
            while(resultSet.next()){
            String type = resultSet.getString("not_redeemed_tickets_type");
            int routes_id = resultSet.getInt("routes_id");
            String routes_from = resultSet.getString("routes_from");
            String routes_direction = resultSet.getString("routes_direction");
            String routes_to = resultSet.getString("routes_to");
            int not_redeemed_tickets_count = resultSet.getInt("not_redeemed_tickets_count");
            not_redeemed_tickets = new not_redeemed_tickets(redeemed_tickets_id, type, routes_id, routes_from, routes_direction, routes_to, not_redeemed_tickets_count);
            }
            statement.close();
            resultSet.close();
         } catch (SQLException e) {
            e.printStackTrace();
        }
        return not_redeemed_tickets;
    }
    
}
