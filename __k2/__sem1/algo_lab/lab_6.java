package __k2.__sem1.algo_lab;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class lab_6 {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<String>(); // ініціалізація стеку
        stack.push("q"); // додаємо елементи
        stack.push("w");
        stack.push("e");
        stack.push("r");
        stack.push("t");
        stack.push("y");
        stack.push("u");
        stack.push("i");
        stack.push("o");
        stack.push("p");
        System.out.println(stack); // виводимо стек
        stack.pop(); // видаляємо елементи
        stack.pop();
        stack.pop();
        System.out.println(stack); // виводимо стек

        Queue<String> queue = new LinkedList<String>();// ініціалізація черги
        System.out.println(queue.isEmpty()); // перевірка чи порожня черга
        queue.offer("a"); // додаємо елементи
        queue.offer("s");
        queue.offer("d");
        queue.offer("f");
        queue.offer("g");
        queue.offer("h");
        queue.offer("j");
        queue.offer("k");
        queue.offer("l");
        queue.offer(";");
        System.out.println(queue);  // виводимо чергу
        queue.poll(); // видаляємо елементи
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue); // виводимо чергу
        System.out.println(queue.size()); // виводимо розмір
    }
}
