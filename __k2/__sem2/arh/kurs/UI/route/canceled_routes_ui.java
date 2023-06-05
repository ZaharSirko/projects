package __k2.__sem2.arh.kurs.UI.route;


import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.route.canceled_routes.canceled_routes;
import __k2.__sem2.arh.kurs.route.canceled_routes.canceled_routes_DAO;
import __k2.__sem2.arh.kurs.route.canceled_routes.canceled_routes_model;
import __k2.__sem2.arh.kurs.route.canceled_routes.canceled_routes_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class canceled_routes_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<canceled_routes_model> table;

    @FXML
    private TableColumn<canceled_routes_model, Integer> routes_id_column;

    @FXML
    private TableColumn<canceled_routes_model, String> routes_from_column;

    @FXML
    private TableColumn<canceled_routes_model, String> direction_column;

    @FXML
    private TableColumn<canceled_routes_model, String> routes_to_column;

    @FXML
    private TableColumn<canceled_routes_model, Integer> id_column;

    @FXML
    private TableColumn<canceled_routes_model, String> type_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private Button delete_button;

    @FXML
    private TextField routes_id_field;

    @FXML
    private TextField id_field;

    @FXML
    private TextField type_field;

    private canceled_routes_request canceledRoutes;

    private ObservableList<canceled_routes_model> canceledRouteModels;

    
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (routes_id_field.getText().isEmpty() || id_field.getText().isEmpty() || type_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int routesId = Integer.parseInt(routes_id_field.getText());
    int id = Integer.parseInt(id_field.getText());
    String type = type_field.getText();
    canceled_routes canceled_routes = new canceled_routes(routesId, id, type);
    new canceled_routes_DAO().addСanceled_routes(canceled_routes);
    clean(routes_id_field,id_field,type_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    canceled_routes_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getCanceledRoutesId().get();
    new canceled_routes_DAO().deleteСanceled_routes(id);
    clean(routes_id_field,id_field,type_field);
    updateTable();
}

@FXML
private void SelectButton(){
    canceled_routes_model selected = table.getSelectionModel().getSelectedItem();
    routes_id_field.setText(String.valueOf(selected.getRouteId().get()));
    id_field.setText(String.valueOf(selected.getCanceledRoutesId().get()));
    type_field.setText(selected.getCanceledRoutesType().get());
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (routes_id_field.getText().isEmpty() || id_field.getText().isEmpty() || type_field.getText().isEmpty()) {
        Alerts();
      }
      else{
    int routesId = Integer.parseInt(routes_id_field.getText());
    int id = Integer.parseInt(id_field.getText());
    String type = type_field.getText();
    canceled_routes canceled_routes = new canceled_routes(id, routesId, type);
    new canceled_routes_DAO().updateСanceled_routes(canceled_routes);
    clean(routes_id_field,id_field,type_field);
    updateTable();
      }
}
private void updateTable() throws SQLException {
    canceledRouteModels.clear();
    canceledRouteModels.addAll(canceledRoutes.getAllCanceledRoutes());
    table.setItems(canceledRouteModels);
}
    
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        canceledRoutes = new canceled_routes_request();
        canceledRouteModels = FXCollections.observableArrayList();

    
        routes_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());
        id_column.setCellValueFactory(cellData->cellData.getValue().getCanceledRoutesId().asObject());
        routes_from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
        routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
        type_column.setCellValueFactory(cellData->cellData.getValue().getCanceledRoutesType());

       
        try {
            canceledRouteModels.addAll(canceledRoutes.getAllCanceledRoutes());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        table.setItems(canceledRouteModels);

        connection.close();
    }
}
