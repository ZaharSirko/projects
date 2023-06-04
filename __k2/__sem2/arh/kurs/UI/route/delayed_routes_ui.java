package __k2.__sem2.arh.kurs.UI.route;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import __k2.__sem2.arh.kurs.UI.scene_;

import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes_model;
import __k2.__sem2.arh.kurs.route.delayed_routes.delayed_routes_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TextField delete_id_field;

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
