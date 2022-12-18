package Lab_jav.lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lab9  {
    public static void main(String[] args) {
       String s = null;
       MyException(s);
       ex ex = new ex();
       ex.solutions();
       ex ex1 = new ex(1,0);
       System.out.println("a / b = "+ex1.division());
       System.out.println("a * b = "+ex1.multiplication());
       System.out.println("a - b = "+ex1.minus());
       System.out.println("a + b = "+ex1.plus());
       factorial();
    }

    public static void MyException(String s){
        try {
            if (s == null || s =="") {
                throw new NullPointerException("Exception: s is null!");
            }
            System.out.println("Inside method print: " + s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            finally{
                System.out.println("Final");
                try {
                    if (s == null || s =="") {
                        throw new NullPointerException("Exception: s is null!");
                    }
                    System.out.println("Inside method print: " + s);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Exception was processed. Program continues");
                    }
            }
    }

    private static void factorial() {
    try {
        long fact = 1;
        System.out.println("Enter number for factorial");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();
        for (long i = 2; i <= Math.abs(num); i++) {
            fact = fact * i;
        }
        if(num<0){
            fact*=-1;
        }
        System.out.println(fact);
    } catch (InputMismatchException e) {
        System.out.println(e);
    }
}
}



