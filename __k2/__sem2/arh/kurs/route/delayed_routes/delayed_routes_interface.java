package __k2.__sem2.arh.kurs.route.delayed_routes;

import java.sql.SQLException;
import java.util.List;

public interface delayed_routes_interface {
    List<delayed_routes> getAllDelayedRoutes() throws SQLException;
    void addDelayed_routes(delayed_routes routes);
    void updateDelayed_routes(delayed_routes routes);
    void deleteDelayed_routes(int id);
}
