import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Person matthew = new Person("Matthew", 34);
    matthew.printName(matthew.name);
    matthew.printAge(matthew.age);
    for (int i = 0; i < 7; i++) {
      System.out.println(matthew.name.codePointAt(i));
    }
    ;
  }
}
