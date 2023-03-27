import java.util.*;

public class asd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter boolean expression: ");
        String expression = sc.nextLine().replaceAll("\\s+","");

        Set<String> variables = new HashSet<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetter(c)) {
                variables.add(String.valueOf(c));
            }
        }
        List<String> variableList = new ArrayList<>(variables);
        int numVars = variableList.size();
        
        int numRows = (int) Math.pow(2, numVars);

        System.out.print("Truth table for expression " + expression + ": \n");
        for (String variable : variableList) {
            System.out.print(variable + "\t");
        }
        System.out.println(expression);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numVars; j++) {
                int bit = (i >> (numVars - 1 - j)) & 1;
                System.out.print(bit + "\t");
            }
            boolean result = evaluate(expression, variableList, i);
            System.out.println(result);
        }
    }

    private static boolean evaluate(String expression, List<String> variables, int row) {
        Map<String, Boolean> variableValues = new HashMap<>();
        for (int i = 0; i < variables.size(); i++) {
            int bit = (row >> (variables.size() - 1 - i)) & 1;
            variableValues.put(variables.get(i), bit == 1);
        }
        return evaluate(expression, variableValues);
    }

    private static boolean evaluate(String expression, Map<String, Boolean> variableValues) {
        Stack<Boolean> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetter(c)) {
                stack.push(variableValues.get(String.valueOf(c)));
            } else if (c == '!') {
                stack.push(!stack.pop());
            } else if (c == '+') {
                boolean b = stack.pop();
                boolean a = stack.pop();
                stack.push(a && b);
            } else if (c == '-') {
                boolean b = stack.pop();
                boolean a = stack.pop();
                stack.push(a || b);
            } else if (c == '⊕') {
                boolean b = stack.pop();
                boolean a = stack.pop();
                stack.push(a ^ b);
            }
        }
        return stack.pop();
    }

}
