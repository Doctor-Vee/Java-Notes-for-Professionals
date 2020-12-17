import assistance_classes.Child;
import assistance_classes.ConstructorLess;
import assistance_classes.Person;

public class Constructors {
    public static void main(String[] args) {
        System.out.println("=================== Constructors =====================");
        ConstructorLess constructorLess = new ConstructorLess(); // we didn't specify a constructor in this class but the compiler generates a default constructor for us.
        System.out.println(constructorLess.getName());
        constructorLess.setName("Manchester");
        constructorLess.setNumber(3);
        System.out.println(constructorLess.getName());
        System.out.println(constructorLess.getNumber());
        Child child = new Child("Michael", 234, "Male");
        System.out.println(child.getName());
        System.out.println(child.getAge());

        Person victoria = new Person(23, "Victoria");
        String story = "She said: " + victoria;
        System.out.println(story);
    }
}
