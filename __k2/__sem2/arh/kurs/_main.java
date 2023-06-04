package __k2.__sem2.arh.kurs;
import java.sql.SQLException;

import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_request;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class _main extends  Application  {
    public static void main(String[] args) throws SQLException {
     launch();
    // new not_redeemed_tickets_request().getAllNotRedeemedTickets();
    }


     @Override
     public void start(Stage stage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("/__k2/__sem2/arh/kurs/UI/menu.fxml"));
         stage.setScene(new Scene(root));
         stage.show();
     }
}

