import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        System.out.println("================== LinkedHashMap ===================");
        // maintains insertion order
        LinkedHashMap<Integer, String> primeNumbers = new LinkedHashMap<>();
        primeNumbers.put(2, "two");
        primeNumbers.put(7, "seven");
        primeNumbers.put(5, "five");
        primeNumbers.put(3, "three");
        System.out.println(primeNumbers);
        System.out.println(primeNumbers);

        // This class still contains all the methods from the Map interface because it actually implements the Map interface.


    }
}
