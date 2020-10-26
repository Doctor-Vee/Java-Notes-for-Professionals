import assistance_classes.MyUnmodifiableListClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections2 {
    public static void main(String[] args) {
        System.out.println("===================== Collections 2 ======================");

        List<String> data = Arrays.asList("food", "feed", "fed", "food", "foodie", "feed");
        System.out.println(data);
        System.out.println("----------");
        List<String> dataList = new ArrayList<>(data); // adds data as is
        Set<String> dataSet = new HashSet<>(data); // adds data keeping only unique values
        SortedSet<String> sortedDataSet = new TreeSet<>(data); // adds data keeping unique values and sorting
        Set<String> originalOrderDataSet = new LinkedHashSet<>(data); // adds data keeping only unique values and preserving the original order
        System.out.println(dataList);
        System.out.println(dataSet);
        System.out.println(sortedDataSet);
        System.out.println(originalOrderDataSet);

        System.out.println("-------------- Adding elements to an Array list ---------------");
        // you can use add for a single element
        // you can use addAll for a list of elements


        System.out.println("---------------------- Iterating over Lists ----------------------");
        data.forEach(System.out::println);
        for (String datum : data) {
            System.out.print(datum + " = ");
        }

        System.out.println();

        System.out.println("---------------------- Iterating over maps ---------------------");
        Map<Integer, String> numberyWords = new HashMap<>();
        numberyWords.put(1, "One");
        numberyWords.put(2, "Two");
        numberyWords.put(3, "Three");

        // forEach
        numberyWords.forEach((key, value) -> System.out.println("Key: " + key + " === Value: " + value));

        // for Loop
        for (Map.Entry<Integer, String> entry : numberyWords.entrySet()) {
            System.out.println("Key and value are " + entry.getKey() + " and " + entry.getValue() + " respectively");
        }

        // Iterating over only keys
        for (Integer key : numberyWords.keySet()) {
            System.out.print(key + " = ");
        }
        System.out.println();
        // Iterating over only values
        for (String value : numberyWords.values()) {
            System.out.print(value + " = ");
        }
        System.out.println();
        System.out.println("---------------- Immutable Empty Collections -----------------");
        List<String> anEmptyList = Collections.emptyList();
        Map<Integer, Date> anEmptyMap = Collections.emptyMap();
        Set<Number> anEmptySet = Collections.emptySet();
        System.out.println(anEmptyList);
        System.out.println(anEmptyMap);
//        anEmptySet.add(3); // throws UnsupportedOperationException if you try to add to any of these above empty collections. They're immutable.

        System.out.println("------------------------ Sub Collections ------------------------ ");
        System.out.println("------------ subList");
        List<String> animals = new ArrayList<>();
        animals.add("Fishes");
        animals.add("Lizards");
        animals.add("Sheep");
        animals.add("Rabbit");
        animals.add("Foxes");
        animals.add("Wolves");
        animals.add("Cows");
        animals.add("Insects");
        System.out.println(animals);
        List<String> mammals = animals.subList(2, 7);
        System.out.println(mammals);
        //Any changes made to mammals list will also cause the same changes in the animals list
        mammals.set(1, "Goats");
        System.out.println(mammals);
        System.out.println(animals);
        mammals.add("Lions");
        System.out.println(mammals);
        System.out.println(animals);

        // In the same way, you can use subSet() for sets

        System.out.println("------------ subMap");
// You must use a TreeMap otherwise it will not show the subMap option
        TreeMap map = new TreeMap();
        map.put(11, "Boy");
        map.put(2, "Man");
        map.put(3, "Woman");
        map.put(4, "Girl");
        System.out.println(map);
        Map subMap = map.subMap(3, 8);
        System.out.println(subMap);

        System.out.println("------------------- Unmodifiable Collection --------------------");
        MyUnmodifiableListClass listClass = new MyUnmodifiableListClass();
        listClass.addValueToIntList(34);
        listClass.addValueToIntList(54);
        System.out.println(listClass.getIntList());
        List<Integer> integerList = listClass.getIntList();
        System.out.println(integerList);
//        integerList.add(53); // This throws UnsupportedOperationException because the class returned an Unmodifiable List
//        System.out.println(integerList);

        System.out.println("------------------------- Joining Lists --------------------------");
        System.out.println(animals);
        System.out.println(data);
        // Using addAll
        List<String> combinedList = new ArrayList<>(animals);
        combinedList.addAll(data);
        System.out.println(combinedList);
        // Using Streams
        List<String> combinedList2 = Stream.concat(animals.stream(), data.stream()).collect(Collectors.toList());
        System.out.println(combinedList2);

    }
}
