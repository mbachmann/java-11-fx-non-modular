package hellofx;

import hellofx.sample.SampleController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloFX extends Application {

    Scene mainScene;
    Scene sampleScene;

    @Override
    public void start(Stage primaryStage)  {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Button button = new Button("Open Sample Scene");
        button.setOnAction(event -> handleButtonClick(primaryStage));

        VBox vBox = new VBox(label, button);
        alignVBox(vBox);

        mainScene = new Scene(vBox, 640, 480);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch();
    }

    private void alignVBox (VBox vBox) {
        vBox.setPadding(new Insets(10, 50, 50, 50));
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.BASELINE_LEFT);
    }

    private void handleButtonClick(Stage primaryStage) {
        try {
            if (sampleScene == null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sample/sample.fxml"));
                Parent sampleRoot = loader.load();
                SampleController sampleController = (SampleController) loader.getController();
                sampleController.init(primaryStage, mainScene);
                sampleScene = new Scene(sampleRoot, 640, 480);
            }
            primaryStage.setScene(sampleScene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
