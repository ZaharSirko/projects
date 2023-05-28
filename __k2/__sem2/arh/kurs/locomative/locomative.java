package __k2.__sem2.arh.kurs.locomative;


import __k2.__sem2.arh.kurs.worker.worker;

public class locomative extends worker {
   protected  int completed_routes, completed_routes_before_repair;

   public locomative(){
    super();
   }
public locomative(int id, String name, int age, int department, int completed_routes,
        int completed_routes_before_repair) {
    super(id, name, age, department);
    this.completed_routes = completed_routes;
    this.completed_routes_before_repair = completed_routes_before_repair;
}
public int getCompleted_routes() {
    return completed_routes;
}
public void setCompleted_routes(int completed_routes) {
    this.completed_routes = completed_routes;
}
public int getCompleted_routes_before_repair() {
    return completed_routes_before_repair;
}
public void setCompleted_routes_before_repair(int completed_routes_before_repair) {
    this.completed_routes_before_repair = completed_routes_before_repair;
}

   
}
