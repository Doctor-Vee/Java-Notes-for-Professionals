import assistance_classes.UserForList;

import javax.management.AttributeList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ListClass {
    public static void main(String[] args) {
        System.out.println("======================= Lists =======================");

        System.out.println("------------------------ Sorting a List --------------------------");
        List<UserForList> users = new ArrayList<>();
        users.add(new UserForList(4342L, "Peter"));
        users.add(new UserForList(23424L, "Paul"));
        users.add(new UserForList(252L, "Matthew"));
        users.add(new UserForList(656L, "Bartholomew"));
        users.add(new UserForList(34234L, "Deborah"));
        System.out.println(users);
        System.out.println("-------------- Sorting using Collections");
        Collections.sort(users); // here this sorts by id because if you check the UserForList class, you'd see that it implements Comparable and you'd see that I implemented the compareTo to use the id for comparisons. I could also use username for comparisons if I wanted to and in that case, the sort function would sort by username instead
        System.out.println(users);
        // Assuming that you didn't implement Comparable when creating the UserForList class or you wished to compare using something else, you could use the sort method with the Comparator argument as shown below.
//        Collections.sort(users, new Comparator<UserForList>() {
//            @Override
//            public int compare(UserForList o1, UserForList o2) {
//                return o1.username.compareTo(o2.username);
//            }
//        });
        // This could be rewritten as
//        Collections.sort(users, (o1, o2) -> o1.username.compareTo(o2.username));
        // Which could further be rewritten as
        Collections.sort(users, Comparator.comparing(o -> o.username));
        System.out.println(users);

        System.out.println("-------------- Sorting using the List interface");
//        users.sort((object1, object2) -> object1.id.compareTo(object2.id));
        // which could be rewritten as
        users.sort(Comparator.comparing(object -> object.username.length())); // here I then decided to sort by the length of their names
        System.out.println(users);

        System.out.println("-------- Convert a List of integers to a list of strings --------");
        List<Integer> numbers = Arrays.asList(2, 43, 5, 51);
        List<String> strings = numbers.stream().map(Objects::toString).collect(Collectors.toList());
        System.out.println(strings);

        System.out.println("--------- Finding common elements between 2 lists ----------");
        List<String> multiplesOf2 = Arrays.asList("two", "four", "six", "eight", "ten", "twelve");
        List<String> multiplesOf4 = Arrays.asList("four", "eight", "twelve", "sixteen", "twenty");
        List<String> commonMultiples = new ArrayList<>();
        commonMultiples.addAll(multiplesOf2);
        commonMultiples.retainAll(multiplesOf4);
        System.out.println(commonMultiples);

        System.out.println("---------------------------- Reversing a list ----------------------------");
        System.out.println(multiplesOf2);
        Collections.reverse(multiplesOf2);
        System.out.println(multiplesOf2);

        System.out.println("------------------ Adding or removing elements -------------------");
        // you can add or remove elements from an arraylist and you can also do these at a particular index ...
        System.out.println(commonMultiples);
        commonMultiples.remove("twelve");
        System.out.println(commonMultiples);
        commonMultiples.add(1, "six");
        System.out.println(commonMultiples);
        List<String> evenNumbers = new ArrayList<>();
        evenNumbers.addAll(commonMultiples);
        evenNumbers.add(0, "two");
        Collections.addAll(evenNumbers,  "ten", "twelve", "fourteen");
        System.out.println(evenNumbers);
        evenNumbers.addAll(multiplesOf2);
        System.out.println(evenNumbers);
        System.out.println(multiplesOf4);
        evenNumbers.removeAll(multiplesOf4);
        System.out.println(evenNumbers);
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);

    }
}
