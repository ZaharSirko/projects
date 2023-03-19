package __k2.__sem1.Lab_jav.lab9;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex  {
    double a,b;
    ex(){

    }
    ex(double a,double b){
        this.b=a;
        this.a=b;
        try{
            if(a==0 && b==0){
                throw new IllegalAccessException ("Exception: a=0 and b=0");
            }
            if(a>0 && b>0){
                throw new MyException ("Exception: a>0 and b>0");
            }
            if(a<0 && b<0){
                throw new IllegalAccessException ("Exception: a<0 and b<0");
            }
            if(a==0 && b!=0 || a!=0 && b==0){
                throw new ArithmeticException ("Exception: a=0 and b!=0 or b=0 and a!=0");
            }
        }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
             }
             catch(IllegalAccessException e){
                 System.out.println(e.getMessage());
             }
             catch(MyException e){
                 System.out.println(e.getMessage());
             }
    }
  public void solutions(){
    try {
        System.out.println("Enter a");
        try (Scanner scanner1 = new Scanner(System.in)) {
            int a =  scanner1.nextInt();
            System.out.println("Enter b");
            try (Scanner scanner2 = new Scanner(System.in)) {
                double b =  scanner2.nextDouble();
                System.out.println("b*b*(a-b)/a");
                double c = b*b*(a-b)/a;
                System.out.println(c+"\n");
                System.out.println("a*Math.sqrt(b)");
                double c2 = a*Math.sqrt(b);
                System.out.println(c2+"\n");
                System.out.println("a*((b-a)/(b+a))");
                double c3 = a*((b-a)/(b+a));
                System.out.println(c3+"\n");
                System.out.println("Math.sqrt(a)+Math.sqrt(b)+Math.sqrt(a+b)");
                double c4 = Math.sqrt(a)+Math.sqrt(b)+Math.sqrt(a+b);
                System.out.println(c4+"\n");
                System.out.println("Math.sqrt(a-b)/c");
                double c5 = Math.sqrt(a-b)/c;
                System.out.println(c5+"\n");     
                    if(a==0 && b==0){
                        throw new IllegalAccessException ("Exception: a=0 and b=0\n");
                    }
                    if(a>0 && b>0){
                        throw new MyException ("Exception: a>0 and b>0\n");
                    }
                    if(a<0 && b<0){
                        throw new IllegalAccessException ("Exception: a<0 and b<0\n");
                    }
                    if(a==0 && b!=0 || a!=0 && b==0){
                        throw new ArithmeticException ("Exception: a=0 and b!=0 or b=0 and a!=0\n");
                    }
            }
        } 
       }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
         }
         catch(IllegalAccessException e){
             System.out.println(e.getMessage());
         }
         catch(MyException e){
             System.out.println(e.getMessage());
         }
         catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
}
   public double minus(){
         return a-b;
    }
   public double plus(){
         return a+b;
    }
    public double division(){
             return a/b;
    }
    public double multiplication(){
     return a * b;
    }
  }

