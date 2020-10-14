import assistance_classes.Employee;
import assistance_classes.Person;

import java.util.*;
import java.util.stream.Stream;

public class Arrays2 {
    public static void main(String[] args) {
        System.out.println("================= Arrays 2 ==================");
        // Creating a list from an array
        // Creating an array from a collection

        // Creating a list from an array
        System.out.println("--------- Creating a list from an array ----------");
        int [] army = new int [] {2,-34,211,45};
        Integer [] army2 = new Integer[] {12,4,209,36};
        System.out.println(Arrays.toString(army2));
        //Using Arrays.asList()
//        List<int> armyList = Arrays.asList(army); // Won't work .... I think a list can't take a primitive data type... not sure though
        List<Integer> armyList = Arrays.asList(army2); //You can't add to the newly created list
        System.out.println(armyList.toString());
        army2[2] = 65; // This changes the value of the list also and vice versa
        System.out.println(armyList);

        // Using Collections.addAll()
        String [] fruits = {"orange", "mango", "grape"};
        System.out.println(Arrays.toString(fruits));
        ArrayList<String> fruitLIst = new ArrayList<>();
        Collections.addAll(fruitLIst, fruits);
        System.out.println(fruitLIst);
        fruits[2] = "lemon"; // This doesn't affect the value of this same element in the created list
        System.out.println(fruitLIst);
        System.out.println(Arrays.toString(fruits));
        fruitLIst.add("peach"); // you can add to the created list
        System.out.println(fruitLIst);

        // Using ArrayList with Arrays.asList
        List<String> fruitArrayList = new ArrayList<>(Arrays.asList(fruits));
        System.out.println(fruitArrayList);
        fruitArrayList.add("banana");
        System.out.println(fruitArrayList);

        // Creating an array from a collection
        System.out.println("--------------- Creating an array from a collection ------------------");
        Set<String> colourSet = new HashSet<>();
        colourSet.add("red");
        colourSet.add("blue");
        System.out.println(colourSet);
        String[] stringArray = colourSet.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));

    }
}
