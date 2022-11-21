import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lab_6 {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<String>();
        stack.push("q");
        stack.push("w");
        stack.push("e");
        stack.push("r");
        stack.push("t");
        stack.push("y");
        stack.push("u");
        stack.push("i");
        stack.push("o");
        stack.push("p");
        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());
        queue.offer("a");
        queue.offer("s");
        queue.offer("d");
        queue.offer("f");
        queue.offer("g");
        queue.offer("h");
        queue.offer("j");
        queue.offer("k");
        queue.offer("l");
        queue.offer(";");
        System.out.println(queue);

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.size());
   
    }
}
