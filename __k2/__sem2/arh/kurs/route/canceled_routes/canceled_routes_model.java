package __k2.__sem2.arh.kurs.route.canceled_routes;


import __k2.__sem2.arh.kurs.route.route_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class canceled_routes_model extends route_model {
    private IntegerProperty canceledRoutesId;
    private StringProperty canceledRoutesType;



    public canceled_routes_model(int routeId, String routesFrom, String routesDirection,
    String routesTo, int canceledRoutesId, String canceledRoutesType) {
        super(routeId, routesFrom, routesDirection, routesTo);
        this.canceledRoutesId = new SimpleIntegerProperty(canceledRoutesId);
        this.canceledRoutesType = new SimpleStringProperty (canceledRoutesType);
    }

    public canceled_routes_model(int routeId,int canceledRoutesId, String canceledRoutesType){
        super(routeId);
        this.canceledRoutesId = new SimpleIntegerProperty(canceledRoutesId);
        this.canceledRoutesType = new SimpleStringProperty (canceledRoutesType);
    }



    public IntegerProperty getCanceledRoutesId() {
        return canceledRoutesId;
    }



    public void setCanceledRoutesId(IntegerProperty canceledRoutesId) {
        this.canceledRoutesId = canceledRoutesId;
    }



    public StringProperty getCanceledRoutesType() {
        return canceledRoutesType;
    }



    public void setCanceledRoutesType(StringProperty canceledRoutesType) {
        this.canceledRoutesType = canceledRoutesType;
    }

  

}
