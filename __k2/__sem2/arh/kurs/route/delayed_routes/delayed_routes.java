package __k2.__sem2.arh.kurs.route.delayed_routes;

import __k2.__sem2.arh.kurs.route.route;

public class delayed_routes extends route {
int delayed_routes;
String delayed_routes_reason;
public delayed_routes(int delayed_routes, int id, String from, String direction, String to,
        String delayed_routes_reason) {
    super(id, from, direction, to);
    this.delayed_routes = delayed_routes;
    this.delayed_routes_reason = delayed_routes_reason;
}
public delayed_routes(){
    super();
}
public delayed_routes(int delayed_routes,int id, String delayed_routes_reason) {
    super(id);
    this.delayed_routes = delayed_routes;
    this.delayed_routes_reason = delayed_routes_reason;
}
public int getDelayed_routes() {
    return delayed_routes;
}
public void setDelayed_routes(int delayed_routes) {
    this.delayed_routes = delayed_routes;
}
public String getDelayed_routes_reason() {
    return delayed_routes_reason;
}
public void setDelayed_routes_reason(String delayed_routes_reason) {
    this.delayed_routes_reason = delayed_routes_reason;
}
}
