package __k2.__sem2.arh.kurs.passengers;

import __k2.__sem2.arh.kurs.worker.human_model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class passengers_model extends human_model {
    StringProperty routes_to;
    public passengers_model(){
        super();
    }
    public passengers_model(int id, String name, String surename, int age, String gender, String routes_to) {
        super(id, name, surename, age, gender);
        this.routes_to = new SimpleStringProperty(routes_to);
    }
    public StringProperty getRoutes_to() {
        return routes_to;
    }
    public void setRoutes_to(StringProperty routes_to) {
        this.routes_to = routes_to;
    }
}
