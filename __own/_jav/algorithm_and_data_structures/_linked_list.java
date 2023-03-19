package __own._jav.algorithm_and_data_structures;

import java.util.LinkedList;

public class _linked_list {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.poll();

        // As Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4,"E");
        linkedList.remove("E");
        // System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("5");
        linkedList.addLast("Q");
        linkedList.removeFirst();
        linkedList.removeLast();


        System.out.println(linkedList);
    }
}
