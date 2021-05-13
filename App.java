import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> bag = new ArrayList<>();
    Person matthew = new Person("Matthew", "Freeman", 34, bag, "7 June 1990");
    Person maddie = new Person("Maddie", "Freeman", 8, bag, "20 March 2013");
    System.out.println(maddie.fName);
    System.out.println(matthew.fName);
    System.out.println(matthew.lName);
    matthew.printFullName(matthew.fName, matthew.lName);

    // Add item to maddie's bag
    maddie.addItemsToBag("water", bag);

    // Add item to matthew's bag
    matthew.addItemsToBag("tent", bag);

    // Print bags to see if items saved correctly
    maddie.printBagItems(bag);
    matthew.printBagItems(bag);
  }
}
