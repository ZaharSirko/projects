package __k2.__sem2.arh.kurs.train;

import __k2.__sem2.arh.kurs.route.route;

public class train extends route {
    int train_id;
    String train_name;
    int routes_ticket_price;
    int routes_duration;
    public train(){
        super();
    }
    public train(int id, int train_id, String train_name,int routes_ticket_price, int routes_duration) {
        super(id);
        this.train_id = train_id;
        this.train_name = train_name;
        this.routes_ticket_price = routes_ticket_price;
        this.routes_duration = routes_duration;
    }
    public train(int train_id, int routesId, String train_name, int routes_ticket_price, int routes_duration,
            String routesFrom, String routesDirection, String routesTo) {
                super(routesId,routesFrom,routesDirection,routesTo);
                this.train_id = train_id;
                this.train_name = train_name;
                this.routes_ticket_price = routes_ticket_price;
                this.routes_duration = routes_duration;
    }
    public int getTrain_id() {
        return train_id;
    }
    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }
    public String getTrain_name() {
        return train_name;
    }
    public void setTrain_name(String trainName) {
        this.train_name = trainName;
    }
    public int getRoutes_ticket_price() {
        return routes_ticket_price;
    }
    public void setRoutes_ticket_price(int routes_ticket_price) {
        this.routes_ticket_price = routes_ticket_price;
    }
    public int getRoutes_duration() {
        return routes_duration;
    }
    public void setRoutes_duration(int routes_duration) {
        this.routes_duration = routes_duration;
    }
}
