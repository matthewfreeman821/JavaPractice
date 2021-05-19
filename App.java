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
    maddie.printFullName(maddie.fName, maddie.lName);
    maddie.printAge(maddie.age);
    maddie.printDob(maddie.dob);
    ali.printFullName(ali.fName, ali.lName);
    ali.printAge(ali.age);
    matthew.printFullName(matthew.fName, matthew.lName);
    matthew.printAge(matthew.age);

    // Add item to maddie's bag
    maddie.addItemsToBag("water", maddieBag);

    // Add item to matthew's bag
    matthew.addItemsToBag("tent", matthewBag);

    // Add item to ali's bag
    ali.addItemsToBag("chips", aliBag);

    // Print bags to see if items saved correctly
    // Not saved correctly, need to update bag call
    maddie.printBagItems(maddieBag);
    matthew.printBagItems(matthewBag);
    ali.printBagItems(aliBag);
  }
}
