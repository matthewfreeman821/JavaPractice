import java.util.ArrayList;

import javax.print.attribute.standard.PrinterName;

public class App {
  public static void main(String[] args) {
    Person matthew = new Person("Matthew", 34);
    Person.printName(matthew.name);
    Person.printAge(matthew.age);
  }

  static ArrayList<String> names = new ArrayList<>();

  public static class Person {
    String name;
    int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public static void printName(String str) {
      System.out.println(str);
    }

    public static void printAge(int age) {
      System.out.println("This person's age is " + age + ".");
    }
  }

}
