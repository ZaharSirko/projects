package __k2.__sem2.diskr.lab4;

import java.util.Scanner;

public class _lab4 {
    public static void main(String[] args) {
        int a = 611;
        int b = 636;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. findGcd\n2. findLcm\n3. primeFactors\n4. findDivisors \n5. primeNumbers \n6. findCongruentMod \n0. Exit");
           choice  =scanner.nextInt();
           switch (choice) {
               case 1:
               System.out.println("Gcd\n"+findGcd(a, b));
                   break;
                   case 2:
                   System.out.println("Lcm\n"+findLcm(a, b));
                      break;
                   case 3:
                   System.out.println("primeFactors a\n"+primeFactors(a));

                   System.out.println("primeFactors b\n"+primeFactors(b));
                        break;
                   case 4:
                   System.out.println("Divisors a\n"+findDivisors(a));

                   System.out.println("Divisors b\n"+findDivisors(b));
                       break;
                    case 5:
                       System.out.println("primeNumbers a\n"+primeNumbers(a));
    
                       System.out.println("primeNumbers b\n"+primeNumbers(b));
                        break;
                     case 6:
                           System.out.println("CongruentMod\n"+findCongruentMod(a,b));
                         break;
                   case 0:
                       System.out.println("Exit");
                          break;
           
               default:
               System.out.println("Input number 0-6");
               scanner.close();
           }
        } while (choice!=0 && choice<6);
    }
    public static Integer findGcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static Integer findLcm(int a, int b) {
        int gcd = findGcd(a, b);
        return (a * b) / gcd;
    }
    public static String primeFactors(int a) {
    String primeFactors = "";
        while (a % 2 == 0) {
            primeFactors += 2 + " ";
            a /= 2;
        }
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            while (a % i == 0) {
                primeFactors += i + " ";
                a /= i;
            }
        }
        if (a > 2) {
            primeFactors +=  a;
        }
        return primeFactors;
    }
    public static String findDivisors(int a) {
       String Divisors = "";
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                Divisors +=i + " ";
            }
        }
        return  Divisors ;
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String  primeNumbers(int a){
        String primeNumbers = "";
        for (int i = 1; i <= a; i++) {
            if (isPrime(i)) {
                primeNumbers+=(i+" ");
            }
        }
        return  primeNumbers;
    }

    public static Integer findCongruentMod(int a, int b) {
        int n = Math.max(a, b);
        for (int i = 2; i <= n; i++) {
            if (a % i == b % i) {
                return i;
            }
        }

        return -1;
    }
}
