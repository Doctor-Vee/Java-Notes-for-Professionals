import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        System.out.println("====================== Stack =======================");
        // Stacks are Last In First Out (LIFO)
        Stack stack = new Stack();
        System.out.println(stack);
        stack.push(133);
        stack.push(343);
        stack.push("Paul");
        stack.push("Emma");
        stack.push("Comfort");
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
