package __k2.__sem2.arh.kurs.UI.ticket;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;

import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_model;
import __k2.__sem2.arh.kurs.ticket.sold_ticket.sold_ticket_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TextField from_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField direction_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField sold_ticket_hour_column_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField to_field;

    @FXML
    private TextField route_id_field;

    @FXML
    private TextField sold_ticket_week_column_field;

    @FXML
    private TextField sold_ticket_mounth_column_field;

    private sold_ticket_request  sold_ticket;

    private ObservableList<sold_ticket_model>  sold_ticket_model;
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        sold_ticket = new  sold_ticket_request();
        sold_ticket_model = FXCollections.observableArrayList();

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
        sold_ticket_model.addAll( sold_ticket.getAllSoldTickets());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( sold_ticket_model);

       connection.close();
    }
}
