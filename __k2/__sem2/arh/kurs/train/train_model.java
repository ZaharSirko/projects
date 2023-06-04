package __k2.__sem2.arh.kurs.train;

import __k2.__sem2.arh.kurs.route.route_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class train_model extends route_model {
    IntegerProperty train_id;
    StringProperty train_name;
    IntegerProperty routes_ticket_price;
    IntegerProperty routes_duration;
    public train_model(){
        super();
    }
    public train_model(int id, int train_id, String train_name,int routes_ticket_price, int routes_duration) {
        super(id);
        this.train_id = new SimpleIntegerProperty(train_id);
        this.train_name = new SimpleStringProperty(train_name);
        this.routes_ticket_price = new SimpleIntegerProperty(routes_ticket_price);
        this.routes_duration = new SimpleIntegerProperty(routes_duration);
    }
    public train_model(int train_id, int routesId, String train_name, int routes_ticket_price, int routes_duration,
            String routesFrom, String routesDirection, String routesTo) {
                super(routesId,routesFrom,routesDirection,routesTo);
                this.train_id = new SimpleIntegerProperty(train_id);
                this.train_name = new SimpleStringProperty(train_name);
                this.routes_ticket_price = new SimpleIntegerProperty(routes_ticket_price);
                this.routes_duration = new SimpleIntegerProperty(routes_duration);
    }
    public IntegerProperty getTrain_id() {
        return train_id;
    }
    public void setTrain_id(IntegerProperty train_id) {
        this.train_id = train_id;
    }
    public StringProperty getTrain_name() {
        return train_name;
    }
    public void setTrain_name(StringProperty train_name) {
        this.train_name = train_name;
    }
    public IntegerProperty getRoutes_ticket_price() {
        return routes_ticket_price;
    }
    public void setRoutes_ticket_price(IntegerProperty routes_ticket_price) {
        this.routes_ticket_price = routes_ticket_price;
    }
    public IntegerProperty getRoutes_duration() {
        return routes_duration;
    }
    public void setRoutes_duration(IntegerProperty routes_duration) {
        this.routes_duration = routes_duration;
    }
}
