import java.security.Key;

public class Keyboard {

    private final String keyboardType;
    private final boolean keyboardBacklight;
    private final double keyboardWeight;

    public Keyboard(String keyboardType,boolean keyboardBacklight, double keyboardWeight) {
        this.keyboardType = keyboardType;
        this.keyboardBacklight = keyboardBacklight;
        this.keyboardWeight = keyboardWeight;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public boolean isKeyboardBacklight() {
        return keyboardBacklight;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public String toString () {
        return "Тип клавиатуры:" + keyboardType + ", Есть ли подсветка:" + keyboardBacklight +
                ", Вес клавиатуры:" + keyboardWeight;
    }
}
