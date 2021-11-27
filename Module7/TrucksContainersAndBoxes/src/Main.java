import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int boxes;
        int container = 0;
        int cargo = 0;
        int boxInCont = 27;
        int contInCargo = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ящиков: " + System.lineSeparator());
        boxes = scanner.nextInt();

        if (boxes > 0) {
            for (int i = 0; i <= (boxes-1); i++) {

                if (i % (contInCargo*boxInCont) == 0) {
                    cargo++;
                    System.out.print("Грузовик: " + cargo + System.lineSeparator());
                }
                if (i % boxInCont == 0) {
                    container++;
                    System.out.print("\t" + "Контейнер: " + container + System.lineSeparator());
                }

                System.out.print("\t" + "\t" + "Ящик: " + (i+1) + System.lineSeparator());
            }
            System.out.print("Необходимо:" + System.lineSeparator());
            System.out.print("Грузовиков: " + cargo + " шт." + System.lineSeparator());
            System.out.print("Контейнеров: " + container + " шт." + System.lineSeparator());
        } else {
            System.out.print("Задано неверное количество ящиков!" + System.lineSeparator());
        }
    }
}
