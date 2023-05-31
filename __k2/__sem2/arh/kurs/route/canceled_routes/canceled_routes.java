package __k2.__sem2.arh.kurs.route.canceled_routes;

import __k2.__sem2.arh.kurs.route.route;

public class canceled_routes extends route {
   int canceled_routes_id;
   String canceled_routes_type;
public canceled_routes(int canceled_routes_id,int id, String canceled_routes_type) {
    super(id);
    this.canceled_routes_id = canceled_routes_id;
    this.canceled_routes_type = canceled_routes_type;
}
public canceled_routes(){
    super();
   }
public canceled_routes(int canceled_routes_id, int id, String from, String direction, String to,
        String canceled_routes_type) {
    super(id, from, direction, to);
    this.canceled_routes_id = canceled_routes_id;
    this.canceled_routes_type = canceled_routes_type;
}
public int getCanceled_routes_id() {
    return canceled_routes_id;
}
public void setCanceled_routes_id(int canceled_routes_id) {
    this.canceled_routes_id = canceled_routes_id;
}
public String getCanceled_routes_type() {
    return canceled_routes_type;
}
public void setCanceled_routes_type(String canceled_routes_type) {
    this.canceled_routes_type = canceled_routes_type;
}
}
