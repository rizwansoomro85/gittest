
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by riz on 8/25/16.
 */
public class Login {

    public static boolean displayLogin() {

        final boolean ok;
        Stage window = new Stage();
        window.setTitle("Login Window");
        window.initModality(Modality.APPLICATION_MODAL);
        //setUserAgentStylesheet(STYLESHEET_CASPIAN);


        //Grid Setup

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);


        //Componenet Declaration

        Label labelTitle = new Label("LOGIN");
        grid.setConstraints(labelTitle, 1, 0);

        Label labelUsername = new Label("Username:");
        grid.setConstraints(labelUsername, 0, 1);

        Label labelPassword = new Label("Password:");
        grid.setConstraints(labelPassword, 0, 2);

        TextField userInput = new TextField();
        grid.setConstraints(userInput, 1, 1);

        PasswordField passInput = new PasswordField();
        grid.setConstraints(passInput, 1, 2);

        Button btnLogin = new Button("Login");
        grid.setConstraints(btnLogin, 0, 3);

        Button btnClear = new Button("Clear");
        grid.setConstraints(btnClear, 1, 3);

        //Button Functions
        btnLogin.setOnAction(e -> {
            if (userInput.getText() == "admin" && passInput.getText() == "admin")
            {

            }
        });




        //setup

        grid.getChildren().addAll(labelTitle, labelUsername, userInput, labelPassword, passInput, btnLogin, btnClear);


        Scene scene = new Scene(grid, 260, 160);

        window.setScene(scene);
        window.showAndWait();


    }
}
