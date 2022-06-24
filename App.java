import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    // Adding comment to
    // try revert again
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

  public enum Testing {
    TEST, FINAL, RUNNING
  }
}
