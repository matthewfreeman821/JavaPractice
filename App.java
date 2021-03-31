import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    names.add("Matthew");
    names.add("Krista");
    names.add("Maddie");
    names.add("Ali");
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }
  }

  // public static int add(int a, int b) {
  // int sum = a + b;

  // return sum;
  // }

  // public static int subtract(int a, int b) {
  // int diff = a - b;

  // return diff;
  // }

  // public static int multiply(int a, int b) {
  // int product = a * b;

  // return product;
  // }

  // public static int divide(int a, int b) {
  // int division = a / b;

  // return division;
  // }

  static ArrayList<String> names = new ArrayList<>();
}
