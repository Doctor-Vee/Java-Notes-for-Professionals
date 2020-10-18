import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Collections1 {
    public static void main(String[] args) {
        System.out.println("===================== Collections ======================");

        System.out.println("--------- Removing items from a List within a Loop ---------");
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Banana");

        System.out.println(fruits);

        /*
        // This throws an exception because we're iterating over the collection and modifying it at the same time
        for(String fruit: fruits){
            if(fruit.equals("Banana")){
            fruits.remove(fruit);
            }
        }
         */

        // Using Iterator
        Iterator<String> fruitIterator = fruits.iterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            if ("Banana".equals(fruit)) {
                fruitIterator.remove();
            }
        }
        System.out.println(fruits);

        System.out.println("--------------");

        // Using a for loop
        fruits.add("Apple");
        System.out.println(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Mango".equals(fruits.get(i))) {
                fruits.remove(i);
                i--; // if we don't do this, it will skip the one after Mango because after Mango is removed, the next one shifts to Mango's position but since i increases after every iteration, it skips the fruit that went to Mango's position
            }
        }
        System.out.println(fruits);

        System.out.println("---------------");
        // Using a should-be-removed list
        fruits.add("Peach");
        fruits.add("Pear");
        fruits.add("Cashew");
        fruits.add("Carrot");
        fruits.add("Pineapple");
        System.out.println(fruits);
        List<String> shouldBeRemoved = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).startsWith("P")) {
                shouldBeRemoved.add(fruits.get(i));
            }
        }
        System.out.println(shouldBeRemoved);
        fruits.removeAll(shouldBeRemoved);
        System.out.println(fruits);

        System.out.println("-----------------");
        // By filtering a stream
        System.out.println(fruits);
        List<String> filteredFruits = fruits.stream().filter(f -> !f.startsWith("C")).collect(Collectors.toList());
        // Here we have been able to filter out the fruits that start with C and have put the results into a new list without tampering with the original list.
        System.out.println(filteredFruits);
        System.out.println(fruits);

        System.out.println("-----------------");
        System.out.println(fruits);
        // Using removeIf
        fruits.removeIf(p -> p.startsWith("C"));
        System.out.println(fruits);

    }
}
