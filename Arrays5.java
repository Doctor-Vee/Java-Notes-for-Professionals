import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Arrays5 {
    public static void main(String[] args) {
        System.out.println("===================== Arrays 5 ======================");
        System.out.println("------------- Removing an element from an array -------------");
        // You can't just remove elements from an array just like that ...
        // you either have to copy the original array to another one
        // or you convert the array to another structure allowing the removal

        //Using ArrayList
        String [] colourArray = new String[]{"blue", "red", "yellow", "orange", "black"};
        System.out.println(Arrays.toString(colourArray));
        List<String> colourList = new ArrayList<>(Arrays.asList(colourArray));
        colourList.remove("orange");
        System.out.println(colourList);
        colourArray = colourList.toArray(new String[colourList.size()]);
        System.out.println(Arrays.toString(colourArray));

        // Other methods you can use are:
        // - System.arraycopy() - this can be used to make a copy of the original array and remove the element you want.
        // - Using Apache Commons Lang library - here, you can use the static method removeElement() of the class ArrayUtils.

        System.out.println("---------------- Comparing arrays for equality ----------------");
        String[] colourArray2 = {"blue", "red", "yellow", "black"};
        System.out.println(colourArray.equals(colourArray2)); // this checks that it's the same exact array object
        System.out.println(Arrays.equals(colourArray, colourArray2)); // this checks for equality based on the values
        // For multidimensional arrays, use Arrays.deepEquals() instead

        System.out.println("------------------------ Copying Arrays -------------------------");
        //You can use a for loop

        //Using Object.clone
        String[] colourArray3 = colourArray2.clone();
        System.out.println(Arrays.toString(colourArray3));
        System.out.println(colourArray2.equals(colourArray3)); // This shows that colourArray3 is not pointing to colourArray2 but is an entirely different array containing the same elements of colourArray2
        //Note that the Object.clone method for an array performs a shallow copy, i.e. it returns a reference to a new array
        //which references the same elements as the source array.

        int[] numberArray = {1,11,3,42,5};
        int [] numberArray2 = Arrays.copyOf(numberArray, numberArray.length);
        System.out.println(Arrays.toString(numberArray2));

        // You could use System.arraycopy()

        // Using Arrays.copyOfRange() - Mainly used to copy a part of an array but you can use it to copy a whole array
        int [] numberArray3 = Arrays.copyOfRange(numberArray, 0, 3); // copies part of the array
        System.out.println(Arrays.toString(numberArray3));
        int [] numberArray4 = Arrays.copyOfRange(numberArray, 0, numberArray.length); // copies the entire array
        System.out.println(Arrays.toString(numberArray4));


        System.out.println("------------------------ Casting Arrays --------------------------");
        double [] numberDouble = new double[numberArray.length];
        numberDouble = castArray(numberDouble, numberArray);
        System.out.println(Arrays.toString(numberDouble));

        Double [] integers = {2.0, 3.0, 5.0};
        Number [] numbers = Arrays.copyOf(integers, integers.length, Number[].class);
        System.out.println(Arrays.toString(numbers));
    }

    public static double[] castArray(double[] target, int[] array){
        for (int i = 0; i< array.length; i++){
            target[i] = array[i];
        }
        return target;
    }
}