package mbjs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        var label = new Label("Hello, JavaFX , running on Java  + javaVersion + .");
        var scene = new Scene(new StackPane(label), 640, 480);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ksr2.fxml")));
        stage.setTitle("Linguistic Summary");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}