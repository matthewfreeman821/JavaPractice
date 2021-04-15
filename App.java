import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> bag = new ArrayList<>();
    Person matthew = new Person("Matthew", 34, bag, "7 June 1990");

    matthew.addItemsToBag("water", matthew.bag);
    matthew.addItemsToBag("shovel", matthew.bag);
    matthew.addItemsToBag("knife", matthew.bag);
    matthew.addItemsToBag("string", matthew.bag);

    // matthew.printDob(matthew.dob);
    // matthew.printAge(matthew.age);
    // matthew.updateAge(30);
    // matthew.printAge(matthew.age);

    // for (int i = 0; i < items.size(); i++) {
    // System.out.println(matthew.bag.add(items.get(i)));
    // System.out.println(matthew.name + "'s bag has " + matthew.bag.size() + "
    // items in it.");
    // }
    // matthew.bag.forEach(str -> System.out.println(str));
    // matthew.removeLastItem(bag);
    matthew.printBagItems(bag);
  }
}
