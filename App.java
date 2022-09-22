import java.util.ArrayList;
import java.util.List;
import Constants.java;

public class App {
  public static void main(String[] args) {
    ArrayList<String> stringsToTest = new ArrayList<String>();
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

}
