package __k2.__sem2.arh.kurs.UI.humans;


import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_model;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_request;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class railway_station_worker_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<railway_station_worker_model> table;

    @FXML
    private TableColumn<railway_station_worker_model, Integer> id_column;

    @FXML
    private TableColumn<railway_station_worker_model, String> surename_column;

    @FXML
    private TableColumn<railway_station_worker_model, String> name_column;

    @FXML
    private TableColumn<railway_station_worker_model, String> gender_column;

    @FXML
    private TableColumn<railway_station_worker_model, Integer> children_column;

    @FXML
    private TableColumn<railway_station_worker_model, String> chief_column;

    @FXML
    private TableColumn<railway_station_worker_model, Integer> department_column;

    @FXML
    private TableColumn<railway_station_worker_model, Integer> work_exp_column;

    @FXML
    private TableColumn<railway_station_worker_model, Integer> sallary_column;

    @FXML
    private Button select_department_button;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField surename_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField gender_field;

    @FXML
    private TextField children_field;

    @FXML
    private TextField chief_field;

    @FXML
    private TextField department_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField work_exp_field;

    @FXML
    private TextField select_department_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField sallaey_field;


    private railway_station_worker_request  railway_station_worker;

    private ObservableList<railway_station_worker_model>  railway_station_worker_model;

    @FXML
    void initialize() throws SQLException {
 
      switchBack(back_button);
      railway_station_worker = new  railway_station_worker_request();
      railway_station_worker_model = FXCollections.observableArrayList();

      id_column.setCellValueFactory(cellData->cellData.getValue().getHuman_id().asObject());

     surename_column.setCellValueFactory(cellData->cellData.getValue().getSurename());
  
      name_column.setCellValueFactory(cellData->cellData.getValue().getName());
  
      gender_column.setCellValueFactory(cellData->cellData.getValue().getGender());
  
      children_column.setCellValueFactory(cellData->cellData.getValue().getChildren().asObject());
  
     chief_column.setCellValueFactory(cellData->cellData.getValue().getChief());
  
      department_column.setCellValueFactory(cellData->cellData.getValue().getDepartment().asObject());
  
      work_exp_column.setCellValueFactory(cellData->cellData.getValue().getWorkExperience().asObject());
  
       sallary_column.setCellValueFactory(cellData->cellData.getValue().getSalary().asObject());

       try {
        railway_station_worker_model.addAll(railway_station_worker.getAllRailwayStationWorker());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( railway_station_worker_model);

       connection.close();
    }
}
