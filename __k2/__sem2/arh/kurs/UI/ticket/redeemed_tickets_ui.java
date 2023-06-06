package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.ticket.redeemed_tickets.redeemed_tickets;
import __k2.__sem2.arh.kurs.ticket.redeemed_tickets.redeemed_tickets_DAO;
import __k2.__sem2.arh.kurs.ticket.redeemed_tickets.redeemed_tickets_model;
import __k2.__sem2.arh.kurs.ticket.redeemed_tickets.redeemed_tickets_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TableView<redeemed_tickets_model> table;

    @FXML
    private TableColumn<redeemed_tickets_model, Integer> id_column;

    @FXML
    private TableColumn<redeemed_tickets_model, String> type_column;

    @FXML
    private TableColumn<redeemed_tickets_model, String> from_column;

    @FXML
    private TableColumn<redeemed_tickets_model, String> direction_column;

    @FXML
    private TableColumn<redeemed_tickets_model, String> to_column;

    @FXML
    private TableColumn<redeemed_tickets_model, Integer> redeemed_tickets_column;

    @FXML
    private TableColumn<redeemed_tickets_model, Integer> route_id_column;

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
    private TextField  redeemed_tickets_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField to_field;

    @FXML
    private TextField route_id_field;

    private redeemed_tickets_request  redeemed_tickets;

    private ObservableList<redeemed_tickets_model>  redeemed_tickets_model;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_field.getText().isEmpty() || redeemed_tickets_field.getText().isEmpty() || route_id_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int  redeemed_tickets_Id = Integer.parseInt(id_field.getText());
    int routesId = Integer.parseInt(route_id_field.getText());
    int  redeemed_tickets = Integer.parseInt(redeemed_tickets_field.getText());
    String type = name_field.getText();
    redeemed_tickets redeemed_ticke = new redeemed_tickets(redeemed_tickets_Id, type, routesId, redeemed_tickets);
    new  redeemed_tickets_DAO().addRedeemedTickets(redeemed_ticke);
    clean(id_field,route_id_field, redeemed_tickets_field,name_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
     redeemed_tickets_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getTicket_id().get();
    new  redeemed_tickets_DAO().deleteRedeemedTickets(id);
     clean(id_field,route_id_field, redeemed_tickets_field,name_field);
    updateTable();
}

@FXML
private void SelectButton(){
     redeemed_tickets_model selected = table.getSelectionModel().getSelectedItem();
     id_field.setText(String.valueOf(selected.getTicket_id().get()));
    route_id_field.setText(String.valueOf(selected.getRouteId().get()));
     redeemed_tickets_field.setText(String.valueOf(selected.getRedeemed_tickets().get()));
    name_field.setText(selected.getType().get());

}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (name_field.getText().isEmpty() ||  id_field.getText().isEmpty() ||  redeemed_tickets_field.getText().isEmpty() || route_id_field.getText().isEmpty()) {
        Alerts();
      }
     else{
      int  redeemed_tickets_Id = Integer.parseInt(id_field.getText());
      int routesId = Integer.parseInt(route_id_field.getText());
      int  redeemed_tickets = Integer.parseInt( redeemed_tickets_field.getText());
      String type = name_field.getText();
       redeemed_tickets  redeemed_ticke = new  redeemed_tickets( redeemed_tickets_Id, type, routesId,  redeemed_tickets);
      new  redeemed_tickets_DAO().updateRedeemedTickets(redeemed_ticke);
      clean(id_field,route_id_field, redeemed_tickets_field,name_field);
      updateTable();
     }
}
private void updateTable() throws SQLException {
    redeemed_tickets_model.clear();
    redeemed_tickets_model.addAll( redeemed_tickets.getAllRedeemedTicket());
    table.setItems( redeemed_tickets_model);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
         redeemed_tickets = new  redeemed_tickets_request();
         redeemed_tickets_model = FXCollections.observableArrayList();

        id_column.setCellValueFactory(cellData->cellData.getValue().getTicket_id().asObject());
        type_column.setCellValueFactory(cellData->cellData.getValue().getType());
        from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
        to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
        redeemed_tickets_column.setCellValueFactory(cellData->cellData.getValue().getRedeemed_tickets().asObject());
        route_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());

       
        try {
             redeemed_tickets_model.addAll( redeemed_tickets.getAllRedeemedTicket());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        table.setItems( redeemed_tickets_model);

        connection.close();
    }
    }
