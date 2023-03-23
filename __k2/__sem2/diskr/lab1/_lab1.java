package __k2.__sem2.diskr.lab1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class _lab1 {
   public static void main(String[] args) {
    int[] a = {6, 7, 1, 9, 4, 2};
    int[] b = {5, 1, 7, 2, 4, 3};
    Scanner scanner =new Scanner(System.in);
    int choice;
   do {
      System.out.println("1. Union\n2. intersection\n3. Difference\n4. Symmetrical_difference\n5. a include b\n0. Exit");
      choice = scanner.nextInt();
      switch(choice){
         case 1 :
         System.out.println("union");
         union(a, b);
         break;
         case 2:
         System.out.println("intersection");      
       intersection(a, b);
         break;
         case 3:
         System.out.println("difference");
       System.out.println(difference(a, b));
         break;
         case 4:
         System.out.println("symmetrical_difference");
       System.out.println(symmetrical_difference(a, b));
         break;
         case 5:
         System.out.println("a include b");
         System.out.println(include(a, b));
         break;
         case 0:
         System.out.println("Exit");
         break;
         default: 
         System.out.println("Input number 0-5");
         scanner.close();
       }
   } while ( choice!=0);
   }
   public static void union( int[] a, int[] b){
     int[] c = new int[a.length+b.length];
     for (int i = 0; i < c.length/2; i++) {
        c[i] = a[i];
        c[i+c.length/2] = b[i];
     }
    
    System.out.println(Arrays.toString(c));
    
   }
   public static void intersection(int[] a, int[] b){
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b.length; j++) {
         if(a[i]==b[j]){
            System.out.print(a[i]+" ");
         }
      }
    }
    System.out.println();
   }
   public static Set<Integer>  difference(int[] a, int[] b){
      Set<Integer> s1 = new HashSet<>();
      for(int i: a)    s1.add(i);
      Set<Integer> s2 = new HashSet<>();
      for(int i: b)    s2.add(i);
      Set<Integer> common = new HashSet<>();
      for(int i: s1){
          if(s2.contains(i))  common.add(i);
      }
      s1.removeAll(common);
      return s1;
   }
   public static Set<Integer> symmetrical_difference(int[] a, int[] b){
      Set<Integer> s1 = new HashSet<>();
      for(int i: a)    s1.add(i);
      Set<Integer> s2 = new HashSet<>();
      for(int i: b)    s2.add(i);
      Set<Integer> common = new HashSet<>();
      for(int i: s1){
          if(s2.contains(i))  common.add(i);
      }
      s1.removeAll(common);
      s2.removeAll(common);
      Set<Integer> s3 = new HashSet<>();
      for(int i: s1)    s3.add(i);
      for(int i: s2)    s3.add(i);
      return s3;
   }
   public static boolean include(int[] a, int[] b){
      int count =0;
      for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < b.length; j++) {
            if(a[i]==b[j]){
              count++;
            }
         }
      }
      if(count==a.length){
        return true;
      }
      return false;
   }
}

