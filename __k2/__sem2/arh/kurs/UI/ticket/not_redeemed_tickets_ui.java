package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_DAO;
import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_model;
import __k2.__sem2.arh.kurs.ticket.not_redeemed_tickets.not_redeemed_tickets_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TextField name_field;

    @FXML
    private TextField id_field;

    @FXML
    private TextField not_redeemed_tickets_field;
    @FXML
    private TextField route_id_field;
    
    @FXML
    private Button delete_button;


    private not_redeemed_tickets_request not_redeemed_ticket;

    private ObservableList<not_redeemed_tickets_model> not_redeemed_tickets_models;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_field.getText().isEmpty() || not_redeemed_tickets_field.getText().isEmpty() || route_id_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int not_redeemed_tickets_Id = Integer.parseInt(id_field.getText());
    int routesId = Integer.parseInt(route_id_field.getText());
    int not_redeemed_tickets = Integer.parseInt(not_redeemed_tickets_field.getText());
    String type = name_field.getText();
    not_redeemed_tickets not_redeemed_ticke = new not_redeemed_tickets(not_redeemed_tickets_Id, type, routesId, not_redeemed_tickets);
    new not_redeemed_tickets_DAO().addNotRedeemedTickets(not_redeemed_ticke);
    clean(id_field,route_id_field,not_redeemed_tickets_field,name_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    not_redeemed_tickets_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getTicket_id().get();
    new not_redeemed_tickets_DAO().deleteNotRedeemedTickets(id);
     clean(id_field,route_id_field,not_redeemed_tickets_field,name_field);
    updateTable();
}

@FXML
private void SelectButton(){
    not_redeemed_tickets_model selected = table.getSelectionModel().getSelectedItem();
    id_field.setText(String.valueOf(selected.getTicket_id().get()));
    route_id_field.setText(String.valueOf(selected.getRouteId().get()));
    not_redeemed_tickets_field.setText(String.valueOf(selected.getNot_redeemed_tickets().get()));
    name_field.setText(selected.getType().get());

}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (name_field.getText().isEmpty() || id_field.getText().isEmpty() || not_redeemed_tickets_field.getText().isEmpty() || route_id_field.getText().isEmpty()) {
        Alerts();
      }
     else{
      int not_redeemed_tickets_Id = Integer.parseInt(id_field.getText());
      int routesId = Integer.parseInt(route_id_field.getText());
      int not_redeemed_tickets = Integer.parseInt(not_redeemed_tickets_field.getText());
      String type = name_field.getText();
      not_redeemed_tickets not_redeemed_ticke = new not_redeemed_tickets(not_redeemed_tickets_Id, type, routesId, not_redeemed_tickets);
      new not_redeemed_tickets_DAO().updateNotRedeemedTickets(not_redeemed_ticke);
      clean(id_field,route_id_field,not_redeemed_tickets_field,name_field);
      updateTable();
     }
}
private void updateTable() throws SQLException {
    not_redeemed_tickets_models.clear();
    not_redeemed_tickets_models.addAll(not_redeemed_ticket.getAllNotRedeemedTicket());
    table.setItems(not_redeemed_tickets_models);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        not_redeemed_ticket = new not_redeemed_tickets_request();
        not_redeemed_tickets_models = FXCollections.observableArrayList();

        id_column.setCellValueFactory(cellData->cellData.getValue().getTicket_id().asObject());
        type_column.setCellValueFactory(cellData->cellData.getValue().getType());
        routes_from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
        routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
        not_redeemed_tickets_column.setCellValueFactory(cellData->cellData.getValue().getNot_redeemed_tickets().asObject());
        routes_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());

       
        try {
            not_redeemed_tickets_models.addAll(not_redeemed_ticket.getAllNotRedeemedTicket());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        table.setItems(not_redeemed_tickets_models);

        connection.close();
    }
}
