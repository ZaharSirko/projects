package __k2.__sem2.arh.kurs.UI;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class menu extends scene_{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button railway_station_worker_button;

    @FXML
    private Button brigade_worker_button;

    @FXML
    private Button locomative_drivers_button;

    @FXML
    private Button locomative_button;

    @FXML
    private Button train_button;

    @FXML
    private Button canceled_routes_button;

    @FXML
    private Button delayed_routes_button;

    @FXML
    private Button sold_ticket_button;

    @FXML
    private Button passengers_button;

    @FXML
    private Button not_redeemed_tickets_button;

    @FXML
    private Button redeemed_tickets_button;

    @FXML
    private Button exit_button;

    @FXML
    private Button routes_button;

    @FXML
    void initialize() {
        switchToScen(railway_station_worker_button,"/__k2/__sem2/arh/kurs/UI/humans/railway_station_worker.fxml");

    }
  
}

