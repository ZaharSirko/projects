package _jav.something.generiscs_class;


public class generics_main {
    public static void main(String[] args) {
      // myint myInt = new myint(1);
      // mydouble myDouble = new mydouble(3.9);
      // mychar myChar = new mychar('%');
      // mystring myString = new mystring("HeLlO");

      // System.out.println(myInt.getValue());
      // System.out.println(myDouble.getValue());
      // System.out.println(myChar.getValue());
      // System.out.println(myString.getValue());



      mygenericClass <Integer,Integer> myInt = new mygenericClass<> (1,2);
      mygenericClass <Double,Double> myDouble = new mygenericClass<> (3.14,4.23);
      mygenericClass <Character,Character> myChar = new mygenericClass<> ('%','^');
      mygenericClass <String,String> myString = new mygenericClass<> ("asd","lol");



      System.out.println(myInt.getValueX());
      System.out.println(myDouble.getValueY());
      System.out.println(myChar.getValueX());
      System.out.println(myString.getValueY());


 
      }
    }
      
  
 
