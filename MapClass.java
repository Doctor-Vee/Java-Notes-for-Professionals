import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        System.out.println("======================== Maps =========================");
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        System.out.println(numbers);

        System.out.println("--------------- Iterating through map entries ----------------");
        System.out.println("------ Using while loop with Iterator and Map.Entry");
        Iterator<Map.Entry<Integer, String>> iterator = numbers.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " ___ " + entry.getValue());
        }

        System.out.println("----- Using for loop with Iterator and Map.Entry");
        for (Iterator<Map.Entry<Integer, String>> entryIterator = numbers.entrySet().iterator();
             entryIterator.hasNext(); ) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }

        System.out.println("--------------------- Using forEach");
        numbers.forEach((k, v) -> System.out.println(k + " +++ " + v));

        System.out.println("---------------------- Using keySet");
        for(Integer key: numbers.keySet()){
            System.out.println(key + " ^^^ " + numbers.get(key));
        }

        System.out.println("------------ Using Stream.forEach");
        numbers.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " *** " + entry.getValue()));


    }
}
