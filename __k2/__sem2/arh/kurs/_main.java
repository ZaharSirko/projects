package __k2.__sem2.arh.kurs;
import java.sql.*;
import java.util.Scanner;


import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker_request;
import __k2.__sem2.arh.kurs.locomative.locomative;
import __k2.__sem2.arh.kurs.locomative.locomative_request;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_request;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_request;



public class _main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
       int req =  sc.nextInt();
        switch (req) {
            case 1:
           new railway_station_worker_request().req1();
                break;
                case 2:
                new brigade_worker_request().req2();
                break;
                case 3:
                new locomative_drivers_request().req3();;
                break;
                case 4:
                new locomative_request().req4_5();
                break;
        
            default:
                break;
        } 
    }
}

