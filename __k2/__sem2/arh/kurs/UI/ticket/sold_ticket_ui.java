package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket;
import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_DAO;
import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_model;
import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TextField name_field;

    @FXML
    private TextField id_field;

    @FXML
    private TextField sold_ticket_hour_column_field;

    @FXML
    private TextField route_id_field;

    @FXML
    private TextField sold_ticket_week_column_field;

    @FXML
    private TextField sold_ticket_mounth_column_field;
    @FXML
    private Button delete_button;

    private sold_ticket_request  sold_tickets;

    private ObservableList<sold_ticket_model>  sold_ticket_models;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_field.getText().isEmpty() || sold_ticket_hour_column_field.getText().isEmpty() || route_id_field.getText().isEmpty()
    || sold_ticket_week_column_field.getText().isEmpty()|| sold_ticket_mounth_column_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int  sold_Id = Integer.parseInt(id_field.getText());
    int routesId = Integer.parseInt(route_id_field.getText());
    int sold_ticket_hour = Integer.parseInt(sold_ticket_hour_column_field.getText());
    int sold_ticket_week = Integer.parseInt(sold_ticket_week_column_field.getText());
    int sold_ticket_mounth = Integer.parseInt(sold_ticket_mounth_column_field.getText());
    String type = name_field.getText();
    sold_ticket sold_ticket = new sold_ticket(sold_Id,type, routesId, sold_ticket_hour, sold_ticket_week, sold_ticket_mounth);
    new  sold_ticket_DAO().addSoldTicket(sold_ticket);
    clean(id_field,route_id_field, name_field,sold_ticket_hour_column_field,route_id_field,sold_ticket_week_column_field,sold_ticket_mounth_column_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
     sold_ticket_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getTicket_id().get();
    new  sold_ticket_DAO().deleteSoldTicket(id);
    clean(id_field,route_id_field, name_field,sold_ticket_hour_column_field,route_id_field,sold_ticket_week_column_field,sold_ticket_mounth_column_field);
    updateTable();
}

@FXML
private void SelectButton(){
    sold_ticket_model selected = table.getSelectionModel().getSelectedItem();
     id_field.setText(String.valueOf(selected.getTicket_id().get()));
    route_id_field.setText(String.valueOf(selected.getRouteId().get()));
    name_field.setText(selected.getType().get());
    sold_ticket_hour_column_field.setText(String.valueOf(selected.getSold_ticket_hour().get()));
    sold_ticket_week_column_field.setText(String.valueOf(selected.getSold_ticket_week().get()));
    sold_ticket_mounth_column_field.setText(String.valueOf(selected.getSold_ticket_mounth().get()));

}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (name_field.getText().isEmpty() || id_field.getText().isEmpty() || sold_ticket_hour_column_field.getText().isEmpty() || route_id_field.getText().isEmpty()
    || sold_ticket_week_column_field.getText().isEmpty()|| sold_ticket_mounth_column_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int  sold_Id = Integer.parseInt(id_field.getText());
    int routesId = Integer.parseInt(route_id_field.getText());
    int sold_ticket_hour = Integer.parseInt(sold_ticket_hour_column_field.getText());
    int sold_ticket_week = Integer.parseInt(sold_ticket_week_column_field.getText());
    int sold_ticket_mounth = Integer.parseInt(sold_ticket_mounth_column_field.getText());
    String type = name_field.getText();
    sold_ticket sold_ticket = new sold_ticket(sold_Id,type, routesId, sold_ticket_hour, sold_ticket_week, sold_ticket_mounth);
    new  sold_ticket_DAO().updateSoldTicket(sold_ticket);
    clean(id_field,route_id_field, name_field,sold_ticket_hour_column_field,route_id_field,sold_ticket_week_column_field,sold_ticket_mounth_column_field);
    updateTable();
     }
}
private void updateTable() throws SQLException {
    sold_ticket_models.clear();
    sold_ticket_models.addAll( sold_tickets.getAllSoldTickets());
    table.setItems( sold_ticket_models);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        sold_tickets = new  sold_ticket_request();
        sold_ticket_models = FXCollections.observableArrayList();

       id_column.setCellValueFactory(cellData->cellData.getValue().getTicket_id().asObject());
       type_column.setCellValueFactory(cellData->cellData.getValue().getType());
       route_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());
       from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
       direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
       to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
       sold_ticket_hour_column.setCellValueFactory(cellData->cellData.getValue().getSold_ticket_hour().asObject());
       sold_ticket_week_column.setCellValueFactory(cellData->cellData.getValue().getSold_ticket_week().asObject());
       sold_ticket_mounth_column.setCellValueFactory(cellData->cellData.getValue().getSold_ticket_mounth().asObject());
    

      
       try {
        sold_ticket_models.addAll( sold_tickets.getAllSoldTickets());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( sold_ticket_models);

       connection.close();
    }
}
