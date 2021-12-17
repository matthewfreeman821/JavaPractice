public class Snake extends Animal {
  private String name;
  private Person owner;
  private Integer length;

  @Override
  public void speak() {
    System.out.println("HISSS");
  }

  @Override
  public void move() {
    System.out.println("Animal slithers");
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

  public void Snake(String name, Person owner, Integer length) {
    this.name = name;
    this.owner = owner;
    this.length = length;
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

  public Integer getLength() {
    return this.length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

}