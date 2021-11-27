public class Main {

    public static void main(String[] args) {
        GeometryCalculator rectCalculator = new GeometryCalculator(3,4,5);
        GeometryCalculator roundCalculator = new GeometryCalculator(44);

        System.out.println(rectCalculator.checkOpportunity());
        System.out.println(rectCalculator.rectangleSquare());
        System.out.println(roundCalculator.roundVol());
        System.out.println(roundCalculator.roundSquare());
    }
}
