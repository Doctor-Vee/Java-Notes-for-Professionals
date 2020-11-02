import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        System.out.println("===================== TreeSet ======================");
        TreeSet<String> disciples = new TreeSet();
        disciples.add("John");
        disciples.add("Matthew");
        disciples.add("Peter");
        disciples.add("James");
        disciples.add("John");
        System.out.println(disciples);
        System.out.println(disciples.first()); // .first() and .last() not present in the general Set interface...
    }
}
