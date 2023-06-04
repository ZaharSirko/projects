package __k2.__sem2.arh.kurs.UI.route;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.route.route;
import __k2.__sem2.arh.kurs.route.route_model;
import __k2.__sem2.arh.kurs.route.route_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TextField delete_id_field;

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
