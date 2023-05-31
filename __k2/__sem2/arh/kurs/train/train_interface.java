package __k2.__sem2.arh.kurs.train;

import java.sql.SQLException;
import java.util.List;
import __k2.__sem2.arh.kurs.route.route;

public interface train_interface {
    List<train> getAllTrainsRoutes() throws SQLException;
    List<route> getTrainRoutes(int trainId) throws SQLException;
    void addTrains(train trains);
    void updateTrains(train trains);
    void deleteTrains(int id);
    train getTrainsById(int id);
}
