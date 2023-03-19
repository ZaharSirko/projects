package __k2.__sem1.Lab_jav.lab3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int a;
        int b = 0;
        int i;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number");
            a = scanner.nextInt();
            System.out.println();
            for(i=1;a>=i;i++){
                System.out.println(i*(i+1));
                b+= i*(i+1);

            }
            scanner.close();
        }
        System.out.println("-------------");
        System.out.println(b);
    }
}
