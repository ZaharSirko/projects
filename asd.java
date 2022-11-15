public class asd {
public static void main(String[] args) {
float a= 0;
float b= 1;
float c= 0;
float s;
while(a<b &&b <10){
    c= ((a+b)/2);
    a++;
    b++;
    System.out.println( " c1 "+c);
    c+=c;
    System.out.println(" c2 "+c);
}
System.out.println(c);

}
}
