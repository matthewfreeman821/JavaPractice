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
    Snake bowey = new Snake("Bowey", maddie, 32);
    Snake princess = new Snake("Princess", ali);
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
    maddie.setWeight(54);
    maddie.getWeight();

    bowey.printOwner();
    bowey.printName();
    bowey.speak();
    bowey.walk();
    bowey.getName();
    bowey.setWeight(310);
    bowey.getWeight();

    princess.setWeight(400);

    ali.printFullName();
    ali.updateFName("Alisa");
    ali.printFullName();
    ali.printNickname();
    ali.printNickname();
    ali.printAge();
    ali.printDob();
    ali.addItemsToBag("chips", aliBag);
    ali.addItemsToBag("hotdogs", aliBag);
    ali.printBagItems();
    ali.speak();
    ali.setHeight(40);
    ali.getHeight();

    matthew.printFullName();
    matthew.updateFName("Gordon");
    matthew.printFullName();
    matthew.printNickname();
    matthew.printNickname();
    matthew.printAge();
    matthew.printDob();
    matthew.addItemsToBag("tent", matthewBag);
    matthew.addItemsToBag("small grill", matthewBag);
    matthew.printBagItems();
    matthew.speak();
    matthew.setHeight(67);
  }
}
