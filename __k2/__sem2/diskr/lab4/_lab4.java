package __k2.__sem2.diskr.lab4;

public class _lab4 {
    public static void main(String[] args) {
        int a = 611;
        int b = 636;
        System.out.println(findGcd(a, b));
        System.out.println(findLcm(a, b));
        System.out.println(primeFactors(a));
        System.out.println( primeFactors(b));
        System.out.println(findDivisors(a));
        System.out.println(findDivisors(b));
        System.out.println( primeNumbers(a));
        System.out.println(primeNumbers(b));
        System.out.println(findCongruentMod(a,b));
        
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
