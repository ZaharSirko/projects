package _jav.base;


public class methood___ {
    public static void main(String[] args){

String name = "Zahar";
int age = 18;
 hello(name,age);

int x = 37;
int y= 100;

int z = add(x, y);

System.out.println(z);
    }

 static int add(int x, int y){   // add(int a, int b, int c){   return a+b+c}...
 
int z = x+y;
return z;
 }


static void hello(String title, int age){
    System.out.println("Hello "+title);
    System.out.println("Y are "+age + " year old");
}

}
