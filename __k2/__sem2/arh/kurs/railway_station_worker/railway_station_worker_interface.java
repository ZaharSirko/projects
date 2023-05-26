package __k2.__sem2.arh.kurs.railway_station_worker;

import java.util.List;

public interface railway_station_worker_interface {
    List<railway_station_worker> getAllRailwayStationWorker();
    int NumberOfRailwayStationWorker();
    void addRailwayStationWorker(railway_station_worker worker);
    void updateRailwayStationWorker(railway_station_worker worker);
    void deleteRailwayStationWorker(int id);
    railway_station_worker getRailwayStationWorkerById(int id);
}
