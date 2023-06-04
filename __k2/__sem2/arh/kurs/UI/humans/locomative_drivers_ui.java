package __k2.__sem2.arh.kurs.UI.humans;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import __k2.__sem2.arh.kurs.UI.scene_;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_model;
import __k2.__sem2.arh.kurs.locomative_drivers.locomative_drivers_request;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TableColumn<locomative_drivers_model, Integer> sallary_column;

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
    private TextField sallaey_field;

    @FXML
    private TextField age_field;

    private locomative_drivers_request   locomative_driver;

    private ObservableList<locomative_drivers_model>  locomative_drivers_models;


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

        sallary_column.setCellValueFactory(cellData->cellData.getValue().getSalary().asObject());

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
