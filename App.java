import java.util.ArrayList;
import java.util.List;
import Constants.java;

public class App {
  public static void main(String[] args) {
    System.out.println(Constants.REGEX_1);
    ArrayList<String> stringsToTest = new ArrayList<String>();
    ArrayList<String> regexTests = new ArrayList<String>();
    regexTests.add(Constants.REGEX_1);
    regexTests.add(Constants.REGEX_2);
    regexTests.add(Constants.REGEX_3);
    regexTests.add(REGEX_4);
    regexTests.add(REGEX_5);
    stringsToTest.add(TEST_1);
    stringsToTest.add(TEST_2);
    stringsToTest.add(TEST_3);
    stringsToTest.add(TEST_4);
    regexPrint(stringsToTest, regexTests);
  }

  private static boolean regexValidation(String input, String regex) {
    return java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }

  private static void regexPrint(ArrayList<String> input, ArrayList<String> regex) {
    input.forEach(string -> {
      regex.forEach(regexToTest -> {
        if (regexValidation(string, regexToTest)) {
          System.out.println(string + regex + " TRUE");
        } else {
          System.out.println(string + regex + " FALSE");
        }
        ;
      });
    });
  }
}
