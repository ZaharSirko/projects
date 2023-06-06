package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class sold_ticket_DAO extends _connection implements sold_ticket_interface {
    public sold_ticket_DAO(){
        conn();
    }
    @Override
    public List<sold_ticket> getAllSoldTicket() throws SQLException {
     List<sold_ticket> sold_tickets=  new ArrayList<>();
     try {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT sold_ticket,sold_ticket.routes_id,routes_from,routes_direction,routes_to,sold_ticket_hour,sold_ticket_week,sold_ticket_mounth from sold_ticket "
       +"INNER JOIN routes on routes.routes_id = sold_ticket.routes_id");
        while(resultSet.next()){
        int sold_ticket_id = resultSet.getInt("sold_ticket");
        int routes_id = resultSet.getInt("routes_id");
        String routes_from = resultSet.getString("routes_from");
        String routes_direction = resultSet.getString("routes_direction");
        String routes_to = resultSet.getString("routes_to");
        int sold_ticket_hour = resultSet.getInt("sold_ticket_hour");
        int sold_ticket_week = resultSet.getInt("sold_ticket_week");
        int sold_ticket_mounth = resultSet.getInt("sold_ticket_mounth");
        sold_ticket sold_ticket = new sold_ticket(sold_ticket_id, routes_id, routes_from, routes_direction, routes_to, sold_ticket_hour, sold_ticket_week, sold_ticket_mounth);
        sold_tickets.add(sold_ticket);
        }
        statement.close();
        resultSet.close();
     } catch (SQLException e) {
        e.printStackTrace();
    }
        return sold_tickets;
    }

    @Override
    public void addSoldTicket(sold_ticket sold_ticket) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into sold_ticket(sold_ticket,routes_id,sold_ticket_hour,sold_ticket_week,sold_ticket_mounth) values"
            + "(?,?,?,?,?)");
            statement.setInt(1, sold_ticket.getTicket_id());
            statement.setInt(2, sold_ticket.getId());
            statement.setInt(3, sold_ticket.getSold_ticket_hour());
            statement.setInt(4, sold_ticket.getSold_ticket_week());
            statement.setInt(5, sold_ticket.getSold_ticket_mounth());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateSoldTicket(sold_ticket sold_ticket) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE sold_ticket set routes_id=?,sold_ticket_hour=?,sold_ticket_week=?,sold_ticket_mounth=? where sold_ticket=?");
            statement.setInt(5, sold_ticket.getTicket_id());
            statement.setInt(1, sold_ticket.getId());
            statement.setInt(2, sold_ticket.getSold_ticket_hour());
            statement.setInt(3, sold_ticket.getSold_ticket_week());
            statement.setInt(4, sold_ticket.getSold_ticket_mounth());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void deleteSoldTicket(int sold_ticket_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM sold_ticket WHERE sold_ticket = ?");
            statement.setInt(1, sold_ticket_id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    }
    

