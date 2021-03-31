package mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Model model = new Model();
        View view = new View(model);
        // we don't need to instantiate it like this, since we're not using the object
        // omitting the part before the = sign would still lead to a compilable code
        // This is just a toy example, written for people who do not know the ins and outs of Java yet
        Controller controller = new Controller(model, view);

        // JavaFX specific stuff
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(view, 800,600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
