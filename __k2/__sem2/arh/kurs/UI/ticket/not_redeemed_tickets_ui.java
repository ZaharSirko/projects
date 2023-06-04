package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_model;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class not_redeemed_tickets_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<not_redeemed_tickets_model> table;

    @FXML
    private TableColumn<not_redeemed_tickets_model, Integer> id_column;

    @FXML
    private TableColumn<not_redeemed_tickets_model, String> type_column;

    @FXML
    private TableColumn<not_redeemed_tickets_model, String>  routes_from_column;

    @FXML
    private TableColumn<not_redeemed_tickets_model, String> direction_column;

    @FXML
    private TableColumn<not_redeemed_tickets_model, String>  routes_to_column;

    @FXML
    private TableColumn<not_redeemed_tickets_model, Integer> not_redeemed_tickets_column;

    @FXML
    private TableColumn<not_redeemed_tickets_model, Integer> routes_id_column;

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
    private TextField id_field;

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

    private not_redeemed_tickets_request not_redeemed_tickets;

    private ObservableList<not_redeemed_tickets_model> not_redeemed_tickets_model;

    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        not_redeemed_tickets = new not_redeemed_tickets_request();
        not_redeemed_tickets_model = FXCollections.observableArrayList();

        id_column.setCellValueFactory(cellData->cellData.getValue().getTicket_id().asObject());
        type_column.setCellValueFactory(cellData->cellData.getValue().getType());
        routes_from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
        routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
        not_redeemed_tickets_column.setCellValueFactory(cellData->cellData.getValue().getNot_redeemed_tickets().asObject());
        routes_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());

       
        try {
            not_redeemed_tickets_model.addAll(not_redeemed_tickets.getAllNotRedeemedTicket());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        table.setItems(not_redeemed_tickets_model);

        connection.close();
    }
}
