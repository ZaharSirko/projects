package __k2.__sem2.arh.kurs;
import java.sql.*;
import java.util.Scanner;


import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker_request;
import __k2.__sem2.arh.kurs.locomative.locomative;
import __k2.__sem2.arh.kurs.locomative.locomative_request;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_request;
import __k2.__sem2.arh.kurs.passengers.passengers_request;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_request;
import __k2.__sem2.arh.kurs.route.canceled_routes.canceled_routes;
import __k2.__sem2.arh.kurs.route.canceled_routes.canceled_routes_request;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes_request;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_request;
import __k2.__sem2.arh.kurs.ticket.redeemed_tickets.redeemed_tickets_request;
import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_request;
import __k2.__sem2.arh.kurs.train.train;
import __k2.__sem2.arh.kurs.train.train_request;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class _main extends Application {
    public static void main(String[] args) throws SQLException {
    //     Scanner sc = new Scanner(System.in);
    //    int req =  sc.nextInt();
    launch(args);
        switch (12) {
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
                case 6:
                new train_request().getTrainRoutes();
                break;
                case 7:
                new canceled_routes_request().getAllcanceled_routess();;
                break;
                case 8:
                new delayed_routes_request().getAlldelayed_routess();
                break;
                case 9:
               new sold_ticket_request().getAllSoldTicket();
                break;
                case 10:
                new passengers_request().getAllPassengers();
                break;
                case 11:
                new redeemed_tickets_request().getAllRedeemedTickets();
                break;
                case 12:
                new not_redeemed_tickets_request().getAllNotRedeemedTickets();
                break;
        
            default:
                break;
        } 
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("railway_station_worker.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}

