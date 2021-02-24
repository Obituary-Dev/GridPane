package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("the new boston - JavaFX");

        GridPane grid = new GridPane();
        // Inset is an object who can have 4 values: padding you want to add to each edge in px
        grid.setPadding(new Insets(10, 10, 10, 10));
        // set the vertical spacing in px in cells themselves not all layout
        grid.setVgap(8);
        grid.setHgap(15);

        // Name label
        Label nameLabel = new Label("Username:");
        // the name label is going to appear on top left of the grid 
        // parameters: object, column, row
        GridPane.setConstraints(nameLabel, 0, 0);

        // Name input 
        TextField nameInput = new TextField("Hisoka");
        GridPane.setConstraints(nameInput, 1, 0);

        // Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        // Password input 
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);
        
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        
        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }

}
