package __k2.__sem2.arh.kurs.route.canceled_routes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class canceled_routes_request extends _connection {
    public void getAllcanceled_routess() throws SQLException {
        // canceled_routes_DAO canceled_routes_DAO = new canceled_routes_DAO();
        List<canceled_routes> canceled_routess = new canceled_routes_DAO().getAllCanceledRoutes();

        for (canceled_routes canceled_routes : canceled_routess) {
            System.out.println(canceled_routes.getCanceled_routes_id()+" "+canceled_routes.getFrom()+" "+canceled_routes.getDirection()+" "+canceled_routes.getTo()
            +" "+canceled_routes.canceled_routes_type);
        }
        

        connection.close();
    }
    public List<canceled_routes_model> getAllCanceledRoutes() throws SQLException {
        List<canceled_routes_model> canceledRoutes = new ArrayList<>();
 
        List<canceled_routes> canceledRouteList = new canceled_routes_DAO().getAllCanceledRoutes();

        for (canceled_routes canceledRoute : canceledRouteList) {
            canceled_routes_model canceledRouteModel = new canceled_routes_model(
                    canceledRoute.getId(),
                    canceledRoute.getFrom(),
                    canceledRoute.getDirection(),
                    canceledRoute.getTo(),
                    canceledRoute.getCanceled_routes_id(),
                    canceledRoute.getCanceled_routes_type()
            );

            canceledRoutes.add(canceledRouteModel);
        }

        return canceledRoutes;
        
    }
    
}
