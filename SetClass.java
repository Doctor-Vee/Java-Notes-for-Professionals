import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetClass {
    public static void main(String[] args) {
        System.out.println("====================== Sets ========================");
        List<String> evenNumbers = Arrays.asList("Two", "Four", "Six", "Eight", "Ten");
        Set<String> numbers = new HashSet<>(); // Does not sort data added to it and does not maintain the insertion order of items
//        Set<String> numbers = new TreeSet<>(); // Stores data in a sorted manner
//        Set<String> numbers = new LinkedHashSet<>(); // Maintains the insertion order of items
        numbers.add("One");
        numbers.addAll(evenNumbers);
        numbers.add("Four");
        numbers.add("ten");
        System.out.println(numbers);
        System.out.println("------Checking for and Removing elements from a set------");
        System.out.println(numbers.contains("One"));
        System.out.println(numbers.size());
        numbers.remove("ten"); // To remove the given object
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.clear(); // To remove all the objects from the collection
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());

        System.out.println("------------- Creating a list from an existing set ------------");
        Set<String> fruits = new HashSet<> ();
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Strawberry");
        System.out.println(fruits);
        // Using List.addAll method
        List<String> list1 = new ArrayList<>();
        list1.addAll(fruits);
        System.out.println(list1);
        // Using Stream API
        List<String> list2 = fruits.stream().collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("-------------- Eliminating Duplicates Using Set --------------");
        List<String> names = new ArrayList<>(Arrays.asList("John", "Mark", "Matthew", "Mark", "Luke", "John"));
        System.out.println(names);
        Set<String> noDuplicate = new HashSet<>(names); // If you want the names also alphabetically arranged, you can use TreeSet here
        System.out.println(noDuplicate);

        System.out.println("----------------- Declaring a set with values -----------------");
        Set<String> colours = new TreeSet<>(Arrays.asList("Blue", "Pink", "Black", "Brown", "Red", "Green", "Yellow"));
        System.out.println(colours);
        //Using Streams
        Set<String> girls = Stream.of("Jane", "Mary", "Grace", "Fisayo", "Ngozi").collect(Collectors.toSet());
        System.out.println(girls);


    }
}
