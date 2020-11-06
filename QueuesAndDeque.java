import java.util.*;

public class QueuesAndDeque {
    public static void main(String[] args) {
        System.out.println("================ Queues and Dequeues ================");
        System.out.println("------------------------- Priority Queue -----------------------");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(9, 2, 3, 1, 3, 8));
        System.out.println(queue); // What is printed out here appears not to be sorted
        // However, when it comes to removing elements from the queue, it removes them starting from the least element according  to the specified ordering.
        System.out.println("Removing the elements now");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        // You can now see that it removes the least element every time you call the remove method

        System.out.println("----------------------------- Deque ----------------------------");
        // A Deque is a "double ended queue" which means that a elements can be added at the front or the tail of the queue.
//        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(1, 3, 2, 5, 2, 6, 7, 9, 8));
        System.out.println(deque);
        System.out.println(deque.element()); // Gives you the element at the head of the queue
        System.out.println(deque.getFirst()); // Gives you the element at the head of the queue
        System.out.println(deque.getLast()); // Gives you the element at the tail of the queue ... observe that this is not necessarily the largest element
        System.out.println("Removing the elements now");
        while (!deque.isEmpty()) {
            System.out.println(deque.remove());
        }
        // Hmmmmm... this seems to follow the order with which they were inserted
        System.out.println(deque);
        System.out.println("Adding new elements ... Watch the methods used and the positions");
        deque.add(3);
        deque.add(5);
        deque.addFirst(1);
        deque.addLast(7);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.getLast());
        System.out.println(deque.getFirst());
        System.out.println(deque.removeLast());
        deque.removeFirst();
        System.out.println(deque);
        deque.offer(9);
        System.out.println(deque);



        System.out.println("------------------ LinkedList as FIFO Queue ------------------");
        // LinkedList which implements the List interface also implements the Queue interface too operating on the FIFO principle
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("first");
        queue1.offer("second");
        queue1.offer("third");
        queue1.offer("fourth");
        System.out.println(queue1);
        queue1.remove();
        System.out.println(queue1);
        queue1.remove("third");
        System.out.println(queue1);
        queue1.add("fifth");
        queue1.add("sixth");
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1);


    }
}
