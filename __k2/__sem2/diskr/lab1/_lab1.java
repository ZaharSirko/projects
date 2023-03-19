package __k2.__sem2.diskr.lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class _lab1 {
   public static void main(String[] args) {
    int[] a = {6, 7, 1, 9, 4, 2};
    int[] b = {6, 7, 1, 9, 4, 2};
    System.out.println("union");
    union(a, b);
    System.out.println("intersection");   
    intersection(a, b);
    System.out.println("difference");
    System.out.println(difference(a, b));
    System.out.println("symmetrical_difference");
    System.out.println(symmetrical_difference(a, b));
    System.out.println(include(a, b));
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

