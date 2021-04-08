import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> bag = new ArrayList<>();
    bag.add("Hello");
    bag.add("World");
    Person matthew = new Person("Matthew", 34, bag);
    matthew.printName(matthew.name);
    matthew.printAge(matthew.age);
    for (int i = 0; i < bag.size(); i++) {
      System.out.println(matthew.bag.get(i));
    }
    ;
  }
}
