public class Main {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    String regex = "[^A-zА-ё`'’]+";
    text = text.replaceAll(regex," ");

    String[] words = text.split("\\s");
    String result = "";

    if (words.length >= 100) {
      for (String word : words) {
        result = result + word + "\n";
      }
      }
    return result.trim();
    }
  }
