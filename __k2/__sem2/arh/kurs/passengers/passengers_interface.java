package __k2.__sem2.arh.kurs.passengers;

import java.sql.SQLException;
import java.util.List;

public interface passengers_interface {
    List<passengers> getAllPassengers() throws SQLException;
    void addPassenger(passengers passenger);
    void updatePassenger(passengers passenger);
    void deletePassenger(int id);
    passengers getPassengerById(int id);
}
