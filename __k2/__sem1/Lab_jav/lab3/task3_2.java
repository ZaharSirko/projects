package __k2.__sem1.Lab_jav.lab3;

import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter palindrome word");
        String word = scanner.nextLine();
        if(word.length()==5){
            int i=word.length()-word.length(),j=word.length()-1;
            while( i!=j){
                if((word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)) && (word.toLowerCase().charAt(j) == word.toLowerCase().charAt(i))){
                    j--;
                    i++;
                if(i==j){
                    System.out.println(word);
                }
            }
            else{
                System.out.println("Word isn`t palindrome");
                break;
            }
        }
        }
        else{ 
            System.out.println("error");
        }
        scanner.close();
}
}
