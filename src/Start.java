import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Start extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Coffee Shop");
        primaryStage.show();

        //load menu
        MainMenu mainMenu = new MainMenu();

        mainMenu.SetMainMenuGrid();
        Scene scene = mainMenu.GetMainMenuScene();

        primaryStage.setScene(scene);

        //add to menu
        Label coffeeLabel = new Label("Select Beverage: ");
        mainMenu.AddToGrid(coffeeLabel, 0,1);

        ComboBox coffeeComboBox = new ComboBox<>();
        coffeeComboBox.getItems().add("Hot Coffee");
        coffeeComboBox.getItems().add("Iced Coffee");
        coffeeComboBox.getItems().add("Hot Tea");
        mainMenu.AddToGrid(coffeeComboBox, 1,1);


        Label lbl = new Label("How many cups of coffee would you like?");
        mainMenu.AddToGrid(lbl, 0,2);

        TextField tf = new TextField();
        mainMenu.AddToGrid(tf,1,2);

        Button orderButton = new Button("Order");
        mainMenu.AddToGrid(orderButton, 0,3);

    }

}
