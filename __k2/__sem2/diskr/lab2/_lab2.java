package __k2.__sem2.diskr.lab2;
import java.util.Arrays;


public class _lab2 {
    public static void main(String[] args) {
      int[]  U = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] A = {2, 7, 8, 5, 1, 9};
      int[] B = {1, 2, 4, 5, 9, 6};
      System.out.println(and(tobits(U, A), tobits(U, B)));
      System.out.println(or(tobits(U, A), tobits(U, B)));
      System.out.println(xor(tobits(U, A), tobits(U, B))); // Integer.pasreInt("",2);
    //  System.out.println(decard(tobits(U, A), tobits(U, B)));
     decard(tobits(U, A), tobits(U, B));
    }
    public static String tobits(int[]U,int[]A){
       int i=0;
       int j=0;
       U = U.clone();
       Arrays.sort(A);
       String bits ="";
       while(U.length>i){
        if(U[i]==A[j]){
        U[i]=1;
        bits+=U[i];
        j++;
        }
        else {
            U[i] = 0;
            bits+=U[i];
           }
        i++;
       }
        return bits;
    }
    public static String and(String bits1,String bits2){
       String bits ="";
       char[] a = bits1.toCharArray();
       char[] b = bits2.toCharArray();
        char[] bit = new char[a.length];
        for (int i = 0; i < bit.length; i++) {
            if( (a[i] == '1')&&(b[i] == '1')){
                bit[i]='1';
                bits +=bit[i];
            }
            else {
                bit[i]='0';
                bits +=bit[i];
            }
        }
        return bits;
        
    }

    public static String or(String bits1,String bits2){
        String bits ="";
        char[] a = bits1.toCharArray();
        char[] b = bits2.toCharArray();
         char[] bit = new char[a.length];
         for (int i = 0; i < bit.length; i++) {
             if( ((a[i]!='0')||(b[i]!='0'))    ){          
                 bit[i]='1';
                 bits +=bit[i];
             }
             else {
                 bit[i]='0';
                 bits +=bit[i];
             }
         }
         return bits;
         
     }
    
     public static String xor(String bits1,String bits2){
        String bits ="";
        char[] a = bits1.toCharArray();
        char[] b = bits2.toCharArray();
         char[] bit = new char[a.length];
         for (int i = 0; i < bit.length; i++) {
             if( ((a[i]!='0')^(b[i]!='0'))    ){          
                 bit[i]='1';
                 bits +=bit[i];
             }
             else {
                 bit[i]='0';
                 bits +=bit[i];
             }
         }
         return bits;
         
     }

     public static void decard(String bits1,String bits2){
        char[] a = bits1.toCharArray();
        char[] b = bits2.toCharArray();
         char[][] bit = new char[a.length][b.length];
         for (int i = 0; i < bit.length; i++) {
            for (int j = 0; j < bit.length; j++) {
                System.out.print(a[i]+" "+b[j]+" ");
            }
            System.out.println();
         }
      
     }


}
