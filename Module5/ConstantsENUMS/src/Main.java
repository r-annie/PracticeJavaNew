public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(2,4);
        System.out.println(ArithmeticCalculator.calculate(Operation.ADD));
        System.out.println(ArithmeticCalculator.calculate(Operation.MULTIPLY));
        System.out.println(ArithmeticCalculator.calculate(Operation.SUBSTRACT));

    }
}
