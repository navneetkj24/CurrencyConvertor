import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Currency Converter"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        Image icon = new Image("i.png");
        primaryStage.getIcons().add(icon);
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
