public class Snake extends Animal {
  private String name;

  public void Snake() {
  };

  public void Snake(String name) {
    name = this.name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}