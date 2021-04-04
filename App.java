import java.util.ArrayList;

import javax.print.attribute.standard.PrinterName;

public class App {
  public static void main(String[] args) {
    Person matthew = new Person("Matthew");
    matthew.printName(matthew.name);
  }

  static ArrayList<String> names = new ArrayList<>();

  public static class Person {
    String name;

    public Person(String name) {
      this.name = name;
    }

    public static void printName(String str) {
      System.out.println(str);
    }
  }

}
