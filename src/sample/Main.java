package sample;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import java.io.InputStream;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;

public class Main extends Application {
    public static final double width = 60;
    public static final double height = 60;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        double x = 0;
        double y = 0;
        Group root = new Group();
        GridPane tree = new GridPane();

        //creating a chessboard
        Rectangle[][] rect = new Rectangle[8][8];
        for( int i = 0; i < 8; i++){
            tree.getColumnConstraints().add(new ColumnConstraints(60));
            for(int j = 0; j < 8; j++) {
                rect[i][j] = new Rectangle();
                rect[i][j].setX(x);
                rect[i][j].setY(y);
                rect[i][j].setWidth(width);
                rect[i][j].setHeight(height);
                x = x + 60;
                if ((i + j) % 2 == 0 ) {
                    rect[i][j].setFill(Color.WHITE);
                } else {
                    rect[i][j].setFill(Color.GREY);
                }
                Group group = new Group(rect[i][j]);
                root.getChildren().add(group);
                tree.getRowConstraints().add(new RowConstraints(60));
            }
            y = y + 60;
            x = 0;
        }
        
        //Setting a black pawn
        Image img = new Image(getClass().getResourceAsStream("/resources/black_pawn.png"));
        ImageView imageView = new ImageView(img);
        imageView.setX(30);
        imageView.setY(90);
        root.getChildren().add(imageView);
        imageView.setImage(img);
        
        
        root.getChildren().add(tree);
        tree.setGridLinesVisible(true);
        Scene scene = new Scene(root,480,480);
        stage.setScene(scene);
        stage.setTitle("Chess");
        stage.show();
    }

}

