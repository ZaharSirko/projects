package __k2.__sem1.Lab_jav.lab3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        scanner.nextLine();
        if (c %2 == 0){
        System.out.println("even number");
        }
        else if (c % 2 != 1 && c % 2 != 0) {
            System.out.println("error");
       }
        else{
            System.out.println("odd number");
        }
         scanner.close();
    }
    
}
