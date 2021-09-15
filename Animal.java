//Perhaps change to an abstract class?
public class Animal {
  // Set variables to private
  private String name;

  private void speak() {
    System.out.println("Animal makes a sound");
  }

  private void walk() {
    System.out.println("Animal walks");
  }

  public void Animal() {

  }

  public void Animal(String name) {
    this.name = name;
  }

  public string getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;

  }
}