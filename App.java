import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Person matthew = new Person("Matthew");
    System.out.println(matthew.name);
  }

  static ArrayList<String> names = new ArrayList<>();

  public static class Person {
    String name;

    public Person(String name) {
      this.name = name;
    }
  }

}
