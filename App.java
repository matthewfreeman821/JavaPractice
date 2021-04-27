import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> bag = new ArrayList<>();
    Person matthew = new Person("Matthew", "Freeman", 34, bag, "7 June 1990");
    System.out.println(matthew.fName);
    System.out.println(matthew.lName);

    matthew.addItemsToBag("water", matthew.bag);
    matthew.addItemsToBag("shovel", matthew.bag);
    matthew.addItemsToBag("knife", matthew.bag);
    matthew.addItemsToBag("string", matthew.bag);


    if (matthew.bag.size() > 1) {
      System.out.println(matthew.fName + "'s bag has " + matthew.bag.size() + " items in it.");
      System.out.println("The items are: ");
      matthew.bag.forEach(str -> System.out.println(matthew.fName + "'s bag has " + str + " in it."));
    } else if (matthew.bag.size() == 1) {
      System.out.println(matthew.fName + "'s bag has " + matthew.bag.size() + " item in it.");
      matthew.bag.forEach(str -> System.out.println(matthew.fName + "'s bag has " + str + " in it."));
    } else {
      System.out.println(matthew.fName + "'s bag has no items in it.'");
    }
  }
}
