package __k2.__sem2.arh.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab6 {
 public static void main(String[] args) {
    int[] arr = {7,8,9,10,1,2,4,5,6};
    Arrays.sort(arr);
    try {
        int element = arr[10];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exeption: " + e.getMessage());
    }
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
   Collections.shuffle(numbers);
  System.out.println("Max value: " +Collections.max(numbers));
   System.out.println("Min value: " +Collections.min(numbers));
   int sum = numbers.stream().mapToInt(Integer::intValue).sum();
   System.out.println("Sum: " + sum);
   
   System.out.println("Array: "+Arrays.toString(arr));
   System.out.println("Array list: "+Arrays.toString(numbers.toArray()));

   Queue<Integer> queue = new PriorityQueue<>();

  for (int i = 0; i < 10; i++) {
  queue.offer(i);
  }
  System.out.println("Queue"+queue);
  System.out.print("Queue poll: ");
  for (int i = 0; i < 10; i++) {
    System.out.print(queue.poll()+" ");
  }
  System.out.println("\nQueue"+queue);
 }   
}
