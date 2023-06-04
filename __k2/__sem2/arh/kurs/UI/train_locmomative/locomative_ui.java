package __k2.__sem2.arh.kurs.UI.train_locmomative;

import java.net.URL;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;

import __k2.__sem2.arh.kurs.locomative.locomative_model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class locomative_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<locomative_model> table;

    @FXML
    private TableColumn<locomative_model, Integer> id_column;

    @FXML
    private TableColumn<locomative_model, String> name_column;

    @FXML
    private TableColumn<locomative_model, Integer> age_column;

    @FXML
    private TableColumn<locomative_model, Integer> department_column;

    @FXML
    private TableColumn<locomative_model, Integer> completed_routes_column;

    @FXML
    private TableColumn<locomative_model, Integer> completed_routes_before_repair_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField age_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField department_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField completed_routes_before_repair_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField completed_routes_field;

    @FXML
    void initialize() {
        switchBack(back_button);

    }
}
