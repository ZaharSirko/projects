package __k2.__sem2.arh.kurs.UI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;




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
        switchToScen(brigade_worker_button,"/__k2/__sem2/arh/kurs/UI/humans/brigade_worker.fxml");
        switchToScen(locomative_drivers_button,"/__k2/__sem2/arh/kurs/UI/humans/locomative_drivers.fxml");
        switchToScen(locomative_button,"/__k2/__sem2/arh/kurs/UI/train_locmomative/locomative.fxml");
        switchToScen(train_button,"/__k2/__sem2/arh/kurs/UI/train_locmomative/train.fxml");
        switchToScen(canceled_routes_button,"/__k2/__sem2/arh/kurs/UI/route/canceled_routes.fxml");
        switchToScen(delayed_routes_button,"/__k2/__sem2/arh/kurs/UI/route/delayed_routes.fxml");
        switchToScen(sold_ticket_button,"/__k2/__sem2/arh/kurs/UI/ticket/sold_ticket.fxml");
        switchToScen(passengers_button,"/__k2/__sem2/arh/kurs/UI/humans/passengers.fxml");
        switchToScen(not_redeemed_tickets_button,"/__k2/__sem2/arh/kurs/UI/ticket/not_redeemed_tickets.fxml");
        switchToScen(redeemed_tickets_button,"/__k2/__sem2/arh/kurs/UI/ticket/redeemed_tickets.fxml");
        switchToScen(routes_button,"/__k2/__sem2/arh/kurs/UI/route/route.fxml");
        ExitButton(exit_button);
    }
  
}

