package __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets;

import java.sql.SQLException;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class not_redeemed_tickets_request extends _connection {
    public void getAllNotRedeemedTickets() throws SQLException{
        List<not_redeemed_tickets> not_redeemed_tickets = new not_redeemed_tickets_DAO().getAllNotRedeemedTickets(); 
       for (not_redeemed_tickets not_redeemed_ticket : not_redeemed_tickets) {
        System.out.println(not_redeemed_ticket.getTicket_id()+" "+not_redeemed_ticket.getType()+" "+not_redeemed_ticket.getFrom()
            +" "+not_redeemed_ticket.getDirection()+" "+not_redeemed_ticket.getTo()+" "+not_redeemed_ticket.getNotRedeemed_tickets());
       }

    }
}
