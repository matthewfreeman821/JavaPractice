import java.util.ArrayList;
import java.util.List;

public class Person extends Animal {
  private String fName;
  private String lName;
  private int age;
  private List<String> bag = new ArrayList();
  private String dob;
  private String nickname;

  public Person() {
  };

  public Person(String fName, String lName, int age, List bag, String dob, String nickname) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.bag = bag;
    this.dob = dob;
    this.nickname = nickname;
  }

  public Person(String fName, String lName, int age, List bag, String dob) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.bag = bag;
    this.dob = dob;
  }

  public void setNickname(String newNickname) {
    this.nickname = newNickname;
  }

  public String getNickname() {
    return this.nickname;
  }

  public void updateFName(String newFName) {
    this.fName = newFName;
    System.out.println("You have changed your first name.");
  }

  public void updateLName(String newLName) {
    this.lName = newLName;
    System.out.println("You have changed your last name.");
  }

  public void printFullName() {
    System.out.println(this.fName + " " + this.lName);
  }

  public void printAge() {
    System.out.println("This person's age is " + this.age + ".");
  }

  public void updateAge(int newAge) {
    this.age = newAge;
    System.out.println("You have updated your age.");
  }

  public void printDob() {
    System.out.println("This person's date of birth is " + this.dob + ".");
  }

  public String getDob() {
    return this.dob;
  }

  public void printBagItems() {
    System.out.println("The items in the bag are: ");

    if (this.bag.size() == 0) {
      // Lamda expression
      // this.bag.forEach(str -> System.out.println(str));

      // Consumer
      // this.bag.forEach(System.out::println);

      // Enhanced for loop
      System.out.println("Bag is empty");
    } else {
      for (String s : this.bag) {
        System.out.println(s);
      }
    }

  }

  public void addItemsToBag(String item, List bag) {
    bag.add(item);
  }

  public void removeLastItem(List bag) {
    bag.remove((bag.size() - 1));
  }

  public void updateNickname(String newNickname) {
    this.nickname = newNickname;
    System.out.println("You have updated your nickname.");
  }

  public void printNickname() {
    System.out.println(this.nickname);
  }

  @Override
  public void speak() {
    System.out.println("Hello");
  }
}