import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {
    // Create and populate an ArrayList
    ArrayList food = new ArrayList();
    food.add("Chicken");
    food.add("Irish");
    food.add("Rice");
    food.add("Pizza");

    // How many food items do we have?
    int foodCount = food.size();

    // Print the content of the ArrayList
    for (int i=0; i<foodCount; i++){
        System.out.println("Food #" + i + " is "
            + food.get(i));
    }
  }
}