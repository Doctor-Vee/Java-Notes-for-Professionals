import assistance_classes.Employee;
import assistance_classes.Person;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        System.out.println("======================== Maps =========================");
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(3, "three");
        numbers.put(2, "two");
        numbers.put(5, "five");
        numbers.put(4, "four");
        // if a key already exists, put just replaces the existing value with the value indicated in the put method
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

        System.out.println("---------------- Using Default Methods of Map ---------------");
        System.out.println("------------ getOrDefault");
        // returns the value mapped to the key if present and returns the selected default value if the key is not present
        System.out.println(numbers.get(5));
        System.out.println(numbers.get(7));
        System.out.println(numbers.getOrDefault(5, "FIVE"));
        System.out.println(numbers.getOrDefault(7, "SEVEN"));
        // getOrDefault does not add new entries to the map neither does it replace any of the existing entries
        System.out.println(numbers);

        System.out.println("------------- replaceAll");
        System.out.println(numbers);
        numbers.replaceAll((key, value) -> value + "(" + key + ")");
        System.out.println(numbers);

        System.out.println("------------- putIfAbsent");
        System.out.println(numbers);
        numbers.putIfAbsent(5, "FIVE");
        numbers.putIfAbsent(7, "SEVEN");
        System.out.println(numbers);

        System.out.println("------------- replace");
        System.out.println(numbers);
        numbers.replace(7, "seven(7)");
        System.out.println(numbers);

        System.out.println("---------- computeIfAbsent");
        numbers.computeIfAbsent(6, k->numbers.get(3) + k);
        numbers.computeIfAbsent(7, k->numbers.get(4) + "wrongish");
        numbers.computeIfAbsent(8, k->numbers.get(5) + "wrongish");
        System.out.println(numbers);

        // computeIfPresent is similar to computeIfAbsent except that in this case, the result of the mapping function is applied to the stated key iff that key is present

        System.out.println("------------ compute");
        // this replaces the value of a key by the newly computed value or adds that entry if the key doesn't exist
        System.out.println(numbers);
        System.out.println(numbers.get(9));
        numbers.compute(9, (k,v) -> "nine(" + k + ")");
        numbers.compute(6, (k, v) -> "six(" + k + ")");
        numbers.compute(8, (k, v) -> "eight(" + k + ")");
        System.out.println(numbers);

        System.out.println("------------ merge");
        System.out.println(numbers);
        // adds the key value pair to the map if the key is not present or if the value for the key is null as shown below
        numbers.merge(10, "ten", (k,v)->k);
        // replaces the value for the key with the newly computed value as long as the key is present and the newly computed value is not null
        numbers.merge(3, "THREE(irrelevant though)", (k,v) -> numbers.get(6));
        System.out.println(numbers);
        // removes the entry that has this key because the computed value is null
        numbers.merge(3, "irrelevant", (k,v) -> null);
        System.out.println(numbers);

        System.out.println("-------------- remove");
        numbers.remove(1);
        numbers.remove(5);
        numbers.remove(7);
        numbers.remove(9);
        System.out.println(numbers);

        System.out.println("------------ replace");
        numbers.replace(2, "two");
        numbers.replace(4, "four");
        numbers.replace(6, "six");
        numbers.replace(8, "eight");
        System.out.println(numbers);

        System.out.println("------ Composing two mappings into a new single map -----");
        Map<String, Double> twosPowers = new HashMap<>();
        twosPowers.put("eight", 8.0);
        twosPowers.put("two", 2.0);
        twosPowers.put("four", 4.0);
        twosPowers.put("sixteen", 16.0);
        System.out.println();
        System.out.println(twosPowers);
        Map<Integer, Double> integerDoubleNumbers = new HashMap<>();
        numbers.forEach((key, value) -> integerDoubleNumbers.put(key, twosPowers.get(value)));
        System.out.println(integerDoubleNumbers);

        System.out.println("------------------- Adding multiple values ---------------------");
        System.out.println(integerDoubleNumbers);
        Map<Integer, Double> additionalIntegerDoubles = new HashMap<>();
        additionalIntegerDoubles.put(1, 1.0);
        additionalIntegerDoubles.put(3, 3.0);
        additionalIntegerDoubles.put(5, 5.0);
        additionalIntegerDoubles.put(6, 6.0);
        additionalIntegerDoubles.put(7, 7.0);
        additionalIntegerDoubles.put(9, 9.0);
        additionalIntegerDoubles.put(10, 10.0);
        System.out.println(additionalIntegerDoubles);
        integerDoubleNumbers.putAll(additionalIntegerDoubles);
        System.out.println(integerDoubleNumbers);

        System.out.println("----------------- Check if key or value exists -----------------");
        System.out.println(integerDoubleNumbers.containsKey(4));
        System.out.println(twosPowers.containsValue("sixteen"));
        System.out.println(twosPowers.containsValue(16.0));
        System.out.println(numbers.containsValue("hello"));

        System.out.println("--------------- Removing all elements of a map --------------");
        System.out.println(integerDoubleNumbers);
        integerDoubleNumbers.clear();
        System.out.println(integerDoubleNumbers);

        System.out.println("---------------- Using custom objects as key -----------------");
        Person peter = new Employee(34, "Peter");
        Person paul = new Employee(32, "Paul");
        Person matthew = new Employee(25, "Matthew");
        Map<Person, String> occupations = new HashMap<>();
        occupations.put(peter, "Fisherman");
        occupations.put(paul, "Lawyer");
        occupations.put(matthew, "Tax Collector");
        System.out.println(occupations);


    }
}
