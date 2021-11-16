package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;

public class ToDoListApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(ToDoListApplication.class.getResource("MenuScreenToDoList.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = FXMLLoader.load(ToDoListApplication.class.getResource("MenuScreenToDoList.fxml"));
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}