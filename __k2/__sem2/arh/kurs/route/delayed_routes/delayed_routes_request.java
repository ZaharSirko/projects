package __k2.__sem2.arh.kurs.route.delayed_routes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class delayed_routes_request extends _connection  {
    public void getAlldelayed_routess() throws SQLException {
        List<delayed_routes> delayed_route = new delayed_routes_DAO().getAllDelayedRoutes();

        for (delayed_routes delayed_routes : delayed_route) {
            System.out.println(delayed_routes.getDelayed_routes() +" "+delayed_routes.getFrom()+" "+delayed_routes.getDirection()+" "+delayed_routes.getTo()
            +" "+delayed_routes.getDelayed_routes_reason());
        }

        connection.close();
    }
    public List<delayed_routes_model> getAllDelayedRoutes() throws SQLException {
        List<delayed_routes_model> DelayedRoutes = new ArrayList<>();
 
        List<delayed_routes> DelayedRouteList = new delayed_routes_DAO().getAllDelayedRoutes();

        for (delayed_routes DelayedRoute : DelayedRouteList) {
            delayed_routes_model DelayedRouteModel = new delayed_routes_model(
                DelayedRoute.getDelayed_routes(),    
                 DelayedRoute.getId(),
                 DelayedRoute.getFrom(),
                DelayedRoute.getDirection(),
                DelayedRoute.getTo(),
                DelayedRoute.getDelayed_routes_reason()
            );

            DelayedRoutes.add(DelayedRouteModel);
        }

        return DelayedRoutes;
    }
}
