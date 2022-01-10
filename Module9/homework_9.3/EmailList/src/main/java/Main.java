import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        EmailList mailTree = new EmailList();

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String newLine = scanner.nextLine();
            String scanTrim = newLine.trim();
            String[] scan = scanTrim.split("[ ]");

            String action = scan[0];

            switch (action) {

                case "ADD":
                    mailTree.add(scan[1]);
                    continue;

                case "LIST":

                    System.out.println(mailTree.getSortedEmails());
                    continue;

                default:
                    System.out.println("Давайте выберем действие!");
                    break;
            }
            scanner.close();
            }
            //TODO: write code here
            
        }
    }
