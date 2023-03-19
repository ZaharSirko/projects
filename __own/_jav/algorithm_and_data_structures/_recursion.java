package __own._jav.algorithm_and_data_structures;

public class _recursion {
    public static void main(String[] args) {
        walk(5);
        
        System.out.println(factorial(5));

        System.out.println(power(3,6));
    }

    private static int power(int base, int exponent) {
        if(exponent<1)return 1; // base case
        return base * power(base, exponent-1); // recursive case
    }

    private static int factorial(int num) {
        if(num < 1)return 1; // base case
        return num * factorial(num - 1); // recursive case
    }

    private static void walk(int steps) {


        if(steps < 1)return; // base case
        System.out.println("U take steps");
        walk(steps-1); // recursive case
    }
}
