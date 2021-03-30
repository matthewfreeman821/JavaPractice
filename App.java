public class App {
  public static void main(String[] args) {
    System.out.println(add(3, 4));
    System.out.println(subtract(3, 4));
  }

  public static int add(int a, int b) {
    int sum = a + b;

    return sum;
  }

  public static int subtract(int a, int b) {
    int diff = a - b;

    return diff;
  }

  public static int multiply(int a, int b) {
    int product = a * b;

    return product;
  }

  public static int divide(int a, int b) {
    int division = a / b;

    return division;
  }
}
