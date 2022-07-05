package qualified_io_algorithms;

public class SayHello {

    public static void main(String[] args) {

        System.out.println(sayHello("Qualified"));
        System.out.println(sayHello(""));
    }

    public static String sayHello(String name) {
        // You can print to STDOUT for debugging if you need to:
        System.out.print(name);

        // but you need to return the correct value in order to pass the challenge
        return name.isEmpty() ? "Hello there!" : String.format("Hello, %s!", name); // TODO: return the correct value
    }

}
