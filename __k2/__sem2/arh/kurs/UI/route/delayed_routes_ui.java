package __k2.__sem2.arh.kurs.UI.route;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes_DAO;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes_model;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class delayed_routes_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<delayed_routes_model> table;

    @FXML
    private TableColumn<delayed_routes_model, Integer> routes_id_column;

    @FXML
    private TableColumn<delayed_routes_model, String> routes_from_column;

    @FXML
    private TableColumn<delayed_routes_model, String> direction_column;

    @FXML
    private TableColumn<delayed_routes_model, String> routes_to_column;

    @FXML
    private TableColumn<delayed_routes_model, Integer> id_column;

    @FXML
    private TableColumn<delayed_routes_model, String> reason_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private Button delete_button;

    @FXML
    private TextField routes_id_field;

    @FXML
    private TextField route_from_field;

    @FXML
    private TextField direction_field;

    @FXML
    private TextField route_to_field;

    @FXML
    private TextField id_field;


    @FXML
    private TextField reason_field;
 
    private delayed_routes_request delayed_routes;

    private ObservableList<delayed_routes_model> delayed_routesModels;

    private delayed_routes_DAO delayed_routes_DAO = new delayed_routes_DAO();


    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (routes_id_field.getText().isEmpty() || id_field.getText().isEmpty() || reason_field.getText().isEmpty()) {
      Alerts();
    }
   else{
     int routesId = Integer.parseInt(routes_id_field.getText());
     int id = Integer.parseInt(id_field.getText());
     String reason = reason_field.getText();
    delayed_routes delayed_route = new delayed_routes(id, routesId, reason);
    new delayed_routes_DAO().addDelayed_routes(delayed_route);
    clean(routes_id_field,id_field,reason_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    delayed_routes_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getDelayed_routes().get();
    delayed_routes_DAO.deleteDelayed_routes(id);
    clean(routes_id_field,id_field,reason_field);
    updateTable();
}

@FXML
private void SelectButton(){
    delayed_routes_model selected = table.getSelectionModel().getSelectedItem();
    routes_id_field.setText(String.valueOf(selected.getRouteId().get()));
    id_field.setText(String.valueOf(selected.getDelayed_routes().get()));
    reason_field.setText(selected.getDelayed_routes_reason().get());
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (routes_id_field.getText().isEmpty() || id_field.getText().isEmpty() || reason_field.getText().isEmpty()) {
        Alerts();
      }
     else{
    int routesId = Integer.parseInt(routes_id_field.getText());
    int id = Integer.parseInt(id_field.getText());
    String reason = reason_field.getText();
    delayed_routes delayed_routes = new delayed_routes(id, routesId, reason);
    delayed_routes_DAO.updateDelayed_routes(delayed_routes);
    clean(routes_id_field,id_field,reason_field);
    updateTable();
     }
}
private void updateTable() throws SQLException {
    delayed_routesModels.clear();
    delayed_routesModels.addAll(delayed_routes.getAllDelayedRoutes());
    table.setItems(delayed_routesModels);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        delayed_routes = new delayed_routes_request();
        delayed_routesModels = FXCollections.observableArrayList();

        routes_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());
        routes_from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
        routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
        id_column.setCellValueFactory(cellData->cellData.getValue().getDelayed_routes().asObject());
        reason_column.setCellValueFactory(cellData->cellData.getValue().getDelayed_routes_reason());
        

       
        try {
            delayed_routesModels.addAll(delayed_routes.getAllDelayedRoutes());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        table.setItems(delayed_routesModels);

        connection.close();
    }
}
