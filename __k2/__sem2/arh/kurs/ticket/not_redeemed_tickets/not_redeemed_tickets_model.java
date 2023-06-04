package __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets;

import __k2.__sem2.arh.kurs.ticket.ticket_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class not_redeemed_tickets_model extends ticket_model {
    IntegerProperty not_redeemed_tickets;
    public not_redeemed_tickets_model(){
        super();
    }

    public not_redeemed_tickets_model(int ticket_id, String type, int id, String from, String direction, String to,
            int not_redeemed_tickets) {
        super(ticket_id, type, id, from, direction, to);
        this.not_redeemed_tickets =new SimpleIntegerProperty(not_redeemed_tickets);
    }

    public IntegerProperty getNot_redeemed_tickets() {
        return not_redeemed_tickets;
    }

    public void setNot_redeemed_tickets(IntegerProperty not_redeemed_tickets) {
        this.not_redeemed_tickets = not_redeemed_tickets;
    }
}
