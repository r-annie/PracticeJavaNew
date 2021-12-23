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
      System.out.println(formatPhoneNumber(input));
    }
  }

  public static String formatPhoneNumber (String phoneNumber) {
    String regex = "[^0-9]";
    String regexDo = "[0-9]";
    phoneNumber = phoneNumber.trim();
    String phoneReplace = phoneNumber.replaceAll(regex,"");
    Pattern pattern = Pattern.compile(regexDo);
    Matcher matcher = pattern.matcher(phoneReplace);
    int count = 0;
    String result = "";
    while (matcher.find())
      count++;
      if (count == 11) {
        if (phoneReplace.startsWith("8")) {
          phoneReplace = phoneReplace.substring(1);
          result = "7" + phoneReplace;
        }
        if (phoneReplace.startsWith("7")) {
          result = phoneReplace;
        }
      }
      if (count == 10) {
        result = "7" + phoneReplace;
      }
    if (result.equals("")) {
      result = "Неверный формат номера";
    }
    return result;
  }
}
