import java.util.ArrayList;
import java.util.List;

public class Person {
  String name;
  int age;
  List<String> bag = new ArrayList();

  public Person(String name, int age, List bag) {
    this.name = name;
    this.age = age;
    this.bag = bag;
  }

  public void printName(String str) {
    System.out.println(str);
  }

  public void printAge(int age) {
    System.out.println("This person's age is " + age + ".");
  }
}