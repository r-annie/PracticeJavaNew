import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      System.out.println(getFormatting(input));
    }
  }

  public static String getFormatting(String textOfInput) {
    String nameSurname = textOfInput.trim();
    String regex = "[A-zА-ё- ]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(nameSurname);
    String result = "";
    String textOfFullName = "";
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      textOfFullName = nameSurname.substring(start, end);
    }
    int count = 0;
    for(int i = 0; i < textOfFullName.length(); i++) {
      if(Character.isWhitespace(textOfFullName.charAt(i)))
      count++;
    }
    if (count == 2) {
      String[] text = textOfFullName.split(" ");
      String template = "Фамилия: %s%nИмя: %s%nОтчество: %s";
        result = String.format(template, text[0], text[1], text[2]);
      } else {
        result = "Введенная строка не является ФИО";
      }
    return result;
  }
}
