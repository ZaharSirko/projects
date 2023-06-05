package __k2.__sem2.arh.kurs.UI.humans;


import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_DAO;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_model;
import __k2.__sem2.arh.kurs.railway_station_worker.railway_station_worker_request;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TableColumn<railway_station_worker_model, Integer> salary_column;

    @FXML
    private TableColumn<railway_station_worker_model, Integer> age_column;

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
    private TextField salary_field;
    @FXML
    private TextField age_field;


    private railway_station_worker_request  railway_station_worker;

    private ObservableList<railway_station_worker_model>  railway_station_worker_model;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || gender_field.getText().isEmpty()|| children_field.getText().isEmpty()
    || chief_field.getText().isEmpty()|| department_field.getText().isEmpty()|| work_exp_field.getText().isEmpty() || salary_field.getText().isEmpty()||age_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    String name = name_field.getText();
    String surename = surename_field.getText();
    String gender = gender_field.getText();
    int children = Integer.parseInt(children_field.getText());
    String chief = chief_field.getText();
    int department = Integer.parseInt(department_field.getText());
    int work_exp_= Integer.parseInt(work_exp_field.getText());
    int salary = Integer.parseInt(salary_field.getText());
    int age = Integer.parseInt(age_field.getText());
    railway_station_worker railway_station_worker  = new railway_station_worker(id, name, surename, age, gender, children, chief, department, work_exp_, salary);
    new railway_station_worker_DAO().addRailwayStationWorker(railway_station_worker);
    clean(id_ield,name_field,surename_field,gender_field,children_field,chief_field,department_field,work_exp_field,salary_field,age_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    railway_station_worker_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getHuman_id().get();
    new railway_station_worker_DAO().deleteRailwayStationWorker(id);
    clean(id_ield,name_field,surename_field,gender_field,children_field,chief_field,department_field,work_exp_field,salary_field,age_field);
    updateTable();
}

@FXML
private void SelectButton(){
    railway_station_worker_model selected = table.getSelectionModel().getSelectedItem();
    id_ield.setText(String.valueOf(selected.getHuman_id().get()));
    name_field.setText(selected.getName().get());
    surename_field.setText(selected.getSurename().get());
    gender_field.setText(selected.getGender().get());
    children_field.setText(String.valueOf(selected.getChildren().get()));
    chief_field.setText(selected.getChief().get());
    department_field.setText(String.valueOf(selected.getDepartment().get()));
    work_exp_field.setText(String.valueOf(selected.getWorkExperience().get()));
    salary_field.setText(String.valueOf(selected.getSalary().get()));
    age_field.setText(String.valueOf(selected.getAge().get()));
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || gender_field.getText().isEmpty()|| children_field.getText().isEmpty()
    || chief_field.getText().isEmpty()|| department_field.getText().isEmpty()|| work_exp_field.getText().isEmpty() || salary_field.getText().isEmpty()||age_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    String name = name_field.getText();
    String surename = surename_field.getText();
    String gender = gender_field.getText();
    int children = Integer.parseInt(children_field.getText());
    String chief = chief_field.getText();
    int department = Integer.parseInt(department_field.getText());
    int work_exp_= Integer.parseInt(work_exp_field.getText());
    int salary = Integer.parseInt(salary_field.getText());
    int age = Integer.parseInt(age_field.getText());
    railway_station_worker railway_station_worker  = new railway_station_worker(id, name, surename, age, gender, children, chief, department, work_exp_, salary);
    new railway_station_worker_DAO().updateRailwayStationWorker(railway_station_worker);
    clean(id_ield,name_field,surename_field,gender_field,children_field,chief_field,department_field,work_exp_field,salary_field,age_field);
    updateTable();
      }
}
private void updateTable() throws SQLException {
    railway_station_worker_model.clear();
    railway_station_worker_model.addAll(railway_station_worker.getAllRailwayStationWorker());
    table.setItems(railway_station_worker_model);
}
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
  
    salary_column.setCellValueFactory(cellData->cellData.getValue().getSalary().asObject());

       try {
        railway_station_worker_model.addAll(railway_station_worker.getAllRailwayStationWorker());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( railway_station_worker_model);

       connection.close();
    }
}
