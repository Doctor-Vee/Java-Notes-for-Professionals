import assistance_classes.Employee;
import assistance_classes.UserForList;

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
        System.out.println(disciples.first()); // .first() and .last() are not present in the general Set interface...

        //Since TreeMaps and TreeSets maintain keys/elements according to their natural ordering. Therefor TreeMap keys
        //and TreeSet elements have to comparable to one another.
        /*
        // This doesn't work because the employee  class does not implement Comparable
        Employee chika = new Employee(25, "Chika", "Male" );
        Employee gbolahan = new Employee(27, "Gbolahan", "Male");
        Employee deborah = new Employee(24, "Deborah", "Female");
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(chika); // It throws an exception at this point saying Employee cannot be cast to class java.lang.Comparable
        employees.add(gbolahan);
        employees.add(deborah);
        System.out.println(employees);
        */

        UserForList paul = new UserForList(343L, "Paul");
        UserForList emma = new UserForList(23L, "Emma");
        UserForList comfort = new UserForList(143L, "Comfort");
        TreeSet<UserForList> choristers = new TreeSet<>();
        choristers.add(paul);
        choristers.add(emma);
        choristers.add(comfort);
        choristers.add(emma);
        System.out.println(choristers);
    }
}
