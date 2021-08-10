import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Arrays4Replacement {
    public static void main(String[] args) {
        System.out.println("===================== Arrays 4 ======================");
        int [] numbers = new int[]{3, 4, 2, 23, 133, 1, -3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------- Sorting String arrays -----------------------");
        String [] names = {"James", "John", "Emeka", "Jane", "Jean", "Peter", "Matthew"};
        // String uses lexicographic order i.e. alphabetic order for sorting
        // Increasing order
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        // In reverse order
        Arrays.sort(names, 0, names.length, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));

        System.out.println("---------------- Finding an element in an array ---------------- ");

        System.out.println("------------- Using Arrays.binary search");
        String[] cars = {"Toyota", "Ford", "Peugeot", "Ferrari", "Nissan"};
        int [] primeNumbers = {2,3,5,7,11};
        //Arrays.binary search only works with sorted arrays
        int numberIndex1 = Arrays.binarySearch(primeNumbers, 7);
        System.out.println("Number index: " + numberIndex1);
        int carIndex1 = Arrays.binarySearch(cars, "Ford");
        System.out.println("Car index before sorting: " + carIndex1);
        Arrays.sort(cars);
        System.out.println("New car arrangement: " + Arrays.toString(cars));
        int carIndex2 = Arrays.binarySearch(cars, "Ford");
        System.out.println("Car index after sorting: " + carIndex2);

        System.out.println("------------ Using Arrays.asList");
        // Arrays.asList only works for non-primitive arrays only
        String [] colours = {"Blue", "Green", "Red", "Purple", "Gold"};
        int colourIndex1 = Arrays.asList(colours).indexOf("Pink");
        int colourIndex2 = Arrays.asList(colours).indexOf("Purple");
        System.out.println("Colour index 1: " + colourIndex1);
        System.out.println("Colour index 2: " + colourIndex2);
        int numberIndex2 = Arrays.asList(primeNumbers).indexOf(3); // Gives unexpected result
        System.out.println("Number index 2: " + numberIndex2);

        System.out.println("--------------- Using a stream");
        int colourIndex3 = IntStream.range(0, colours.length).filter(i -> "Gold".equals(colours[i])).findFirst().orElse(-1);
        System.out.println("Colour index 3: " + colourIndex3);
        int colourIndex4 = IntStream.range(0, colours.length).filter(i -> "green".equalsIgnoreCase(colours[i])).findFirst().orElse(-1);
        System.out.println("Colour index 4: " + colourIndex4);
        // The above also works for primitives

        System.out.println("---------------- Using a loop");
        int numberIndex3 = -1;
        for (int i = 0; i < primeNumbers.length; i++){
            if(3==primeNumbers[i]){
                numberIndex3 = i;
                break;
            }
        }
        System.out.println("Number index 3: " + numberIndex3);
        int colourIndex5 = -1;
        for (int i = 0; i < colours.length; i++){
            if("Blue".equals(colours[i])){
                colourIndex5 = i;
                break;
            }
        }
        System.out.println("Colour index 5: " + colourIndex5);

        System.out.println("----------- Testing if an array contains an element -----------");
        boolean blueIsPresent = Arrays.asList(colours).contains("Blue");
        boolean yellowIsPresent = Arrays.asList(colours).contains("Yellow");
        System.out.println("Blue is present: " + blueIsPresent);
        System.out.println("Yellow is present: " + yellowIsPresent);

        System.out.println("------------ Resizing arrays by copying into new --------------");
        String [] boys = {"Peter", "James", "John"};
        System.out.println(Arrays.toString(boys));
        String [] men = Arrays.copyOf(boys, boys.length + 1);
        System.out.println(Arrays.toString(men));
        men[boys.length] = "Thomas";
        System.out.println(Arrays.toString(men));

        System.out.println(" ------- Converting arrays between primitives & boxed -------");
        // Converting from int to Integer
        int [] primitiveArray = {1, 2, 3, 5, 21, 53, 23};
        System.out.println(Arrays.toString(primitiveArray));
        Integer [] boxedArray = Arrays.stream(primitiveArray).boxed().toArray(Integer[]:: new);
        System.out.println(Arrays.toString(boxedArray));
        // Converting from Double to double
        Double [] boxedArray2 = {33.2, 2.34, 5.32, 53.5, 6.52, 23.4, 0.243};
        System.out.println(Arrays.toString(boxedArray2));
        double [] primitiveArray2 = Arrays.stream(boxedArray2).mapToDouble(Double::doubleValue).toArray();
        System.out.println(Arrays.toString(primitiveArray2));
        // Another way of doing this conversion is through the use of a for loop in which each element is autoboxed one after the other
        long [] primitiveArray3 = {234L, 342L, 23424, 23424};
        Long [] boxedArray3 = new Long[primitiveArray3.length];
        for (int i = 0; i < boxedArray3.length; i++){
            boxedArray3[i] = primitiveArray3[i]; // Autoboxing happens here for each element;
        }
        System.out.println(Arrays.toString(primitiveArray3));
        System.out.println(Arrays.toString(boxedArray3));




    }
}
