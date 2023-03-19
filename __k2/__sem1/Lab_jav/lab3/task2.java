package __k2.__sem1.Lab_jav.lab3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        double a,b,c,q,w,e;
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter q ");
       q = scanner.nextDouble();
       scanner.nextLine();
       System.out.println("Enter w ");
       w = scanner.nextDouble();
       scanner.nextLine();
       System.out.println("Enter e ");
       e = scanner.nextDouble();
       scanner.nextLine();
       a = Math.min(Math.abs(q), Math.abs(w));
       b = Math.min(Math.abs(w), Math.abs(e));
       c = Math.min(a, b);
       System.out.println(c);

       scanner.close();
    }
}
