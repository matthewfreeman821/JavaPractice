import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    final String REGEX_1 = "^.*(\\r\\n|\\r|\\n).*$";
    final String REGEX_2 = "^[0-9]*$";
    final String REGEX_3 = "^[a-zA-Z]*$";
    final String REGEX_4 = "^[@#$%^]*$";
    final String TEST = "93\r\n2a";
    final String TEST_2 = "932";
    final String TEST_3 = "abcDEF";
    final String TEST_4 = "@#$%^";
    ArrayList<String> stringsToTest = new ArrayList<String>();
    ArrayList<String> regexTests = new ArrayList<String>();
    regexTests.add(REGEX_1);
    regexTests.add(REGEX_2);
    regexTests.add(REGEX_3);
    regexTests.add(REGEX_4);

    stringsToTest.add(TEST);
    stringsToTest.add(TEST_2);
    stringsToTest.add(TEST_3);
    stringsToTest.add(TEST_4);

    regexPrint(stringsToTest, regexTests);
  }

  private static boolean regexValidation(String input, String regex) {
    return java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }

  private static void regexPrint(String[] input, String[] regex) {
    stringsToTest.forEach(string -> {
      regexTests.forEach(regex -> {
        if (regexValidation(string, regex)) {
          System.out.println(string + regex);
          System.out.println("True");
          return;
        } else {
          System.out.println(string + regex);
          System.out.println("False");
        }
        ;
      });
    });
  }
}
