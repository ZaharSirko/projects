package Lab_jav.lab5;

import java.lang.reflect.Array;

public class operation <T>{
    private  T[] arr1;
    private  T[] arr2;
    
    public T[] unionSet(T[] arr1, T[] arr2){
    T[] arr3 = (T[]) Array.newInstance(arr1.getClass().getComponentType(), arr1.length + arr2.length);
 
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
     System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    
    return arr3;
}
    public void  intersectionSets(T[] arr1,T[] arr2){    
        this.arr1 = arr1;
        this.arr2 = arr2;
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0;j<arr2.length;j++){
                    if (arr1[i] ==  arr2[j]) 
                {
                   System.out.println( arr2[j]);
                   
                }
            }
        }
    }
    else{
        System.out.println("length of arrays must be similar");
       }
}
    public void diferenceSets(T[] arr1,T[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0;j<arr2.length;j++){
                    if (arr1[i] !=  arr2[j] )
                {
                   System.out.print(" " + arr1[i]+"     "+arr2[j]+"| ");
                   
                }
            }
        }
       }
       else{
        System.out.println("length of arrays must be similar");
       }
    }
    public void  symmetricDiffSets(T[] arr1,T[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0;j<arr2.length;j++){
                    if (arr1[i] ==  arr2[j]) 
                {
                   System.out.println( arr2[j]);
                   
                }
                }
        }
       }
       else{
        System.out.println("length of arrays must be similar");
       }
    }

    }

