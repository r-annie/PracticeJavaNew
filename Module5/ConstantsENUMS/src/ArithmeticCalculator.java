public class ArithmeticCalculator {

    private static int numberOne;
    private static int numberTwo;

    ArithmeticCalculator(int numberOne, int numberTwo) {
        ArithmeticCalculator.numberOne = numberOne;
        ArithmeticCalculator.numberTwo = numberTwo;
    }

    public static int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return ArithmeticCalculator.numberOne + ArithmeticCalculator.numberTwo;
        }
        if (operation == Operation.MULTIPLY) {
            return ArithmeticCalculator.numberOne * ArithmeticCalculator.numberTwo;
        }
        if (operation == Operation.SUBSTRACT) {
            return ArithmeticCalculator.numberOne - ArithmeticCalculator.numberTwo;
        }
        return 0;
    }
}
