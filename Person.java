public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printName(String str) {
    System.out.println(str);
  }

  public void printAge(int age) {
    System.out.println("This person's age is " + age + ".");
  }
}