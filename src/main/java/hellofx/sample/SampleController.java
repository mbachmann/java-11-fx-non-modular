package hellofx.sample;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SampleController {

    Stage primaryStage;
    Scene mainScene;

    @javafx.fxml.FXML
    private Label labelInfo;

    @javafx.fxml.FXML
    private Button goBackButton;

    public void init(Stage primaryStage, Scene mainScene) {
        this.primaryStage = primaryStage;
        this.mainScene = mainScene;
    }

    @javafx.fxml.FXML
    public void onGoBack(ActionEvent actionEvent) {
        primaryStage.setScene(mainScene);
    }
}
