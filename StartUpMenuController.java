package application;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class StartUpMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button advancedButton;

    @FXML
    private Button intermediateButton;

    @FXML
    private Button noviceButton;


    @FXML
    void clickedAdvancedButton(ActionEvent event) {
    }

    @FXML
    void clickedIntermediateButton(ActionEvent event) {
    }

    @FXML
    void clickedNoviceButton(ActionEvent event) {
    	try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader();
			root = (BorderPane)loader.load(new FileInputStream("src/application/NoviceBoard.fxml"));
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {
        assert advancedButton != null : "fx:id=\"advancedButton\" was not injected: check your FXML file 'StartUpMenu.fxml'.";
        assert intermediateButton != null : "fx:id=\"intermediateButton\" was not injected: check your FXML file 'StartUpMenu.fxml'.";
        assert noviceButton != null : "fx:id=\"noviceButton\" was not injected: check your FXML file 'StartUpMenu.fxml'.";


    }

}
