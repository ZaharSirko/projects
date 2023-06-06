package __k2.__sem2.arh.kurs.railway_station_worker;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import __k2.__sem2.arh.kurs._connection;

public class railway_station_worker_request extends _connection {
    public List<railway_station_worker_model> getAllRailwayStationWorker() throws SQLException {
        List<railway_station_worker_model>  RailwayStationWorker = new ArrayList<>();
        
        List<railway_station_worker> RailwayStationWorkerList = new railway_station_worker_DAO().getAllRailwayStationWorker();

        
        for (railway_station_worker  RailwayStationWorkers :  RailwayStationWorkerList) {
            railway_station_worker_model  RailwayStationWorkerModel = new railway_station_worker_model(
                RailwayStationWorkers.getId(),
                RailwayStationWorkers.getName(),
                RailwayStationWorkers.getSurename(),
                RailwayStationWorkers.getAge(),
                RailwayStationWorkers.getGender(),
                RailwayStationWorkers.getChildren(),
                RailwayStationWorkers.getChief(),
                RailwayStationWorkers.getDepartment(),
                RailwayStationWorkers.getWorkExperience(),
                RailwayStationWorkers.getSalary()
            );

            RailwayStationWorker.add(RailwayStationWorkerModel);
        }

        return  RailwayStationWorker;
    }

}
