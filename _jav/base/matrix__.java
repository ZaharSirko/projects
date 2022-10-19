package _jav.base;
import java.util.Scanner;

public class matrix__ {
    public static void main(String[] args){
 try (Scanner scanner = new Scanner(System.in)) {
    int row,col;
    String symbol ="";
    System.out.println("Enter number of col");
       col = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Enter number of row");
       row = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Enter symbol");
    symbol = scanner.next(); 
     
    for (int i=1;i<=row;i++){
        System.out.println();
        for (int j=1;j<=col;j++){
            System.out.print(symbol);
        }
    }
}
    }
}
