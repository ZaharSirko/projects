package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import java.sql.SQLException;
import java.util.List;

public interface sold_ticket_interface {
    List<sold_ticket> getAllSoldTicket() throws SQLException;
    void addSoldTicket(sold_ticket sold_ticket);
    void updateSoldTicket(sold_ticket sold_ticket);
    void deleteSoldTicket(int sold_ticket_id);
    sold_ticket getSoldTicketById(int sold_ticket_id);
}
