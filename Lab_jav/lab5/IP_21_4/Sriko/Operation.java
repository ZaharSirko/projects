package Lab_jav.lab5.IP_21_4.Sriko;
import java.lang.reflect.Array;

public class Operation  <T> {
    private  T[] arr1;
    private  T[] arr2;
    public T[] unionSet(T[] arr1, T[] arr2){ // Об'єднання множин
    // масив типу T який створює новий елемент типу T в якому береться із arr1 клас і його тип, довжина масиву
    T[] arr3 = (T[]) Array.newInstance(arr1.getClass().getComponentType(), arr1.length + arr2.length);
    // копіюємо arr1 з елемента 0 у arr3 у 0 позицію з розміром arr1 
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    // копіюємо arr2 з елемента 0 у arr3 у позицію довжини arr1 з розміром arr2 
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    
    return arr3;
}
    public void  intersectionSets(T[] arr1,T[] arr2){    // Перетим множин
        this.arr1 = arr1;
        this.arr2 = arr2;
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0;j<arr2.length;j++){
                    if (arr1[i] ==  arr2[j]) 
                {
                   System.out.print( arr2[j]+" ");
                   
                }
            }
        }
        System.out.println();
    }
    else{
        System.out.println("length of arrays must be similar");
       }
}
    public void differenceSets(T[] arr1,T[] arr2){ // різниця множин
        this.arr1 = arr1;
        this.arr2 = arr2;
        arr1 = arr1.clone(); // клонуємо щоб якщо буде потрібно робити якісь інші операції із масивом не змінювати структуру основного масиву
        arr2 = arr2.clone();
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0;j<arr2.length;j++){
                    if (arr1[i] ==  arr2[j] )
                {
                    arr1[i] = null;
                    arr2[j] = null;
                }
            }
            if(arr1[i]!=null){
                System.out.print(arr1[i]+" ");
            }
        }
            System.out.println();
        }
        else{
            System.out.println("length of arrays must be similar");
            }
       
    }

    public void  symmetricDiffSets(T[] arr1,T[] arr2){ // симетрична різниця множин
        this.arr1 = arr1;
        this.arr2 = arr2;
        arr1 = arr1.clone();
        arr2 = arr2.clone();
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for(int j=0;j<arr2.length;j++){
                    if (arr1[i] ==  arr2[j] )
                {
                    arr1[i] = null;
                    arr2[j] = null;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=null){
                System.out.print(arr1[i]+" ");}
                if(arr2[i]!=null){
                    System.out.print(arr2[i]+" ");}
                }
                System.out.println();
        }
        else{
            System.out.println("length of arrays must be similar");
            }
    }
    }

