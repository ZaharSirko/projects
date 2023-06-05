package __k2.__sem2.arh.kurs.UI.humans;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_DAO;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_model;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class locomative_drivers_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<locomative_drivers_model> table;

    @FXML
    private TableColumn<locomative_drivers_model, Integer> id_column;

    @FXML
    private TableColumn<locomative_drivers_model, String> surename_column;

    @FXML
    private TableColumn<locomative_drivers_model, String> name_column;

    @FXML
    private TableColumn<locomative_drivers_model, String> gender_column;

    @FXML
    private TableColumn<locomative_drivers_model, Integer> age_column;

    @FXML
    private TableColumn<locomative_drivers_model, Integer> work_exp_column;

    @FXML
    private TableColumn<locomative_drivers_model, Integer> salary_column;

    @FXML
    private TableColumn<locomative_drivers_model, String> medical_examination_2022_column;

    @FXML
    private TableColumn<locomative_drivers_model, String> medical_examination_2023_column;

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
    private TextField medical_examination_2022_field;

    @FXML
    private TextField medical_examination_2023_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField work_exp_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField salary_field;

    @FXML
    private TextField age_field;

    private locomative_drivers_request   locomative_driver;

    private ObservableList<locomative_drivers_model>  locomative_drivers_models;

    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || gender_field.getText().isEmpty() || salary_field.getText().isEmpty()
    || work_exp_field.getText().isEmpty() ||age_field.getText().isEmpty()|| medical_examination_2022_field.getText().isEmpty()||medical_examination_2023_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    String name = name_field.getText();
    String surename = surename_field.getText();
    String gender = gender_field.getText();
    int age = Integer.parseInt(age_field.getText());
    int work_exp_= Integer.parseInt(work_exp_field.getText());
    int salary = Integer.parseInt(salary_field.getText());
    String medical_examination_2022 = medical_examination_2022_field.getText();
    String medical_examination_2023 = medical_examination_2023_field.getText();
    locomative_drivers locomative_driver  = new locomative_drivers(id, surename, name, gender, age, work_exp_, salary, medical_examination_2022, medical_examination_2023);
    new locomative_drivers_DAO().addLocomativeDrivers(locomative_driver);
    clean(id_ield,name_field,surename_field,gender_field,work_exp_field,salary_field,age_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    locomative_drivers_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getHuman_id().get();
    new locomative_drivers_DAO().deleteLocomativeDrivers(id);
    clean(id_ield,name_field,surename_field,gender_field,work_exp_field,salary_field,age_field);
    updateTable();
}

@FXML
private void SelectButton(){
  locomative_drivers_model selected = table.getSelectionModel().getSelectedItem();
    id_ield.setText(String.valueOf(selected.getHuman_id().get()));
    name_field.setText(selected.getName().get());
    surename_field.setText(selected.getSurename().get());
    gender_field.setText(selected.getGender().get());
    work_exp_field.setText(String.valueOf(selected.getWorkExperience().get()));
    salary_field.setText(String.valueOf(selected.getSalary().get()));
    age_field.setText(String.valueOf(selected.getAge().get()));
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
  if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || gender_field.getText().isEmpty() || salary_field.getText().isEmpty()
  || work_exp_field.getText().isEmpty() ||age_field.getText().isEmpty()|| medical_examination_2022_field.getText().isEmpty()||medical_examination_2023_field.getText().isEmpty()) {
    Alerts();
  }
 else{
  int id = Integer.parseInt(id_ield.getText());
  String name = name_field.getText();
  String surename = surename_field.getText();
  String gender = gender_field.getText();
  int age = Integer.parseInt(age_field.getText());
  int work_exp_= Integer.parseInt(work_exp_field.getText());
  int salary = Integer.parseInt(salary_field.getText());
  String medical_examination_2022 = medical_examination_2022_field.getText();
  String medical_examination_2023 = medical_examination_2023_field.getText();
  locomative_drivers locomative_driver  = new locomative_drivers(id, surename, name, gender, age, work_exp_, salary, medical_examination_2022, medical_examination_2023);
  new locomative_drivers_DAO().updateLocomativeDrivers(locomative_driver);
  clean(id_ield,name_field,surename_field,gender_field,work_exp_field,salary_field,age_field);
  updateTable();
      }
}
private void updateTable() throws SQLException {
    locomative_drivers_models.clear();
    locomative_drivers_models.addAll(locomative_driver.getAllLocamativeDrivers());
    table.setItems(locomative_drivers_models);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        locomative_driver = new  locomative_drivers_request();
        locomative_drivers_models = FXCollections.observableArrayList();

        id_column.setCellValueFactory(cellData->cellData.getValue().getHuman_id().asObject());
    
         surename_column.setCellValueFactory(cellData->cellData.getValue().getSurename());
    
       name_column.setCellValueFactory(cellData->cellData.getValue().getName());
    
        gender_column.setCellValueFactory(cellData->cellData.getValue().getGender());
    
        age_column.setCellValueFactory(cellData->cellData.getValue().getAge().asObject());

        work_exp_column.setCellValueFactory(cellData->cellData.getValue().getWorkExperience().asObject());

        salary_column.setCellValueFactory(cellData->cellData.getValue().getSalary().asObject());

        medical_examination_2022_column.setCellValueFactory(cellData->cellData.getValue().getMedical_examination_2022());

        medical_examination_2023_column.setCellValueFactory(cellData->cellData.getValue().getMedical_examination_2023());
    
    
    
      try {
        locomative_drivers_models.addAll( locomative_driver.getAllLocamativeDrivers());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( locomative_drivers_models);

       connection.close();
    }
}
