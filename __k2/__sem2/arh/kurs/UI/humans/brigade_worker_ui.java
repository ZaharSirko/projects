package __k2.__sem2.arh.kurs.UI.humans;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class brigade_worker_ui {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> id_column;

    @FXML
    private TableColumn<?, ?> surename_column;

    @FXML
    private TableColumn<?, ?> name_column;

    @FXML
    private TableColumn<?, ?> department_column;

    @FXML
    private TableColumn<?, ?> sallary_column;

    @FXML
    private TableColumn<?, ?> age_column;

    @FXML
    private Button select_department_button;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField surename_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField department_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField age_field;

    @FXML
    private TextField select_department_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField sallaey_field;

    @FXML
    private TextArea avg_sallary_field;

    @FXML
    void initialize() {


    }
}
