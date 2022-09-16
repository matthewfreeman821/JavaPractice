import java.util.ArrayList;
import java.util.List;
import Constants.java;

//Application for comparing regex and strings

public class App {
  public static void main(String[] args) {
    // Create array of strings to test against regex
    ArrayList<String> stringsToTest = new ArrayList<String>();
    // Create array of regex to test strings with
    ArrayList<String> regexTests = new ArrayList<String>();

    printResults(stringsToTest, regexTests);
  }

  private static boolean regexValidation(String input, String regex) {
    // Checks if the input is inside the regex
    return java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }

  private static void printResults(ArrayList<String> input, ArrayList<String> regex) {
    input.forEach(string -> {
      regex.forEach(regexToTest -> {
        // Check if string is in regex
        if (regexValidation(string, regexToTest)) {
          // Print the below statement if the method returns true
          System.out.println(string + " is inside the regex: " + regex);
        }
      });
    });
  }

  private static ArrayList addToList(String word) {
    // Flesh out to handle more than word, or perhaps from a file?

    ArrayList words = new ArrayList<>();
    words.add(word);

    return words;
  }
}
