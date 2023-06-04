package __k2.__sem2.arh.kurs.route;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class route_request {
    public List<route_model> getAllRoutes() throws SQLException {
        List<route_model> Routes = new ArrayList<>();
 
        List<route> RouteList = new route_DAO().getAllRoutes();

        for (route Route : RouteList) {
            route_model RouteModel = new route_model(
                Route.getId(),
                Route.getFrom(),
                Route.getDirection(),
                Route.getTo()
            );

            Routes.add(RouteModel);
        }

        return Routes;
    }
}
