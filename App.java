import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    System.out.println("Will be testing regex soon");

    final String REGEX_1 = "^.*(\\r\\n|\\r|\\n).*$";
    final String REGEX_2 = "^\\d$";
    final String TEST = "93\r\n2a";
    final String TEST_2 = "932";
    final String TEST_3 = "abcDEF";
    ArrayList<String> stringsToTest = new ArrayList<String>();
    ArrayList<String> regexTests = new ArrayList<String>();
    regexTests.add(REGEX_1);
    regexTests.add(REGEX_2);

    stringsToTest.add(TEST);
    stringsToTest.add(TEST_2);
    stringsToTest.add(TEST_3);

    stringsToTest.forEach(string -> {
      regexTests.forEach(regex -> regexValidation(string, regex));
      System.out.println(string);
    });
  }

  private static boolean regexValidation(String input, String regex) {
    return java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }
}
