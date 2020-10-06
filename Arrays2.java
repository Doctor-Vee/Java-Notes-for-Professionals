import assistance_classes.Employee;
import assistance_classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Arrays2 {
    public static void main(String[] args) {
        System.out.println("================= Arrays 2 ==================");
        // When an array is being created, its length needs to be specified
        // Arrays can store any data of any type

        // Creating and initialising arrays
        System.out.println("--------- Creating a list from an array ----------");
        int [] army = new int [] {2,-34,211,45};
        Integer [] army2 = new Integer[] {12,4,209,36};
        System.out.println(Arrays.toString(army2));
        //Using Arrays.asList()
//        List<int> armyList = Arrays.asList(army); // Won't work .... I think a list can't take a primitive data type... not sure though
        List<Integer> armyList = Arrays.asList(army2);
        System.out.println(armyList.toString());
        army2[2] = 65; // This changes the value of the list also and vice versa
        System.out.println(armyList);

        // Using Collections.addAll()
        String [] fruits = {"orange", "mango", "grape"};
        System.out.println(Arrays.toString(fruits));
        ArrayList<String> fruitLIst = new ArrayList<>();
        Collections.addAll(fruitLIst, fruits);
        System.out.println(fruitLIst);
    }
}
