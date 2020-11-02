import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapClass {
    public static void main(String[] args) {
        System.out.println("=================== WeakHashMap ===================");
        Map hashMap = new HashMap();
        Map weakHashMap = new WeakHashMap();
        String keyHashMap = new String("keyHashMap");
        String keyWeakHashMap = new String("keyWeakHashMap");
        hashMap.put(keyHashMap, "Timaya");
        weakHashMap.put(keyWeakHashMap, "PSquare");
        System.out.println(hashMap);
        System.out.println(weakHashMap);
        System.out.println(hashMap.get(keyHashMap));
        System.out.println(weakHashMap.get(keyWeakHashMap));
        System.out.println("// Initiate garbage collector and see if anything happens");
        System.gc();
        System.out.println(hashMap);
        System.out.println(weakHashMap);
        System.out.println("// Clear the reference variables to the keys and initiate garbage collector again and see what happens");
        keyHashMap = null;
        keyWeakHashMap = null;
        System.gc();
        System.out.println(hashMap);
        System.out.println(weakHashMap);
        System.out.println(hashMap.get("keyHashMap"));
        System.out.println(weakHashMap.get("keyWeakHashMap"));

    }
}
