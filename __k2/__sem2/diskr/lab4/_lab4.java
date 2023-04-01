package __k2.__sem2.diskr.lab4;

public class _lab4 {
    public static void main(String[] args) {
        int a = 611;
        int b = 636;
        System.out.println(findGcd(a, b));
        System.out.println(findLcm(a, b));
        primeFactors(a);
        primeFactors(b);
        findDivisors(a);
        findDivisors(b);
        System.out.println(findCongruentMod(a,b));
        
    }
    public static int findGcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private static int findLcm(int a, int b) {
        int gcd = findGcd(a, b);
        return (a * b) / gcd;
    }
    private static void primeFactors(int a) {
        while (a % 2 == 0) {
            System.out.print(2 + " ");
            a /= 2;
        }

        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            while (a % i == 0) {
                System.out.print(i + " ");
                a /= i;
            }
        }

        if (a > 2) {
            System.out.print(a);
        }
        System.out.println();
    }
    private static void findDivisors(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static int findCongruentMod(int a, int b) {
        int n = Math.max(a, b);
        for (int i = 2; i <= n; i++) {
            if (a % i == b % i) {
                return i;
            }
        }

        return -1;
    }
}
