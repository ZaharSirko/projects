package __k2.__sem2.arh.kurs.ticket;

import __k2.__sem2.arh.kurs.route.route_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ticket_model extends route_model{
    IntegerProperty ticket_id;
    StringProperty type;
    public ticket_model(){
        super();
    }
    public ticket_model(int ticket_id, String type,int id, String from, String direction, String to) {
        super(id, from, direction, to);
        this.ticket_id = new SimpleIntegerProperty(ticket_id);
        this.type = new SimpleStringProperty(type);
    }

    public ticket_model( int ticket_id,int id, String from, String direction, String to) {
        super(id, from, direction, to);
        this.ticket_id =new SimpleIntegerProperty(ticket_id);
    }
    public IntegerProperty getTicket_id() {
        return ticket_id;
    }
    public void setTicket_id(IntegerProperty ticket_id) {
        this.ticket_id = ticket_id;
    }
    public StringProperty getType() {
        return type;
    }
    public void setType(StringProperty type) {
        this.type = type;
    }
}