import java.util.ArrayList;
import java.util.List;

public class Person {
  String name;
  int age;
  List<String> bag = new ArrayList();
  String dob;

  public Person(String name, int age, List bag, String dob) {
    this.name = name;
    this.age = age;
    this.bag = bag;
    this.dob = dob;
  }

  public void printName(String str) {
    System.out.println(str);
  }

  public void printAge(int age) {
    System.out.println("This person's age is " + age + ".");
  }

  public void printDob(String dob) {
    System.out.println("This person's date of birth is " + dob + ".");
  }
}