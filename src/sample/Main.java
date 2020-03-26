package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Group;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Group group = new Group();
        Scene scene = new Scene(group,480,480);

        Parent content = FXMLLoader.load(getClass().getResource("/ChessBoard.fxml"));
        BorderPane root = new BorderPane();
        root.setCenter(content);
        group.getChildren().add(root);
        
        stage.setScene(scene);
        stage.setTitle("Chess");
        stage.show();
    }


}
