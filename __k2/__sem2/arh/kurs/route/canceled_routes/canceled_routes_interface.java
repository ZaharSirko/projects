package __k2.__sem2.arh.kurs.route.canceled_routes;

import java.sql.SQLException;
import java.util.List;

public interface canceled_routes_interface {
    List<canceled_routes> getAllCanceledRoutes() throws SQLException;
    void addСanceled_routes(canceled_routes routes);
    void updateСanceled_routes(canceled_routes routes);
    void deleteСanceled_routes(int id);
}
