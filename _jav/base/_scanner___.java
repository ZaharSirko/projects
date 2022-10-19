package _jav.base;
import java.util.Scanner;

public class _scanner___{
    public static void main(String[] args ) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("1+1=?");
        int ans = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Who are you?");
        String q1 = scanner.nextLine();
        
        System.out.println("1+1 = "+ans);
        System.out.println("I'm "+q1);
        
        scanner.close();
    }
}