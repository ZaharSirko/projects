package __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets;

import __k2.__sem2.arh.kurs.ticket.ticket;

public class not_redeemed_tickets extends ticket {
    int not_redeemed_tickets;
    public not_redeemed_tickets(){
        super();
    }

    public not_redeemed_tickets(int ticket_id, String type, int id, String from, String direction, String to,
            int not_redeemed_tickets) {
        super(ticket_id, type, id, from, direction, to);
        this.not_redeemed_tickets = not_redeemed_tickets;
    }

    public not_redeemed_tickets(int not_redeemed_tickets_Id, String type, int routesId,
            int not_redeemed_tickets) {
                super(not_redeemed_tickets_Id, type, routesId);
                this.not_redeemed_tickets = not_redeemed_tickets;
    }

    public int getNotRedeemed_tickets() {
        return not_redeemed_tickets;
    }

    public void setNotRedeemed_tickets(int not_redeemed_tickets) {
        this.not_redeemed_tickets = not_redeemed_tickets;
    }
}
