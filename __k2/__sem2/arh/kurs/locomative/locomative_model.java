package __k2.__sem2.arh.kurs.locomative;


import __k2.__sem2.arh.kurs.worker.worker_model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class locomative_model extends worker_model {
    protected  IntegerProperty completed_routes, completed_routes_before_repair;

    public locomative_model(){
     super();
    }
 public locomative_model(int id, String name, int age, int department, int completed_routes,
         int completed_routes_before_repair) {
     super(id, name, age, department);
     this.completed_routes = new SimpleIntegerProperty (completed_routes);
     this.completed_routes_before_repair = new SimpleIntegerProperty (completed_routes_before_repair);
 }
public IntegerProperty getCompleted_routes() {
    return completed_routes;
}
public void setCompleted_routes(IntegerProperty completed_routes) {
    this.completed_routes = completed_routes;
}
public IntegerProperty getCompleted_routes_before_repair() {
    return completed_routes_before_repair;
}
public void setCompleted_routes_before_repair(IntegerProperty completed_routes_before_repair) {
    this.completed_routes_before_repair = completed_routes_before_repair;
}
}
