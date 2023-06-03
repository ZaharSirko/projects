package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class redeemed_tickets_ui extends scene_ {

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
    private TableColumn<?, ?> type_column;

    @FXML
    private TableColumn<?, ?> from_column;

    @FXML
    private TableColumn<?, ?> direction_column;

    @FXML
    private TableColumn<?, ?> to_column;

    @FXML
    private TableColumn<?, ?> redeemed_tickets_column;

    @FXML
    private TableColumn<?, ?> route_id_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField from_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField direction_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField not_redeemed_tickets_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField to_field;

    @FXML
    private TextField route_id_field;

    @FXML
    void initialize() {
        switchBack(back_button);

    }
}
