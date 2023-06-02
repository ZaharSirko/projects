package __k2.__sem2.arh.kurs.ticket.redeemed_tickets;

import java.sql.SQLException;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class redeemed_tickets_request extends _connection {
    public void getAllRedeemedTickets() throws SQLException{
        List<redeemed_tickets> redeemed_ticket = new redeemed_tickets_DAO().getAllRedeemedTickets(); 
        for (redeemed_tickets redeemed_tickets : redeemed_ticket) {
            System.out.println(redeemed_tickets.getTicket_id()+" "+redeemed_tickets.getType()+" "+redeemed_tickets.getFrom()
            +" "+redeemed_tickets.getDirection()+" "+redeemed_tickets.getTo()+" "+redeemed_tickets.getRedeemed_tickets());
        }

    }
}
