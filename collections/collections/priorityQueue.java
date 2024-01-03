import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> a = new PriorityQueue<String>();
        System.out.println(a.poll());
        a.add("Bot1");
        a.add("Amit");
        a.add("Vijay");
        System.out.println("head = "+ a.element());
        System.out.println("peek = "+ a.peek());
        a.remove("Amit");
        System.out.println(a.poll());
        System.out.println("head = "+ a.element());
        System.out.println("peek = "+ a.peek());

    }
}
