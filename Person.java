import java.util.ArrayList;
import java.util.List;

public class Person {
  String fName;
  String lName;
  int age;
  List<String> bag = new ArrayList();
  String dob;

  public Person(String fName, String lName, int age, List bag, String dob) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.bag = bag;
    this.dob = dob;
  }

  public void printName(String str) {
    System.out.println(str);
  }

  public void updateFName(String newFName) {
    this.fName = newFName;
    System.out.println("You have changed your first name.");
  }

  public void printFullName(String fName, String lName) {
    System.out.println(fName + " " + lName);
  }

  public void printAge(int age) {
    System.out.println("This person's age is " + this.age + ".");
  }

  public void updateAge(int newAge) {
    this.age = newAge;
    System.out.println("You have updated your age.");
  }

  public void printDob(String dob) {
    System.out.println("This person's date of birth is " + dob + ".");
  }

  public void printBagItems(List bag) {
    System.out.println("The items in the bag are: ");
    bag.forEach(str -> System.out.println(str));
  }

  public void addItemsToBag(String item, List bag) {
    bag.add(item);
  }

  public void removeLastItem(List bag) {
    bag.remove((bag.size() - 1));
  }
}