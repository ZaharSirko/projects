package __k2.__sem2.arh.kurs.UI.humans;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker;
import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker_DAO;
import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker_model;
import __k2.__sem2.arh.kurs.brigade_worker.brigade_worker_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class brigade_worker_ui extends scene_ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_button;

    @FXML
    private TableView<brigade_worker_model> table;

    @FXML
    private TableColumn<brigade_worker_model, Integer> id_column;

    @FXML
    private TableColumn<brigade_worker_model, String> surename_column;

    @FXML
    private TableColumn<brigade_worker_model, String> name_column;

    @FXML
    private TableColumn<brigade_worker_model, Integer> department_column;

    @FXML
    private TableColumn<brigade_worker_model, Integer> salary_column;

    @FXML
    private TableColumn<brigade_worker_model, Integer> age_column;

    @FXML
    private Button uptade_button;

    @FXML
    private Button add_button;

    @FXML
    private TextField surename_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField department_field;

    @FXML
    private TextField id_ield;

    @FXML
    private TextField age_field;

    @FXML
    private Button delete_button;

    @FXML
    private TextField salary_field;

    @FXML
    private TextArea avg_salary_field;

    private brigade_worker_request  brigade_worker;

    private ObservableList<brigade_worker_model>  brigade_worker_model;
    @FXML
    private void AddButton(ActionEvent event) throws SQLException {
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || department_field.getText().isEmpty()
    || salary_field.getText().isEmpty()||age_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    String name = name_field.getText();
    String surename = surename_field.getText();
    int department = Integer.parseInt(department_field.getText());
    int salary = Integer.parseInt(salary_field.getText());
    int age = Integer.parseInt(age_field.getText());
    brigade_worker brigade_worker  = new brigade_worker(id, name, surename, age, department, salary);
    new brigade_worker_DAO().addBrigadeWorker(brigade_worker);
    clean(id_ield,name_field,surename_field,department_field,salary_field,age_field);
    updateTable();
   }
}
@FXML
private void DeleteButton(ActionEvent event) throws SQLException {
    brigade_worker_model selected = table.getSelectionModel().getSelectedItem();
	int id = selected.getHuman_id().get();
    new brigade_worker_DAO().deleteBrigadeWorker(id);
    clean(id_ield,name_field,surename_field,department_field,salary_field,age_field);
    updateTable();
}

@FXML
private void SelectButton(){
    brigade_worker_model selected = table.getSelectionModel().getSelectedItem();
    id_ield.setText(String.valueOf(selected.getHuman_id().get()));
    name_field.setText(selected.getName().get());
    surename_field.setText(selected.getSurename().get());
    department_field.setText(String.valueOf(selected.getDepartment().get()));
    salary_field.setText(String.valueOf(selected.getSalary().get()));
    age_field.setText(String.valueOf(selected.getAge().get()));
}


@FXML
private void UpdateButton(ActionEvent event) throws SQLException{
    if (name_field.getText().isEmpty() || id_ield.getText().isEmpty() || surename_field.getText().isEmpty() || department_field.getText().isEmpty()
    || salary_field.getText().isEmpty()||age_field.getText().isEmpty()) {
      Alerts();
    }
   else{
    int id = Integer.parseInt(id_ield.getText());
    String name = name_field.getText();
    String surename = surename_field.getText();
    int department = Integer.parseInt(department_field.getText());
    int salary = Integer.parseInt(salary_field.getText());
    int age = Integer.parseInt(age_field.getText());
    brigade_worker brigade_worker  = new brigade_worker(id, name, surename, age, department, salary);
    new brigade_worker_DAO().updateBrigadeWorker(brigade_worker);
    clean(id_ield,name_field,surename_field,department_field,salary_field,age_field);
    updateTable();
      }
}
private void updateTable() throws SQLException {
    brigade_worker_model.clear();
    brigade_worker_model.addAll(brigade_worker.getAllBrigadeWorker());
    avg_salary_field.setText(String.valueOf((int) new brigade_worker_DAO().getAverageSalary()));
    table.setItems(brigade_worker_model);
}

    @FXML
    void initialize() throws SQLException {
        switchBack(back_button);

        brigade_worker = new  brigade_worker_request();
        brigade_worker_model = FXCollections.observableArrayList();
        
       id_column.setCellValueFactory(cellData->cellData.getValue().getHuman_id().asObject());
    
     surename_column.setCellValueFactory(cellData->cellData.getValue().getSurename());
    
        name_column.setCellValueFactory(cellData->cellData.getValue().getName());
    
        department_column.setCellValueFactory(cellData->cellData.getValue().getDepartment().asObject());
    
       salary_column.setCellValueFactory(cellData->cellData.getValue().getSalary().asObject());
    
        age_column.setCellValueFactory(cellData->cellData.getValue().getAge().asObject());

        avg_salary_field.setText(String.valueOf((int) new brigade_worker_DAO().getAverageSalary()));
        try {
            brigade_worker_model.addAll( brigade_worker.getAllBrigadeWorker());
           } catch (SQLException e) {
               e.printStackTrace();
           }
    
    
           table.setItems( brigade_worker_model);
    
           connection.close();
    }
}
