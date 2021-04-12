import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> bag = new ArrayList<>();
    List<String> items = new ArrayList<>();

    items.add("water");
    items.add("food");
    items.add("knife");
    items.add("matches");
    items.add("shovel");

    Person matthew = new Person("Matthew", 34, bag, "7 June 1990");

    matthew.printDob(matthew.dob);

    for (int i = 0; i < items.size(); i++) {
      System.out.println(matthew.bag.add(items.get(i)));
      System.out.println(matthew.name + "'s bag has " + matthew.bag.size() + " items in it.");
    }
    matthew.bag.forEach(str -> System.out.println(str));
    matthew.printBagItems(bag);
  }
}
