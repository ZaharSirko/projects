package __k2.__sem2.arh.kurs.ticket;

import __k2.__sem2.arh.kurs.route.route;

public class ticket  extends route{
    int ticket_id;
    String type;
    public ticket(){
        super();
    }
    public ticket(int ticket_id, String type,int id, String from, String direction, String to) {
        super(id, from, direction, to);
        this.ticket_id = ticket_id;
        this.type = type;
    }

    public ticket( int ticket_id,int id, String from, String direction, String to) {
        super(id, from, direction, to);
        this.ticket_id = ticket_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
