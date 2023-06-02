package __k2.__sem2.arh.kurs.ticket.redeemed_tickets;

import __k2.__sem2.arh.kurs.ticket.ticket;

public class redeemed_tickets extends ticket {
    int redeemed_tickets;
    public redeemed_tickets(){
        super();
    }

    public redeemed_tickets(int ticket_id, String type, int id, String from, String direction, String to,
            int redeemed_tickets) {
        super(ticket_id, type, id, from, direction, to);
        this.redeemed_tickets = redeemed_tickets;
    }

    public int getRedeemed_tickets() {
        return redeemed_tickets;
    }

    public void setRedeemed_tickets(int redeemed_tickets) {
        this.redeemed_tickets = redeemed_tickets;
    }
}
