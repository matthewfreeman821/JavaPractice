import java.util.ArrayList;
import java.util.List;
import Constants.java;

public class App {
  public static void main(String[] args) {
    // Create array of strings to test against regex
    ArrayList<String> stringsToTest = new ArrayList<String>();
    // Create array of regex to test strings with
    ArrayList<String> regexTests = new ArrayList<String>();
    // Add regex from constants file to array
    regexTests.add(Constants.REGEX_1);
    regexTests.add(Constants.REGEX_2);
    regexTests.add(Constants.REGEX_3);
    regexTests.add(Constants.REGEX_4);
    regexTests.add(Constants.REGEX_5);
    stringsToTest.add(Constants.TEST_1);
    stringsToTest.add(Constants.TEST_2);
    stringsToTest.add(Constants.TEST_3);
    stringsToTest.add(Constants.TEST_4);
    regexPrint(stringsToTest, regexTests);
  }

  private static boolean regexValidation(String input, String regex) {
    return java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }

  private static void regexPrint(ArrayList<String> input, ArrayList<String> regex) {
    input.forEach(string -> {
      regex.forEach(regexToTest -> {
        if (regexValidation(string, regexToTest)) {
          System.out.println(string + " is inside the regex: " + regex);
        }
      });
    });
  }
}
