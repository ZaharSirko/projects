package Lab_jav.lab3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        System.out.println("Enter number to delete");
        int b = scanner.nextInt();
        int c = Integer.parseInt(Integer.toString(a).replaceAll(Integer.toString(b),""));
        System.out.println("New number");
        System.out.println(c);
        System.out.println(c-100); //  щоб продемонструвати що це є число
        scanner.close();
}
}
