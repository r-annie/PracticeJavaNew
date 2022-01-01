import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
        System.out.println(arrayToString(TwoDimensionalArray.getTwoDimensionalArray(7)));
    }

    private static String arrayToString(char[][] array) {
        return Arrays.stream(array)
                .map(Arrays::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
