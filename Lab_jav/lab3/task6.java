package Lab_jav.lab3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int count = scanner.nextInt();
        boolean isPrime = true;
        scanner.close();
        System.out.println("Prime numbers");
        for (i = 1; i <= count; i++) {
            isPrime = PrimeNumbers(i);
            if (isPrime) {
                System.out.print(i+" ");
            }
        }
        
    }
    public static boolean PrimeNumbers(int numberToCheck) {
        for (int i = 2; i <= numberToCheck / 2; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
 
    }
}
