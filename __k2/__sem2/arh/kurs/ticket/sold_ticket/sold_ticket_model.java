package __k2.__sem2.arh.kurs.ticket.sold_ticket;

import __k2.__sem2.arh.kurs.ticket.ticket_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class sold_ticket_model extends ticket_model {
    IntegerProperty sold_ticket_hour;
    IntegerProperty sold_ticket_week;
    IntegerProperty sold_ticket_mounth;
 public sold_ticket_model(){
    super();
 }
public sold_ticket_model(int ticket_id, int id, String from, String direction, String to, int sold_ticket_hour,
        int sold_ticket_week, int sold_ticket_mounth) {
    super(ticket_id, id, from, direction, to);
    this.sold_ticket_hour = new SimpleIntegerProperty(sold_ticket_hour);
    this.sold_ticket_week = new SimpleIntegerProperty(sold_ticket_week);
    this.sold_ticket_mounth = new SimpleIntegerProperty(sold_ticket_mounth);
}
public IntegerProperty getSold_ticket_hour() {
    return sold_ticket_hour;
}
public void setSold_ticket_hour(IntegerProperty sold_ticket_hour) {
    this.sold_ticket_hour = sold_ticket_hour;
}
public IntegerProperty getSold_ticket_week() {
    return sold_ticket_week;
}
public void setSold_ticket_week(IntegerProperty sold_ticket_week) {
    this.sold_ticket_week = sold_ticket_week;
}
public IntegerProperty getSold_ticket_mounth() {
    return sold_ticket_mounth;
}
public void setSold_ticket_mounth(IntegerProperty sold_ticket_mounth) {
    this.sold_ticket_mounth = sold_ticket_mounth;
}
}
