import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> matthewBag = new ArrayList<>();
    List<String> maddieBag = new ArrayList<>();
    List<String> aliBag = new ArrayList<>();
    Person matthew = new Person("Matthew", "Freeman", 34, matthewBag, "7 June 1990", "Matt");
    Person maddie = new Person("Maddie", "Freeman", 8, maddieBag, "20 March 2013", "Maddie");
    Person ali = new Person("Ali", "Freeman", 4, aliBag, "4 Dec 2016", "Ali");
    maddie.printFullName();
    maddie.updateFName("Madallyn");
    maddie.printFullName();
    maddie.printNickname();
    maddie.printNickname();
    maddie.printAge();
    maddie.printDob();
    maddie.addItemsToBag("water", maddieBag);
    maddie.addItemsToBag("potatoes", maddieBag);
    maddie.printBagItems();
    maddie.speak();

    ali.printFullName();
    ali.updateFName("Alisa");
    ali.printFullName();
    ali.printNickname();
    // System.out.println(ali.getNickname());
    ali.printNickname();
    ali.printAge();
    ali.printDob();
    ali.addItemsToBag("chips", aliBag);
    ali.addItemsToBag("hotdogs", aliBag);
    ali.printBagItems();
    ali.speak();

    matthew.printFullName();
    matthew.updateFName("Gordon");
    matthew.printFullName();
    matthew.printNickname();
    // System.out.println(matthew.getNickname());
    matthew.printNickname();
    matthew.printAge();
    matthew.printDob();
    matthew.addItemsToBag("tent", matthewBag);
    matthew.addItemsToBag("small grill", matthewBag);
    matthew.printBagItems();
    matthew.speak();
  }
}
