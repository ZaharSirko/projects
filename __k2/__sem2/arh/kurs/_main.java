package __k2.__sem2.arh.kurs;
import java.sql.*;
import java.util.Scanner;


import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker_request;
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
        
            default:
                break;
        } 
    }
}
