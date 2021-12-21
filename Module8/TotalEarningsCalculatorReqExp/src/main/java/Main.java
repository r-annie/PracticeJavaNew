import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  }

  public static int calculateSalarySum(String text){
    String regex = "[0-9]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    int salarySum = 0;
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      int salary = Integer.parseInt(text.substring(start,end));
      salarySum = salarySum + salary;
    }
    return salarySum;
  }

}