package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class sold_ticket_request extends _connection {
    public List<sold_ticket_model> getAllSoldTickets() throws SQLException {
        List<sold_ticket_model> SoldTicket = new ArrayList<>();
 
        List<sold_ticket> SoldTicketList = new sold_ticket_DAO().getAllSoldTicket();

        for (sold_ticket SoldTickets : SoldTicketList) {
            sold_ticket_model SoldTicketModel = new sold_ticket_model(
                SoldTickets.getTicket_id(),
                SoldTickets.getId(),
                SoldTickets.getFrom(),
                SoldTickets.getDirection(),
                SoldTickets.getTo(),
                SoldTickets.getSold_ticket_hour(),
                SoldTickets.getSold_ticket_week(),
                SoldTickets.getSold_ticket_mounth()
            );

            SoldTicket.add(SoldTicketModel);
        }

        return SoldTicket;
    }
}
