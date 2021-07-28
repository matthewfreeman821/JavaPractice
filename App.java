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
    maddie.printFullName(maddie.fName, maddie.lName);
    maddie.updateFName("Madallyn");
    maddie.printFullName(maddie.fName, maddie.lName);
    maddie.printNickname(maddie.nickname);
    System.out.println(maddie.getNickname());
    maddie.printAge(maddie.age);
    maddie.printDob(maddie.dob);
    maddie.addItemsToBag("water", maddieBag);
    maddie.addItemsToBag("potatoes", maddieBag);
    maddie.printBagItems(maddieBag);

    ali.printFullName(ali.fName, ali.lName);
    ali.updateFName("Alisa");
    ali.printFullName(ali.fName, ali.lName);
    ali.printNickname(ali.nickname);
    System.out.println(ali.getNickname());
    ali.printAge(ali.age);
    ali.printDob(ali.dob);
    ali.addItemsToBag("chips", aliBag);
    ali.addItemsToBag("hotdogs", aliBag);
    ali.printBagItems(aliBag);

    matthew.printFullName(matthew.fName, matthew.lName);
    matthew.updateFName("Gordon");
    matthew.printFullName(matthew.fName, matthew.lName);
    matthew.printNickname(matthew.nickname);
    System.out.println(matthew.getNickname());
    matthew.printAge(matthew.age);
    matthew.printDob(matthew.dob);
    matthew.addItemsToBag("tent", matthewBag);
    matthew.addItemsToBag("small grill", matthewBag);
    matthew.printBagItems(matthewBag);

    matthew.bag.forEach(System.out::println());
  }
}
