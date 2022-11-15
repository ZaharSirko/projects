package Lab_jav.lab8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("Java",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        System.out.println(input);
        System.out.println("Enter word to replace Java");
        Scanner scanner = new Scanner(System.in);
        String replace =  scanner.nextLine();
        scanner.close();
        if(matcher.find()){
            System.out.println(matcher.replaceAll(replace));
        }
            
    }   
    
}
