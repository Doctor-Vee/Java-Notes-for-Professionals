import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        System.out.println("===================== TreeMap ======================");
        // This is a mutable ordered implementation of Map. It has some added functions
        TreeMap<String, Integer> colours = new TreeMap();
        colours.put("blue", 4);
        colours.put("yellow", 6);
        colours.put("black", 5);
        colours.put("indigo", 6);
        colours.put("red", 3);
        System.out.println(colours.firstEntry());
        System.out.println(colours);


    }
}
