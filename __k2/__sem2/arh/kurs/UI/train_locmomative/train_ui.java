package __k2.__sem2.arh.kurs.UI.train_locmomative;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.train.train;
import __k2.__sem2.arh.kurs.train.train_DAO;
import __k2.__sem2.arh.kurs.train.train_model;
import __k2.__sem2.arh.kurs.train.train_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TableColumn<train_model,String> routes_from_column;

    @FXML
    private TableColumn<train_model, String> direction_column;

    @FXML
    private TableColumn<train_model, String> routes_to_column;

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
    private TextField routes_id_field;

    @FXML
    private TextField tcket_price_field;

    @FXML
    private TextField route_duration_field;


    private train_request  train;

    private ObservableList<train_model>  train_model;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || routes_id_field.getText().isEmpty() || tcket_price_field.getText().isEmpty()|| route_duration_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    int routes_id = Integer.parseInt(routes_id_field.getText());
    int ticket_price = Integer.parseInt(tcket_price_field.getText());
    int route_duration = Integer.parseInt(route_duration_field.getText());
    String name = name_field.getText();
    train train  = new train(routes_id, id, name, ticket_price, route_duration);
    new train_DAO().addTrains(train);
    clean(id_ield,routes_id_field,tcket_price_field,route_duration_field,name_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    train_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getTrain_id().get();
    new train_DAO().deleteTrains(id);
    clean(id_ield,routes_id_field,tcket_price_field,route_duration_field,name_field);
    updateTable();
}

@FXML
private void SelectButton(){
    train_model selected = table.getSelectionModel().getSelectedItem();
    id_ield.setText(String.valueOf(selected.getTrain_id().get()));
    routes_id_field.setText(String.valueOf(selected.getRouteId().get()));
    tcket_price_field.setText(String.valueOf(selected.getRoutes_ticket_price().get()));
    route_duration_field.setText(String.valueOf(selected.getRoutes_duration().get()));
    name_field.setText(selected.getTrain_name().get());
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || routes_id_field.getText().isEmpty() || tcket_price_field.getText().isEmpty()|| route_duration_field.getText().isEmpty()) {
        Alerts();
      }
     else{
      int id = Integer.parseInt(id_ield.getText());
      int routes_id = Integer.parseInt(routes_id_field.getText());
      int ticket_price = Integer.parseInt(tcket_price_field.getText());
      int route_duration = Integer.parseInt(route_duration_field.getText());
      String name = name_field.getText();
      train train  = new train(routes_id, id, name, ticket_price, route_duration);
      new train_DAO().updateTrains(train);
      clean(id_ield,routes_id_field,tcket_price_field,route_duration_field,name_field);
      updateTable();
      }
}
private void updateTable() throws SQLException {
    train_model.clear();
    train_model.addAll(train.getAllTrainRoute());
    table.setItems(train_model);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        train = new  train_request();
        train_model = FXCollections.observableArrayList();

        id_column.setCellValueFactory(cellData->cellData.getValue().getTrain_id().asObject());
    
        routes_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());
    
        name_column1.setCellValueFactory(cellData->cellData.getValue().getTrain_name());
    
        ticket_price_column.setCellValueFactory(cellData->cellData.getValue().getRoutes_ticket_price().asObject());
    
        routes_duration_column.setCellValueFactory(cellData->cellData.getValue().getRoutes_duration().asObject());
    
        routes_from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
    
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
    
        routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
    
    

      
       try {
        train_model.addAll( train.getAllTrainRoute());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( train_model);

       connection.close();
    }
}
