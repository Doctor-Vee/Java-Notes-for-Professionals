import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        System.out.println("===================== Arrays 4 =====================");
        System.out.println("--------------- Multidimensional and Jagged Arrays ----------------");
        int[][] table = new int[3][2]; // All values initialised to zero
        System.out.println(table[2][1]); // 0
//        System.out.println(table[3][2]); // Index Out of Bounds Exception
        int[][] table2 = {
                null,
                {},
                {1},
                {1, 2}
        };
//        System.out.println(table2[0][2]); // Null pointer exception
//        System.out.println(table2[1][0]); // Index Out of Bounds Exception
        System.out.println(table2[3][1]); // 2

        System.out.println("---------------------- Iterating over arrays -----------------------");
        int[] array = new int[10];

        // Allows for read and write
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        // Allows read only
        for (int e : array) {
            System.out.print(e);
            e = 5; // Naturally, one may think that this will change the value of the array but see what is printed after the loop
        }
        System.out.println("\nAfter the iteration");
        System.out.println(Arrays.toString(array)); // Notice that the values of the array didn't change

        System.out.println("--------- Multi-dimensional arrays iteration");
        String[][] people = {
                {"Jones", "James", "John"},
                {"Jean", "Jane", "Janet", "Jennifer"}
        };
        for (int indexOuter = 0; indexOuter < people.length; indexOuter++) {
            for (int indexInner = 0; indexInner < people[indexOuter].length; indexInner++) {
                System.out.print(people[indexOuter][indexInner] + " - ");
            }
            System.out.println();
        }
        for (String[] set : people) {
            for (String person : set) {
                System.out.print(person + " - ");
            }
            System.out.println();
        }

        System.out.println("------------------- Arrays to a String ----------------------");
        int[][][] numbers = {
                {{1, 2}, {3}},
                {{}},
                {},
                null
        };

        // Arrays.toString
        System.out.println(Arrays.toString(numbers[0][0]));
        System.out.println(Arrays.toString(numbers[2]));
        // Arrays.deepToString
        System.out.println(Arrays.deepToString(numbers[0]));
        System.out.println(Arrays.deepToString(numbers));
    }

}

