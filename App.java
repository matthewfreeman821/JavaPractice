import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> matthewBag = new ArrayList<>();
    List<String> maddieBag = new ArrayList<>();
    List<String> aliBag = new ArrayList<>();
    Person matthew = new Person("Matthew", "Freeman", 34, matthewBag, "7 June 1990");
    Person maddie = new Person("Maddie", "Freeman", 8, maddieBag, "20 March 2013");
    Person ali = new Person("Ali", "Freeman", 4, aliBag, "4 Dec 2016");
    System.out.println(maddie.fName);
    System.out.println(matthew.fName);
    System.out.println(matthew.lName);
    matthew.printFullName(matthew.fName, matthew.lName);

    // Add item to maddie's bag
    maddie.addItemsToBag("water", maddieBag);

    // Add item to matthew's bag
    matthew.addItemsToBag("tent", matthewBag);

    // Print bags to see if items saved correctly
    // Not saved correctly, need to update bag call
    maddie.printBagItems(maddieBag);
    matthew.printBagItems(matthewBag);
  }
}
