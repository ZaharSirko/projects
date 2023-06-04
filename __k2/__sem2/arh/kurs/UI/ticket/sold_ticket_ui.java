package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;

import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class sold_ticket_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<sold_ticket_model> table;

    @FXML
    private TableColumn<sold_ticket_model, Integer> id_column;

    @FXML
    private TableColumn<sold_ticket_model,String> type_column;

    @FXML
    private TableColumn<sold_ticket_model, Integer> route_id_column;

    @FXML
    private TableColumn<sold_ticket_model, String> from_column;

    @FXML
    private TableColumn<sold_ticket_model, String> direction_column;

    @FXML
    private TableColumn<sold_ticket_model, String> to_column;

    @FXML
    private TableColumn<sold_ticket_model, Integer> sold_ticket_hour_column;

    @FXML
    private TableColumn<sold_ticket_model, Integer> sold_ticket_week_column;

    @FXML
    private TableColumn<sold_ticket_model, Integer> sold_ticket_mounth_column;

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
    private TextField sold_ticket_hour_column_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField to_field;

    @FXML
    private TextField route_id_field;

    @FXML
    private TextField sold_ticket_week_column_field;

    @FXML
    private TextField sold_ticket_mounth_column_field;

    @FXML
    void initialize() {
        switchBack(back_button);

    }
}
