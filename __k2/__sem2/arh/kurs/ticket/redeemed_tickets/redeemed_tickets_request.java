package __k2.__sem2.arh.kurs.ticket.redeemed_tickets;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class redeemed_tickets_request extends _connection {
    public List<redeemed_tickets_model> getAllRedeemedTicket() throws SQLException {
        List<redeemed_tickets_model> RedeemedTicket = new ArrayList<>();
        
        List<redeemed_tickets> RedeemedTicketList = new redeemed_tickets_DAO().getAllRedeemedTickets();

        for (redeemed_tickets RedeemedTickets : RedeemedTicketList) {
            redeemed_tickets_model RedeemedTicketsModel = new redeemed_tickets_model(
                RedeemedTickets.getTicket_id(),
                RedeemedTickets.getType(),
                RedeemedTickets.getId(),
                RedeemedTickets.getFrom(),
                RedeemedTickets.getDirection(),
                RedeemedTickets.getTo(),
                RedeemedTickets.getRedeemed_tickets()
            );

            RedeemedTicket.add(RedeemedTicketsModel);
        }

        return RedeemedTicket;
    }
}
