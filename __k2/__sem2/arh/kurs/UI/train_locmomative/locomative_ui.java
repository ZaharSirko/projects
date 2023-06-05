package __k2.__sem2.arh.kurs.UI.train_locmomative;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.locomative.locomative;
import __k2.__sem2.arh.kurs.locomative.locomative_DAO;
import __k2.__sem2.arh.kurs.locomative.locomative_model;
import __k2.__sem2.arh.kurs.locomative.locomative_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class locomative_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<locomative_model> table;

    @FXML
    private TableColumn<locomative_model, Integer> id_column;

    @FXML
    private TableColumn<locomative_model, String> name_column;

    @FXML
    private TableColumn<locomative_model, Integer> age_column;

    @FXML
    private TableColumn<locomative_model, Integer> department_column;

    @FXML
    private TableColumn<locomative_model, Integer> completed_routes_column;

    @FXML
    private TableColumn<locomative_model, Integer> completed_routes_before_repair_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField age_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField department_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField completed_routes_before_repair_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField delete_id_field;

    @FXML
    private TextField completed_routes_field;

    private locomative_request  locomative;

    private ObservableList<locomative_model>  locomative_model;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (age_field.getText().isEmpty() || name_field.getText().isEmpty() || department_field.getText().isEmpty() || id_ield.getText().isEmpty()|| completed_routes_before_repair_field.getText().isEmpty()
    || completed_routes_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    int age = Integer.parseInt(age_field.getText());
    int department = Integer.parseInt(department_field.getText());
    int completed_routes_before_repair = Integer.parseInt(completed_routes_before_repair_field.getText());
    int completed_routes = Integer.parseInt(completed_routes_field.getText());
    String name = name_field.getText();
    locomative locomative  = new locomative(id, name, age, department, completed_routes, completed_routes_before_repair);
    new locomative_DAO().addLocomative(locomative);;
    clean(id_ield,age_field,department_field,completed_routes_before_repair_field,completed_routes_field,name_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    locomative_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getHuman_id().get();
    new locomative_DAO().deleteLocomative(id);
    clean(id_ield,age_field,department_field,completed_routes_before_repair_field,completed_routes_field,name_field);
    updateTable();
}

@FXML
private void SelectButton(){
    locomative_model selected = table.getSelectionModel().getSelectedItem();
    id_ield.setText(String.valueOf(selected.getHuman_id().get()));
    age_field.setText(String.valueOf(selected.getAge().get()));
    department_field.setText(String.valueOf(selected.getDepartment().get()));
    completed_routes_before_repair_field.setText(String.valueOf(selected.getCompleted_routes_before_repair().get()));
    completed_routes_field.setText(String.valueOf(selected.getCompleted_routes().get()));
    name_field.setText(selected.getName().get());
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (age_field.getText().isEmpty() || name_field.getText().isEmpty() || department_field.getText().isEmpty() || id_ield.getText().isEmpty()|| completed_routes_before_repair_field.getText().isEmpty()
    || completed_routes_field.getText().isEmpty()) {
      Alerts();
    }
      else{
        int id = Integer.parseInt(id_ield.getText());
        int age = Integer.parseInt(age_field.getText());
        int department = Integer.parseInt(department_field.getText());
        int completed_routes_before_repair = Integer.parseInt(completed_routes_before_repair_field.getText());
        int completed_routes = Integer.parseInt(completed_routes_field.getText());
        String name = name_field.getText();
        locomative locomative  = new locomative(id, name, age, department, completed_routes, completed_routes_before_repair);
        new locomative_DAO().updateLocomative(locomative);
        clean(id_ield,age_field,department_field,completed_routes_before_repair_field,completed_routes_field,name_field);
        updateTable();
      }
}
private void updateTable() throws SQLException {
    locomative_model.clear();
    locomative_model.addAll(locomative.getAllLocamatives());
    table.setItems(locomative_model);
}
    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);
        locomative = new  locomative_request();
        locomative_model = FXCollections.observableArrayList();

    id_column.setCellValueFactory(cellData->cellData.getValue().getHuman_id().asObject());
    name_column.setCellValueFactory(cellData->cellData.getValue().getName());
    age_column.setCellValueFactory(cellData->cellData.getValue().getAge().asObject());
    department_column.setCellValueFactory(cellData->cellData.getValue().getDepartment().asObject());
    completed_routes_column.setCellValueFactory(cellData->cellData.getValue().getCompleted_routes().asObject());
    completed_routes_before_repair_column.setCellValueFactory(cellData->cellData.getValue().getCompleted_routes_before_repair().asObject());
    

      
       try {
        locomative_model.addAll( locomative.getAllLocamatives());
       } catch (SQLException e) {
           e.printStackTrace();
       }


       table.setItems( locomative_model);

       connection.close();
   }
    }

