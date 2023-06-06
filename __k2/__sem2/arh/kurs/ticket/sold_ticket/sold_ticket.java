package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import __k2.__sem2.arh.kurs.ticket.ticket;

public class sold_ticket extends ticket {
 int sold_ticket_hour;
 int sold_ticket_week;
 int sold_ticket_mounth;

 public sold_ticket(int ticket_id, int route_id,int sold_ticket_hour,int sold_ticket_week, int sold_ticket_mounth){
    super(ticket_id, route_id);
    this.sold_ticket_hour = sold_ticket_hour;
    this.sold_ticket_week = sold_ticket_week;
    this.sold_ticket_mounth = sold_ticket_mounth;
 }
public sold_ticket(int ticket_id, int id, String from, String direction, String to, int sold_ticket_hour,
        int sold_ticket_week, int sold_ticket_mounth) {
    super(ticket_id, id, from, direction, to);
    this.sold_ticket_hour = sold_ticket_hour;
    this.sold_ticket_week = sold_ticket_week;
    this.sold_ticket_mounth = sold_ticket_mounth;
}
public int getSold_ticket_hour() {
    return sold_ticket_hour;
}
public void setSold_ticket_hour(int sold_ticket_hour) {
    this.sold_ticket_hour = sold_ticket_hour;
}
public int getSold_ticket_week() {
    return sold_ticket_week;
}
public void setSold_ticket_week(int sold_ticket_week) {
    this.sold_ticket_week = sold_ticket_week;
}
public int getSold_ticket_mounth() {
    return sold_ticket_mounth;
}
public void setSold_ticket_mounth(int sold_ticket_mounth) {
    this.sold_ticket_mounth = sold_ticket_mounth;
}
}
