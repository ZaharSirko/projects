package __k2.__sem2.arh.kurs.UI.route;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class delayed_routes_ui {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> routes_id_column;

    @FXML
    private TableColumn<?, ?> routes_from_column;

    @FXML
    private TableColumn<?, ?> direction_column;

    @FXML
    private TableColumn<?, ?> routes_to_column;

    @FXML
    private TableColumn<?, ?> id_column;

    @FXML
    private TableColumn<?, ?> reason_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField routes_id_field;

    @FXML
    private TextField route_from_field;

    @FXML
    private TextField direction_field;

    @FXML
    private TextField route_to_field;

    @FXML
    private TextField id_field;

    @FXML
    private TextField reason_field;

    @FXML
    void initialize() {


    }
}
