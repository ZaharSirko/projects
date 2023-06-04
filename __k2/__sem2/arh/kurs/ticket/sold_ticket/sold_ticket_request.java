package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class sold_ticket_request extends _connection {
    public void getAllSoldTicket() throws SQLException{
        List<sold_ticket> sold_tickets = new sold_ticket_DAO().getAllSoldTicket();
 
        for (sold_ticket sold_ticket : sold_tickets) {
            System.out.println(sold_ticket.getTicket_id()+" "+sold_ticket.getFrom()+" "+sold_ticket.getDirection()+" "+sold_ticket.getTo()
            +" "+sold_ticket.getSold_ticket_hour()+" "+sold_ticket.getSold_ticket_week()+" "+sold_ticket.getSold_ticket_mounth());
        }
        

        connection.close();
    }
    public List<sold_ticket_model> getAllDelayedRoutes() throws SQLException {
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
