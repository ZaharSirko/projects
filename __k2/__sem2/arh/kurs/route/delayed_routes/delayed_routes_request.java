package __k2.__sem2.arh.kurs.route.delayed_routes;

import java.sql.SQLException;
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
}
