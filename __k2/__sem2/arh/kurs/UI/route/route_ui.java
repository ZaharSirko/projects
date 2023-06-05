package __k2.__sem2.arh.kurs.UI.route;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.route.route;
import __k2.__sem2.arh.kurs.route.route_DAO;
import __k2.__sem2.arh.kurs.route.route_model;
import __k2.__sem2.arh.kurs.route.route_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class route_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<route_model> table;

    @FXML
    private TableColumn<route_model, Integer> routes_id_column;

    @FXML
    private TableColumn<route_model, String> routes_from_column;

    @FXML
    private TableColumn<route_model, String> direction_column;

    @FXML
    private TableColumn<route_model, String> routes_to_column;

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

    private route_request routes;

    private ObservableList<route_model> routesModels;

    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (routes_id_field.getText().isEmpty() || route_from_field.getText().isEmpty() || direction_field.getText().isEmpty() || route_to_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int routesId = Integer.parseInt(routes_id_field.getText());
    String roude_from = route_from_field.getText();
    String direction = direction_field.getText();
    String route_to = route_to_field.getText();
    route route = new route(routesId, roude_from, direction,route_to);
    new route_DAO().addRoutes(route);
    clean(routes_id_field,route_from_field,direction_field,route_to_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    route_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getRouteId().get();
    new route_DAO().deleteRoutes(id);
    clean(routes_id_field,route_from_field,direction_field,route_to_field);
    updateTable();
}

@FXML
private void SelectButton(){
    route_model selected = table.getSelectionModel().getSelectedItem();
    routes_id_field.setText(String.valueOf(selected.getRouteId().get()));
    route_from_field.setText(selected.getRoutesFrom().get());
    direction_field.setText(selected.getRoutesDirection().get());
    route_to_field.setText(selected.getRoutesTo().get());
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (routes_id_field.getText().isEmpty() || route_from_field.getText().isEmpty() || direction_field.getText().isEmpty() || route_to_field.getText().isEmpty()) {
        Alerts();
      }
      else{
        int routesId = Integer.parseInt(routes_id_field.getText());
        String roude_from = route_from_field.getText();
        String direction = direction_field.getText();
        String route_to = route_to_field.getText();
        route route = new route(routesId, roude_from, direction,route_to);
        new route_DAO().updateRoutes(route);
    clean(routes_id_field,route_from_field,direction_field,route_to_field);
    updateTable();
      }
}
private void updateTable() throws SQLException {
    routesModels.clear();
    routesModels.addAll(routes.getAllRoutes());
    table.setItems(routesModels);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        routes = new route_request();
        routesModels = FXCollections.observableArrayList();

        routes_id_column.setCellValueFactory(cellData->cellData.getValue().getRouteId().asObject());
        routes_from_column.setCellValueFactory(cellData->cellData.getValue().getRoutesFrom());
        direction_column.setCellValueFactory(cellData->cellData.getValue().getRoutesDirection());
        routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutesTo());
        

       
        try {
            routesModels.addAll(routes.getAllRoutes());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        table.setItems(routesModels);

        connection.close();
    }
}
