package __k2.__sem2.arh.UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class menu{
    private Stage stage;
    private Scene scene;
    private Parent root;

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
        // railway_station_worker_button.setOnAction(event ->{
        //     root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        //     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //     scene = new Scene(root);
        //     stage.setScene(scene);
        //     stage.show();
        // });

    }

  
}

