package __k2.__sem2.arh.kurs.railway_station_worker;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import __k2.__sem2.arh.kurs._connection;

public class railway_station_worker_request extends _connection {
    public void req1() throws SQLException{
        railway_station_worker_DAO rStation_worker_DAO = new railway_station_worker_DAO();
        List<railway_station_worker> railwayStationWorkers = rStation_worker_DAO.getAllRailwayStationWorker();

        for (railway_station_worker railway_station_worker : railwayStationWorkers) {
            System.out.println(railway_station_worker.getSurename()+" "+railway_station_worker.getName()
            +" "+railway_station_worker.getAge()+" "+railway_station_worker.getGender()+" "+railway_station_worker.getChildren()
            +" "+railway_station_worker.getChief()+" "+railway_station_worker.getDepartment()+" "+railway_station_worker.getWorkExperience()
            +" "+railway_station_worker.getSalary());
        }

        int NumberOfRailwayStationWorker = rStation_worker_DAO.NumberOfRailwayStationWorker();
        System.out.println("Number Of Railway Station Worker "+ NumberOfRailwayStationWorker);


    //     railway_station_worker newRailwayStationWorker = new railway_station_worker(15,"Джон","Доу",19,"Чоловіча",0,"-",2,2,100000);
    //     rStation_worker_DAO.addRailwayStationWorker(newRailwayStationWorker);
    // System.out.println("Новий працівник доданий");

    // Оновлення інформації про працівника
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Введіть ID працівника для оновлення: ");
    // int updateId = sc.nextInt();
    // railway_station_worker updateRailwayStationWorker = rStation_worker_DAO.getRailwayStationWorkerById(updateId);
    // if (updateRailwayStationWorker != null) {
    //     updateRailwayStationWorker.setName("Updated Name");
    //     updateRailwayStationWorker.setSurename("Updated Surename");
    //     updateRailwayStationWorker.setAge(11);
    //     updateRailwayStationWorker.setDepartment(2);
    //     updateRailwayStationWorker.setSalary(2000);
    //     rStation_worker_DAO.updateRailwayStationWorker(updateRailwayStationWorker);
    //     System.out.println("Інформація про працівника оновлена");
    // } else {
    //     System.out.println("Працівник з ID " + updateId + " не знайдений");
    // }

    // Видалення працівника
    
    // System.out.print("Введіть ID працівника для видалення: ");
    // int deleteId = sc.nextInt();
    // rStation_worker_DAO.deleteRailwayStationWorker(deleteId);
    // System.out.println("Працівник з ID " + deleteId + " видалений");

    connection.close();
    // sc.close();





    }


}
