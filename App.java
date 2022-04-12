import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.tools.javac.util.StringUtils;

public class App {
  public static void main(String[] args) {
    System.out.println("Will be testing regex soon");

    private String REGEX_WHITELIST_1 = "\\d";
    private String TEST = "932a";

  }

  private void regexValidation(String input, String regex) {
    boolean isValid = StringUtils.isBlank(input) || !java.util.regex.Pattern.compile(regex).matcher(input).matches();
  }
}
