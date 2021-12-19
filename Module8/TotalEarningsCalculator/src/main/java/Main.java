public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(getSum(text));
  }

  public static int getSum(String value) {
    String firstHuman = "Вася заработал ";
    int start1 = value.indexOf(firstHuman) + firstHuman.length();
    int end1 = value.indexOf(" руб", start1);
    String earnFirstHuman = value.substring(start1,end1);

    String secondHuman = "Петя - ";
    int start2 = value.indexOf(secondHuman) + secondHuman.length();
    int end2 = value.indexOf(" руб", start2);
    String earnSecondHuman = value.substring(start2,end2);

    String thirdHuman = "Маша - ";
    int start3 = value.indexOf(thirdHuman) + thirdHuman.length();
    int end3 = value.indexOf(" руб", start3);
    String earnThirdHuman = value.substring(start3,end3);

    int overallSum = Integer.parseInt(earnFirstHuman) + Integer.parseInt(earnSecondHuman) +
            Integer.parseInt(earnThirdHuman);

    return overallSum;
  }
}