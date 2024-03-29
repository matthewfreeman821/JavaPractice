public class Snake extends Animal {
  private Person owner;
  private Person previousOwner;
  private Integer length;

  @Override
  public void speak() {
    System.out.println("HISSS");
  }

  @Override
  public void move() {
    System.out.println("Animal slithers");
  }

  public Snake() {
  };

  public Snake(Person owner) {
    this.owner = owner;
    this.owner.setSnake(this);
  }

  public Snake(Person owner, Integer length) {
    this.owner = owner;
    this.length = length;
  }

  public Person getOwner() {
    return this.owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public void printOwner() {
    System.out.println(this.owner.getName());
  }

  public Integer getLength() {
    return this.length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public void setPreviousOwner(Person previousOwner) {
    this.previousOwner = previousOwner;
  }

  public Person getPreviousOwner() {
    return this.previousOwner;
  }
}