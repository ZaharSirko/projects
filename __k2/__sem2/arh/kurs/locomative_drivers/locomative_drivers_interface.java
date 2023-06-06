package __k2.__sem2.arh.kurs.locomative_drivers;

import java.util.List;

public interface locomative_drivers_interface {
    List<locomative_drivers> getAllLocomativeDrivers();
    void addLocomativeDrivers(locomative_drivers locomative_drivers);
    void updateLocomativeDrivers(locomative_drivers locomative_drivers);
    void deleteLocomativeDrivers(int id);
}
