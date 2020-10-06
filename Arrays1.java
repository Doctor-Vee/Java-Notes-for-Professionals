import assistance_classes.Employee;
import assistance_classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Arrays1 {
    public static void main(String[] args) {
        System.out.println("================= Arrays 1 ==================");
        // When an array is being created, its length needs to be specified
        // Arrays can store any data of any type

        // Creating and initialising arrays
        System.out.println("--------- Creating and initialising arrays ----------");
        int [] arrant = new int[3];
        System.out.println(Arrays.toString(arrant));
        int[] numbers2 = { 1, 2, 3 }; // Array literal of 3 int values
        System.out.println(Arrays.toString(numbers2));
        int[] numbers3 = new int[] { 1, 2, 3 }; // Array of 3 int values initialized
        System.out.println(Arrays.toString(numbers3));
        int[][] numbers4 = { { 1, 2 }, { 3, 4, 5 } }; // Jagged array literal
        System.out.println(Arrays.toString(numbers4));
        int[][] numbers5 = new int[5][]; // Jagged array, one dimension 5 long
        System.out.println(Arrays.toString(numbers5));
        int[][] numbers6 = new int[5][4]; // Multidimensional array: 5x4
        System.out.println(Arrays.toString(numbers6));

        float [] boats = new float [5];
        System.out.println(Arrays.toString(boats));
        Object[] brisk = {"Man", 3, new Object()}; // Accepting objects
        System.out.println(Arrays.toString(brisk));
        Person [] people = new Person[] {new Person(23, "Mike"), new Person(25, "Peter")};
        System.out.println(Arrays.toString(people));

        // Arrays, Collections and Streams
        System.out.println("--------------- Arrays, Collections and Streams ---------------");
        Integer[] initial = { 234, 342, 127, Integer.valueOf(23)}; // Autoboxing happening for int 127 here
        // Converting an array to a list
        List<Integer> initialList = Arrays.asList(initial); // fixed size
        System.out.println(initialList);
//        initialList.add(234); // Doesn't work ... find out why
//        System.out.println(initialList);

        // Converting a list back to an array
        Integer [] convertedFromList = initialList.toArray(new Integer[0]); // if you put a size value that is bigger than the list's size, it still adds all the members of the list nonetheless but if you put a value greater than the list's size, then it fills the array with the members of the list and adds null values to all the remaining spaces
//        Integer [] convertedFromList = initialList.toArray(Integer[]::new); // Alternative method I found to do the above
        System.out.println(Arrays.toString(convertedFromList));

        List<Integer> manifested = new ArrayList<>();
        System.out.println(manifested.size());
        manifested.addAll(initialList);
        manifested.add(34);
        System.out.println(manifested);

        // Converting an array to a stream
        System.out.println(Arrays.toString(initial));
        Stream<Integer> initialStream = Arrays.stream(initial);
        //Converting a stream back to an array
        Integer[] convertedFromStream = initialStream.toArray(Integer[]::new); // You can't use 'new Integer[0]' to replace what is in the bracket unlike what we did when we converting list back to array

        // Array of a Class or Interface
        System.out.println("------------ Array of a class or interface ---------------");
        Person [] employed = new Employee[2]; // Observe that the Employee which is a subclass of person is introduced
        System.out.println(Arrays.toString(employed));
        employed[1] = new Employee(32, "Wale", "Male");
        System.out.println(Arrays.toString(employed));

        // Creating and Initialising multi-dimensional arrays
        System.out.println("------------- Creating and initialising multi-dimensional arrays ----------------");
        int [][] a = new int[2][3];
        int [][] arr = {{2, 3}, {8, -2, 5, 6}, null};
        System.out.println(Arrays.toString(a));
        System.out.println(arr[1][2]);
//        System.out.println(arr[2][3]); // Gives a null pointer exception because element 2 of the main array is null
//        System.out.println(arr[0][3]); // Gives an ArrayIndexOutOfBoundsException because element 0 of the main array has only 2 members and this code asks for its 4th member

        // Creating and Initialising reference type arrays
        System.out.println("------------- Creating and initialising reference type arrays --------------");
        String [] stringArray = new String[5];
        System.out.println(Arrays.toString(stringArray));
        Object[] arrayObj = {"Man", new Person(23, "Mike")};
        System.out.println(Arrays.toString(arrayObj));

        // Filling an array after initialisation
        System.out.println("------------- Filling an array after initialisation ----------------");
        System.out.println(Arrays.toString(stringArray));
        stringArray[2] = "Maintain";
        System.out.println(Arrays.toString(stringArray));
        Arrays.fill(stringArray, "validValue"); // replaces all the elements of the array with the given value as long as the value is of the array type
        System.out.println(Arrays.toString(stringArray));
        Arrays.fill(stringArray, 2,4, "Replaced");
        System.out.println(Arrays.toString(stringArray));
        Arrays.setAll(stringArray, i -> "Man"+(i+1));
        System.out.println(Arrays.toString(stringArray));


    }
}
