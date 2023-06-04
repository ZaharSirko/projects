package __k2.__sem2.arh.kurs.route;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class route_model {
    protected IntegerProperty routeId;
    protected StringProperty routesFrom;
    protected StringProperty routesDirection;
    protected StringProperty routesTo;
    public route_model(){}
    public route_model(int routeId){
        this.routeId = new SimpleIntegerProperty(routeId);
    }
    public route_model(int routeId, String routesFrom, String routesDirection,
    String routesTo) {
        this.routeId = new SimpleIntegerProperty(routeId);
        this.routesFrom = new SimpleStringProperty(routesFrom);
        this.routesDirection = new SimpleStringProperty (routesDirection);
        this.routesTo = new SimpleStringProperty (routesTo);
    }
    public IntegerProperty getRouteId() {
        return routeId;
    }
    public void setRouteId(IntegerProperty routeId) {
        this.routeId = routeId;
    }
    public StringProperty getRoutesFrom() {
        return routesFrom;
    }
    public void setRoutesFrom(StringProperty routesFrom) {
        this.routesFrom = routesFrom;
    }
    public StringProperty getRoutesDirection() {
        return routesDirection;
    }
    public void setRoutesDirection(StringProperty routesDirection) {
        this.routesDirection = routesDirection;
    }
    public StringProperty getRoutesTo() {
        return routesTo;
    }
    public void setRoutesTo(StringProperty routesTo) {
        this.routesTo = routesTo;
    }
   
}
