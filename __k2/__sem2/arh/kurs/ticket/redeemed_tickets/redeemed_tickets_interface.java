package __k2.__sem2.arh.kurs.ticket.redeemed_tickets;

import java.sql.SQLException;
import java.util.List;

public interface redeemed_tickets_interface {
    List<redeemed_tickets> getAllRedeemedTickets() throws SQLException;
    void addRedeemedTickets(redeemed_tickets redeemed_tickets);
    void updateRedeemedTickets(redeemed_tickets redeemed_tickets);
    void deleteRedeemedTickets(int redeemed_tickets_id);
}
