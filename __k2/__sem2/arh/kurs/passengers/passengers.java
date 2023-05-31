package __k2.__sem2.arh.kurs.passengers;

import __k2.__sem2.arh.kurs.worker.human;

public class passengers extends human {
    String routes_to;

    public passengers(int id, String name, String surename, int age, String gender, String routes_to) {
        super(id, name, surename, age, gender);
        this.routes_to = routes_to;
    }

    public String getRoutes_to() {
        return routes_to;
    }

    public void setRoutes_to(String routes_to) {
        this.routes_to = routes_to;
    }
}
