import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by riz on 8/25/16.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Main Window Setup
        Stage window = primaryStage;
        window.setTitle("M.R.SHIPPING AGENCY PVT LTD");
        window.setMaximized(true);

        //Menu Bar

        MenuBar menuBar = new MenuBar();
        //MENUS
        //User Menu
        Menu users = new Menu("USERS");
        //user menu items
        MenuItem userManagement = new MenuItem("User Management");
        MenuItem logout = new MenuItem("Logout");
        users.getItems().addAll(userManagement, logout);

        //Setup Menu
        Menu setups = new Menu("SETUPS");
        //Setup Menu Items
        MenuItem companySetup = new MenuItem("Company Setup");
        MenuItem partiesInfo = new MenuItem("Parties Info Setup");
        MenuItem billingHeads = new MenuItem("Billing Head Setup");
        MenuItem misc = new MenuItem("Misc Info Setup");
        MenuItem gdSetup = new MenuItem("GD Setup");
        setups.getItems().addAll(companySetup, partiesInfo, billingHeads, misc, gdSetup);

        //Billing Menu
        Menu billing = new Menu("BILLING");
        //Billing Menu Items
        MenuItem billEntry = new MenuItem("GD Data Entry");
        MenuItem billPreparation = new MenuItem("Bill Preparation");
        billing.getItems().addAll(billEntry, billPreparation);

        //Report Menu
        Menu reports = new Menu("REPORTS");
        //Report Menu Items
        MenuItem jobRegister = new MenuItem("Job Register");
        MenuItem srbRegister= new MenuItem("SRB Register");
        MenuItem listOfDebitNote= new MenuItem("List of Debit Note");
        MenuItem salesTaxRegister= new MenuItem("Sales Tax Register");
        reports.getItems().addAll(jobRegister, srbRegister, listOfDebitNote, salesTaxRegister);

        //Menu Bar Content
        menuBar.getMenus().addAll(users,setups,billing,reports);

        //Images
        Image image = new Image("image1.jpg");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setFitHeight(150);
        iv1.setFitWidth(200);
        iv1.setPreserveRatio(true);
        iv1.setSmooth(true);
        iv1.setCache(true);

        //Address
        Label lbl1 = new Label("M.R. Shipping Agency (Pvt) Ltd");
        lbl1.setStyle("-fx-font-size: 13pt");
        lbl1.setStyle("-fx-font-weight: bold");
        Label lbl2 = new Label("Office No. 5, Mezzanine Floor,");
        Label lbl3 = new Label("Sutli Plaza, Young Husband Road");
        Label lbl4 = new Label("Kharadar, Karachi.");
        Label lbl5 = new Label("(92-21)32313948-9");

        //Misc
        Label lblYear = new Label("Accounting Year");
        lblYear.setStyle("-fx-font-weight: bold");
        lblYear.setStyle("-fx-font-size: 20pt");
        TextField fromDate = new TextField();
        TextField toDate = new TextField();
        fromDate.setDisable(true);
        toDate.setDisable(true);
        //Group grp1 = new Group();
        //grp1.getChildren().addAll(fromDate, toDate);

        //LAYOUT
        BorderPane mainLayout = new BorderPane();
        VBox leftBox = new VBox(5);
        leftBox.setAlignment(Pos.BOTTOM_LEFT);
        leftBox.getChildren().addAll(iv1, lbl1, lbl2, lbl3, lbl4, lbl5);

        VBox rightBox = new VBox(15);
        rightBox.setAlignment(Pos.BASELINE_LEFT);
        rightBox.getChildren().addAll(lblYear, fromDate, toDate);
        //LAYOUT CONTENT SETUP
        mainLayout.setTop(menuBar);
        mainLayout.setLeft(leftBox);
        mainLayout.setRight(rightBox);




        //Scene Setup
        Scene scene = new Scene(mainLayout);
        window.setScene(scene);
        window.hide();
        Login.displayLogin();

    }
}
