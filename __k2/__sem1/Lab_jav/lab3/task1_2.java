package __k2.__sem1.Lab_jav.lab3;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int c = scanner.nextInt();
            if (c %2 == 0){
                System.out.println("even number");
                }
                else{
                    System.out.println("odd number");
                }
        }
        else{
            System.out.println("error");
        }
         scanner.close();
    }
}
