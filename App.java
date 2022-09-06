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
    // Add regex from constants file to array
    // Create method to dynamically add constants
    regexTests.add(Constants.REGEX_1);
    regexTests.add(Constants.REGEX_2);
    regexTests.add(Constants.REGEX_3);
    regexTests.add(Constants.REGEX_4);
    regexTests.add(Constants.REGEX_5);
    // Add strings from constants file to array
    stringsToTest.add(Constants.TEST_1);
    stringsToTest.add(Constants.TEST_2);
    stringsToTest.add(Constants.TEST_3);
    stringsToTest.add(Constants.TEST_4);
    // Call method with built arrays
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

  private static void addToList(String word) {
    ArrayList words = new ArrayList<>();

  }
}
