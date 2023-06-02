package __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets;

import java.sql.SQLException;
import java.util.List;

public interface not_redeemed_tickets_interface {
    List<not_redeemed_tickets> getAllNotRedeemedTickets() throws SQLException;
    void addNotRedeemedTickets(not_redeemed_tickets not_redeemed_tickets);
    void updateNotRedeemedTickets(not_redeemed_tickets not_redeemed_tickets);
    void deleteNotRedeemedTickets(int not_redeemed_tickets);
    not_redeemed_tickets getNotRedeemedTicketsById(int not_redeemed_tickets_id);
}
