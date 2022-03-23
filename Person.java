import java.util.ArrayList;
import java.util.List;

public class Person extends Animal {
  private String fName;
  private String lName;
  private int age;
  private List<String> bag = new ArrayList();
  private String dob;
  private String nickname;
  private Integer height;
  private Snake snake;
  private String birthday;

  public Person() {
  };

  public Person(String fName, String lName, int age, List bag, String dob, String nickname, Integer height) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.bag = bag;
    this.dob = dob;
    this.nickname = nickname;
    this.height = height;
  }

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

  @Override
  public String getName() {
    String name = this.fName + " " + this.lName;
    return name;
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

  @Override
  public void move() {
    System.out.println(this.fName + " walks.");
  }

  public Integer getHeight() {
    return this.height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  // Create method to determine if person has snake
  public Boolean hasSnake() {
    // Test if snake is present
    if (this.snake == null) {
      return false;
    }
    return true;
  }

  // Setters and getters for snake
  public void setSnake(Snake snake) {
    if (null != snake.getOwner()) {
      snake.setPreviousOwner(snake.getOwner());
      this.snake = snake;
      this.snake.setOwner(this);
    } else {
      this.snake = snake;
      this.snake.setOwner(this);
    }
  }

  // Create method where if person has a snake, they can play with it
  public void playWithSnake() {
    // Check if snake is present
    if (this.snake == null || this.snake.getPreviousOwner() != null) {
      System.out.println("This person does not have a snake!");
      System.out.println("Get yourself a snake to play with!");
    } else {
      // play if present
      System.out.println(this.getName() + " holds the snake.");
    }
  }

  // Create similar method to feed snake
  public void feedSnake() {
    if (this.snake == null || this.snake.getPreviousOwner() != null) {
      System.out.println("This person does not have a snake!");
      System.out.println("Get yourself a snake to play with!");
    }
    System.out.println(this.getName() + " feeds the snake");
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
}