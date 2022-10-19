package _jav.base;
import java.util.Scanner;

public class math___{
    public static void main(String[] args){
    double x = 4.12, y = -12,z,a,b;
    
    b = Math.round(x);
    z = Math.max(x, y);
    a = Math.min(x, y);  //abs, sqrt, round
    System.out.println("Max num = "+z);
    System.out.println("Min num = "+a);
    System.out.println("round x = "+b);

double t,d,c;

Scanner scanner = new Scanner (System.in);

System.out.println("Enter t ");

t = scanner.nextDouble();
scanner.nextLine();

System.out.println("Enter d ");
d = scanner.nextDouble();
scanner.nextLine();

c = Math.sqrt((t*t)+(d*d));

System.out.println("Hypotenuse = "+c);

scanner.close();
    }
}