import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      while (true) {
          String input = scanner.nextLine();
          if (input.equals("0")) {
              break;
          }
          int count = 0;
          boolean isCorrectLetter = false;

          for (int i = 0; i < input.length(); i++) {
              char currentChar = input.charAt(i);
              if (currentChar == ' ') {
                  count++;
              }
              if ((((int) 'А' <= (int) currentChar) && ((int) 'ё' >= (int) currentChar))
                      || currentChar == '-' || currentChar == ' ') {
                  isCorrectLetter = true;
              } else {
                  break;
              }
          }
          if (isCorrectLetter && count == 2) {
              System.out.println(getFormatting(input));
          } else {
              System.out.println("Введенная строка не является ФИО");
          }
      }
  }

    public static String getFormatting(String text) {
        String nameSurname = text.trim();

        int firstSpace = nameSurname.indexOf(" ");
        int lastSpace = nameSurname.lastIndexOf(" ");

        int startSurname = 0;
        int endSurname = firstSpace;
        String surname = nameSurname.substring(startSurname, endSurname);

        int startName = endSurname + 1;
        int endName = lastSpace;
        String name = nameSurname.substring(startName, endName);

        int startPatronymic = endName + 1;
        String patronymic = nameSurname.substring(startPatronymic);

        String template = "Фамилия: %s%nИмя: %s%nОтчество: %s";
        String result = String.format(template, surname, name, patronymic);
        return result;
      }
}