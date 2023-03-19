package __own._jav.oop.oop18;

import java.util.Scanner;

public class dynamic_polymorphism_ {
   //Dynamic Polymorphism
   public static void main(String[] args) {
  try (Scanner scanner = new Scanner(System.in)) {
   Animal animal;
     
     System.out.println("What animal do you want?"); 
     System.out.print("(1=dog) or (2=cat): ");
     int choice = scanner.nextInt();
     
     if(choice==1) {
      animal = new Dog();
      animal.speak();
     }
     else if(choice==2) {
      animal = new Cat();
      animal.speak();
     }
     else {
      animal = new Animal();
      System.out.println("That choice was invalid");
      animal.speak();
     }
}
 }
}

