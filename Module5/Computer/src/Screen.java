public class Screen {

    private final double screenDiagonal;
    private final TypeOfScreen screenType;
    private final double screenWeight;

    public Screen(double screenDiagonal,TypeOfScreen screenType,double screenWeight) {
        this.screenDiagonal = screenDiagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;
    }


    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public TypeOfScreen getScreenType() {
        return screenType;
    }

    public double getScreenWeight() {
        return screenWeight;
    }

    public String toString () {
        return "Диагональ монитора:" + screenDiagonal + ", Тип монитора:" + screenType +
                ", Вес монитора:" + screenWeight;
    }
}
