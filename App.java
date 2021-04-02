import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    names.add("Matthew");
    names.add("Krista");
    names.add("Maddie");
    names.add("Ali");
    // for (int i = 0; i < names.size(); i++) {
    // System.out.println(names.get(i));
    // }

    // for (String i : names) {
    // System.out.println(i);

    // names.forEach(name -> System.out.println(name + " forEach loop"));

    for (String i : names) {
      if (i.equals("Maddie")) {
        System.out.println("Name is " + i);
      } else {
        System.out.println("Name is not Maddie");
      }
    }
  }

  static ArrayList<String> names = new ArrayList<>();

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
}
