import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate birthday;
        LocalDate today = LocalDate.now();
        int i = 0;
        System.out.println(birthday.plusYears(10));

        while (birthday.isBefore(today)) {
            String allBirthdays = i + " - " +  birthday + " - " + birthday.getDayOfWeek() + System.lineSeparator();
            birthday = birthday.plusYears(1);
            i++;
        }

        public String collectBirthdays(int year, int month, int day) {
            birthday = LocalDate.of(year,month,day);
            System.out.println(birthday);
        }

    }
}
