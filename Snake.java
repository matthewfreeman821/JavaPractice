public class Snake extends Animal {
  private String name;
  private Person owner;

  @Override
  public void speak() {
    system.out.println("HISSS");
  }

  public void Snake() {
  };

  public void Snake(String name) {
    this.name = name;
  }

  public void Snake(String name, Person owner) {
    this.name = name;
    this.owner = owner;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void printName() {
    System.out.println(this.name);
  }

  public Person getOwner() {
    return this.owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public void printOwner() {
    System.out.println(this.owner);
  }
}