package __k2.__sem1.Lab_jav.lab3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter palindrome word");
        String word = scanner.nextLine();
        if(word.length()==5){
            char ch0 = word.toLowerCase().charAt(0);
            char ch1 = word.toLowerCase().charAt(1);
            char ch3 = word.toLowerCase().charAt(3);
            char ch4 = word.toLowerCase().charAt(4);
            if( (ch0==ch4) && (ch1==ch3) ){
                System.out.println(word);
            }
            else{System.out.println("error");}
        }
        else{ 
            System.out.println("error");
        }
        scanner.close();
    }
}
