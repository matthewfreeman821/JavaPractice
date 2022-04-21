import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class App {
  public static void main(String[] args) {
    System.out.println("Will be testing regex soon");

    final String REGEX_WHITELIST_1 = "^.*(\\r\\n|\\r|\\n).*$";
    final String TEST = "93\r\n2a";

    System.out.println("The value is " + regexValidation(TEST, REGEX_WHITELIST_1));
  }

  private static boolean regexValidation(String input, String regex) {
    return java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }
}
