public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator firstCalculation = ArithmeticCalculator.init();
        firstCalculation.setNumberOne(1);
        firstCalculation.setNumberTwo(2);
        System.out.println(firstCalculation.calculate(Operation.ADD));
        System.out.println(firstCalculation.calculate(Operation.MULTIPLY));
        System.out.println(firstCalculation.calculate(Operation.SUBSTRACT));

        ArithmeticCalculator secondCalculation = ArithmeticCalculator.init();
        secondCalculation.setNumberOne(10);
        secondCalculation.setNumberTwo(20);
        System.out.println(secondCalculation.calculate(Operation.ADD));
        System.out.println(secondCalculation.calculate(Operation.MULTIPLY));
        System.out.println(secondCalculation.calculate(Operation.SUBSTRACT));
    }
}
