package __k2.__sem2.arh.kurs.UI.humans;

import java.net.URL;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.passengers.passengers;
import __k2.__sem2.arh.kurs.passengers.passengers_model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class passengers_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<passengers_model> table;

    @FXML
    private TableColumn<passengers_model, Integer> id_column;

    @FXML
    private TableColumn<passengers_model, String> surename_column;

    @FXML
    private TableColumn<passengers_model, String> name_column;

    @FXML
    private TableColumn<passengers_model, String> gender_column;

    @FXML
    private TableColumn<passengers_model, Integer> age_column;

    @FXML
    private TableColumn<passengers_model, Integer> routes_to_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField surename_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField gender_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField routes_to_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField age_field;

    @FXML
    void initialize() {
        switchBack(back_button);

    }
}
