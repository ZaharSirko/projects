package __own._jav.algorithm_and_data_structures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class _queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();


        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue);
        System.out.println(queue.contains("Chad"));



        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(6.7);
        queue2.offer(9.0);
        queue2.offer(2.0);

        System.out.println(queue2);
        while(!queue2.isEmpty()){
            queue2.poll();

        }
        System.out.println(queue2);
    }
}
