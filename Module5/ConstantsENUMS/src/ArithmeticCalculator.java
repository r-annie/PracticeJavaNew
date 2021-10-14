public class ArithmeticCalculator {

    private double numberOne;
    private double numberTwo;
    private static ArithmeticCalculator initialization = null;

    private ArithmeticCalculator() {
    }

    public static ArithmeticCalculator init() {
        if (initialization == null) {
            initialization = new ArithmeticCalculator();
        }
        return initialization;
    }

    public void setNumberOne(double numberOne) {
        initialization.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        initialization.numberTwo = numberTwo;
    }

    public double calculate(Operation operation) {
        if (operation.equals(Operation.ADD)) {
            return initialization.numberOne + initialization.numberTwo;
        }
        if (operation.equals(Operation.MULTIPLY)) {
            return initialization.numberOne * initialization.numberTwo;
        }
        if (operation.equals(Operation.SUBSTRACT)) {
            return initialization.numberOne - initialization.numberTwo;
        }
        return 00;
    }
}
