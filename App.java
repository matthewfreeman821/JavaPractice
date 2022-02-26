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
    Snake bowey = new Snake(ali);
    Snake princess = new Snake(maddie);

    matthew.setSnake(bowey);
    matthew.playWithSnake();
    System.out.println(bowey.getOwner().getName());
    System.out.println(princess.getOwner().getName());
    ali.setSnake(princess);
    System.out.println(princess.getOwner().getName());
  }
}
