package __k2.__sem2.arh.kurs.UI.train_locmomative;

import java.net.URL;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.train.train;
import __k2.__sem2.arh.kurs.train.train_model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class train_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<train_model> table;

    @FXML
    private TableColumn<train_model, Integer> id_column;

    @FXML
    private TableColumn<train_model, Integer> routes_id_column;

    @FXML
    private TableColumn<train_model, String> name_column1;

    @FXML
    private TableColumn<train_model, Integer> ticket_price_column;

    @FXML
    private TableColumn<train_model, Integer> routes_duration_column;

    @FXML
    private TableColumn<train_model,Integer> routes_from_column;

    @FXML
    private TableColumn<train_model, Integer> direction_column;

    @FXML
    private TableColumn<train_model, Integer> routes_to_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField name_field;

    @FXML
    private TextField id_ield;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField routes_id_field;

    @FXML
    private TextField tcket_price_field;

    @FXML
    private TextField route_duration_field;

    @FXML
    private TextField route_from_field;

    @FXML
    private TextField direction_field;

    @FXML
    private TextField route_to_field;

    @FXML
    void initialize() {
        switchBack(back_button);

    }
}
