public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";

        String[] lines = line.split(",?\\s+");

        System.out.println(ReverseArray.reverse(lines));
    }


}
