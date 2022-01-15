//Perhaps change to an abstract class?
public class Animal {
  private String name;
  private Integer weight;

  public Animal() {

  }

  public void Animal(String name) {
    this.name = name;
  }

  public Animal(String name, Integer weight) {
    this.name = name;
    this.weight = weight;
  }

  public void speak() {
    System.out.println("Animal makes a sound");
  }

  public void move() {
    System.out.println("Animal moves");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;

  }

  public Integer getWeight() {
    return this.weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }
}