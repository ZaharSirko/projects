package __k2.__sem2.arh.kurs.UI.humans;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.passengers.passengers;
import __k2.__sem2.arh.kurs.passengers.passengers_DAO;
import __k2.__sem2.arh.kurs.passengers.passengers_model;
import __k2.__sem2.arh.kurs.passengers.passengers_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class passengers_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<passengers_model> table;

    @FXML
    private TableColumn<passengers_model, Integer> id_column;

    @FXML
    private TableColumn<passengers_model, String> surename_column;

    @FXML
    private TableColumn<passengers_model, String> name_column;

    @FXML
    private TableColumn<passengers_model, String> gender_column;

    @FXML
    private TableColumn<passengers_model, Integer> age_column;

    @FXML
    private TableColumn<passengers_model, String> routes_to_column;

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
    private TextField id_ield;

    @FXML
    private TextField routes_to_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField age_field;

    private passengers_request  passengers;

    private ObservableList<passengers_model>  passengers_models;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || gender_field.getText().isEmpty()|| routes_to_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    String name = name_field.getText();
    String surename = surename_field.getText();
    String gender = gender_field.getText();
    String routes_to = routes_to_field.getText();
    int age = Integer.parseInt(age_field.getText());
    passengers passengers  = new passengers(id, name, surename, age, gender, routes_to);
    new passengers_DAO().addPassenger(passengers);
    clean(id_ield,name_field,surename_field,gender_field,routes_to_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
  passengers_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getHuman_id().get();
    new passengers_DAO().deletePassenger(id);
    clean(id_ield,name_field,surename_field,gender_field,routes_to_field);
    updateTable();
}

@FXML
private void SelectButton(){
    passengers_model selected = table.getSelectionModel().getSelectedItem();
    id_ield.setText(String.valueOf(selected.getHuman_id().get()));
    name_field.setText(selected.getName().get());
    surename_field.setText(selected.getSurename().get());
    gender_field.setText(selected.getGender().get());
    routes_to_field.setText(selected.getRoutes_to().get());
    age_field.setText(String.valueOf(selected.getAge().get()));
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
  if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || gender_field.getText().isEmpty()|| routes_to_field.getText().isEmpty()) {
    Alerts();
  }
 else{
  int id = Integer.parseInt(id_ield.getText());
  String name = name_field.getText();
  String surename = surename_field.getText();
  String gender = gender_field.getText();
  String routes_to = routes_to_field.getText();
  int age = Integer.parseInt(age_field.getText());
  passengers passengers  = new passengers(id, name, surename, age, gender, routes_to);
  new passengers_DAO().updatePassenger(passengers);
  clean(id_ield,name_field,surename_field,gender_field,routes_to_field);
  updateTable();
      }
}
private void updateTable() throws SQLException {
    passengers_models.clear();
    passengers_models.addAll(passengers.getAllPassenger());
    table.setItems(passengers_models);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);

        passengers = new  passengers_request();
        passengers_models = FXCollections.observableArrayList();

        id_column.setCellValueFactory(cellData->cellData.getValue().getHuman_id().asObject());
    
         surename_column.setCellValueFactory(cellData->cellData.getValue().getSurename());
    
       name_column.setCellValueFactory(cellData->cellData.getValue().getName());
    
        gender_column.setCellValueFactory(cellData->cellData.getValue().getGender());
    
        age_column.setCellValueFactory(cellData->cellData.getValue().getAge().asObject());
    
      routes_to_column.setCellValueFactory(cellData->cellData.getValue().getRoutes_to());
    
      try {
        passengers_models.addAll( passengers.getAllPassenger());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( passengers_models);

       connection.close();
    }
}
