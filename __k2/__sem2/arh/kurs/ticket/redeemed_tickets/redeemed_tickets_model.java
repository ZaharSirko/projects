package __k2.__sem2.arh.kurs.ticket.redeemed_tickets;

import __k2.__sem2.arh.kurs.ticket.ticket_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class redeemed_tickets_model extends ticket_model {
    IntegerProperty redeemed_tickets;
    public redeemed_tickets_model(){
        super();
    }

    public redeemed_tickets_model(int ticket_id, String type, int id, String from, String direction, String to,
            int redeemed_tickets) {
        super(ticket_id, type, id, from, direction, to);
        this.redeemed_tickets =new SimpleIntegerProperty(redeemed_tickets);
    }
    public IntegerProperty getRedeemed_tickets() {
        return redeemed_tickets;
    }

    public void setRedeemed_tickets(IntegerProperty redeemed_tickets) {
        this.redeemed_tickets = redeemed_tickets;
    }
}
