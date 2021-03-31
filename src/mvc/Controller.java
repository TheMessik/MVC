package mvc;

/**
 * The mvc.Controller in our MVC example. It sets up event handlers to react to button presses
 */
public class Controller {
    public Controller(Model model, View view) {
        // as soon as the button is pressed, the EventHandler is fired (the lambda part), changing the model accordingly
        view.getDecrementButton().setOnAction(e -> model.decrement());

        // you may be wondering "Couldn't you have just set this up when you were creating these?"
        // and the answer is "Yes, I could've".
        // However, in larger programs, you might be doing something else besides just updating the model in your EventHandler
        // which in turn leads to less readable code.
        // This is just a toy example, but it is a good practice to do it this way
        view.getIncrementButton().setOnAction(e -> model.increment());
    }
}
