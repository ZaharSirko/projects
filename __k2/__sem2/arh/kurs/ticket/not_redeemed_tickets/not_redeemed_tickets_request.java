package __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class not_redeemed_tickets_request extends _connection {
    public void getAllNotRedeemedTickets() throws SQLException{
        List<not_redeemed_tickets> not_redeemed_tickets = new not_redeemed_tickets_DAO().getAllNotRedeemedTickets(); 
       for (not_redeemed_tickets not_redeemed_ticket : not_redeemed_tickets) {
        System.out.println(not_redeemed_ticket.getTicket_id()+" "+not_redeemed_ticket.getType()+" "+not_redeemed_ticket.getFrom()
            +" "+not_redeemed_ticket.getDirection()+" "+not_redeemed_ticket.getTo()+" "+not_redeemed_ticket.getNotRedeemed_tickets()+" id: "+not_redeemed_ticket.getId());
       }
    }

    public List<not_redeemed_tickets_model> getAllNotRedeemedTicket() throws SQLException {
        List<not_redeemed_tickets_model>  NotRedeemedTicket = new ArrayList<>();
        
        List<not_redeemed_tickets> NotRedeemedTicketList = new not_redeemed_tickets_DAO().getAllNotRedeemedTickets();

        for (not_redeemed_tickets  NotRedeemedTickets :  NotRedeemedTicketList) {
            not_redeemed_tickets_model  NotRedeemedTicketsModel = new not_redeemed_tickets_model(
                NotRedeemedTickets.getTicket_id(),
                NotRedeemedTickets.getType(),
                NotRedeemedTickets.getId(),
                NotRedeemedTickets.getFrom(),
                NotRedeemedTickets.getDirection(),
                NotRedeemedTickets.getTo(),
                NotRedeemedTickets.getNotRedeemed_tickets()
            );

            NotRedeemedTicket.add( NotRedeemedTicketsModel);
        }

        return  NotRedeemedTicket;
    }
}
