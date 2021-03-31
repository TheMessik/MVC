package mvc;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * The mvc.Model in our MVC example. Stores the value and provides methods to change it
 */
public class Model {
    private final IntegerProperty numberProperty;

    public Model() {
        numberProperty = new SimpleIntegerProperty(0);
    }

    public IntegerProperty getNumberProperty() {
        return numberProperty;
    }

    public void increment() {
        numberProperty.set(numberProperty.get() + 1);
    }

    public void decrement() {
        numberProperty.set(numberProperty.get() - 1);
    }
}
