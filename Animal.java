//Perhaps change to an abstract class?
public class Animal {
  // Set variables to private
  private String name;
  private Integer weight;

  public void Animal() {

  }

  public void Animal(String name) {
    this.name = name;
  }

  public void speak() {
    System.out.println("Animal makes a sound");
  }

  public void walk() {
    System.out.println("Animal walks");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;

  }
}