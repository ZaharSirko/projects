package __own._jav.algorithm_and_data_structures;

import java.util.Stack;

public class _stack {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<String>();

        stack.push("Dota 2");
        stack.push("Issac");
        stack.push("Terraria");

        String game = stack.pop(); 
        System.out.println(game);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("Dota 2"));
    }
}
