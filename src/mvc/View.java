package mvc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * The view in our MVC example. It consists of 2 buttons and a label.
 */
public class View extends StackPane {

    private final Label label;
    private final Button decrement;
    private final Button increment;

    public View(Model model) {
        label = new Label();
        label.setText(model.getNumberProperty().getValue().toString());
        label.setTranslateX(50);
        decrement = new Button("-1");
        decrement.setTranslateX(-50);
        increment = new Button("+1");
        increment.setTranslateX(150);

        // this is the juicy part
        // by registering the listener to the numberProperty inside the model, we can react to data changes automagically
        // In JavaFX, there are 2 types of listeners: ChangeListener and InvalidationListener
        // they both fire as soon as something happens, but ChangeListener provides you with the new value directly
        // and ergo, is my favourite
        model.getNumberProperty().addListener((obj, oldVal, newVal) -> label.setText(newVal.toString()));

        // We can also set up an InvalidationListener to the numberProperty, like shown below
        // As it only provides us with an Observable, we need to first cast it to the specific property we are working with

        /*
        model.getNumberProperty().addListener((observable -> {
            IntegerProperty casted = (IntegerProperty) observable;
            label.setText(casted.getValue().toString());
        }));
        */

        this.getChildren().addAll(label, decrement, increment);
    }

    public Button getDecrementButton() {
        return decrement;
    }

    public Button getIncrementButton() {
        return increment;
    }
}
