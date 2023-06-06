package __k2.__sem2.arh.kurs.UI;
import java.io.IOException;

import __k2.__sem2.arh.kurs._connection;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class scene_ extends _connection {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToScen(Button button, String fxmlFile){
        button.setOnAction(event ->{
                try {
                    root = FXMLLoader.load(getClass().getResource(fxmlFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });
    }

    public void switchBack(Button button){
        button.setOnAction(event ->{
                try {
                    root = FXMLLoader.load(getClass().getResource("/__k2/__sem2/arh/kurs/UI/menu.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });
    }
    public void ExitButton(Button button){
        button.setOnAction(event ->{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       
        stage.close();
    });
    }
    public void Alerts(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText("Please Fill All DATA");
        alert.showAndWait();
    }
  public void clean(TextField ...fields){
    for (TextField field : fields) {
        field.setText(null);
    }
  }
}
