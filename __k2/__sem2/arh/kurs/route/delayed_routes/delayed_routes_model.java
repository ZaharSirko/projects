package __k2.__sem2.arh.kurs.route.delayed_routes;

import __k2.__sem2.arh.kurs.route.route_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class delayed_routes_model extends route_model {
    IntegerProperty delayed_routes;
    StringProperty delayed_routes_reason;
public delayed_routes_model(int delayed_routes, int id, String from, String direction, String to,
        String delayed_routes_reason) {
    super(id, from, direction, to);
    this.delayed_routes = new SimpleIntegerProperty (delayed_routes);
    this.delayed_routes_reason = new SimpleStringProperty(delayed_routes_reason);
}
public delayed_routes_model(){
    super();
}
public delayed_routes_model(int delayed_routes,int id, String delayed_routes_reason) {
    super(id);
    this.delayed_routes = new SimpleIntegerProperty (delayed_routes);
    this.delayed_routes_reason = new SimpleStringProperty(delayed_routes_reason);
}
public IntegerProperty getDelayed_routes() {
    return delayed_routes;
}
public void setDelayed_routes(IntegerProperty delayed_routes) {
    this.delayed_routes = delayed_routes;
}
public StringProperty getDelayed_routes_reason() {
    return delayed_routes_reason;
}
public void setDelayed_routes_reason(StringProperty delayed_routes_reason) {
    this.delayed_routes_reason = delayed_routes_reason;
}
}
