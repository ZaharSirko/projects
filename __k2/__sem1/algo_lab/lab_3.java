package __k2.__sem1.algo_lab;

import java.util.ArrayList;

public class lab_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>(); // ініціалізація списку 1
        System.out.println("Default ArrayList 1");
        for(int i = 48;i>arraylist1.size();i--){
            arraylist1.add((int)(Math.random()*24));  // додаємо елементи у лист
        }
        System.out.println(arraylist1);
        System.out.println("Sorted ArrayList 1");
        arraylist1.sort(null);  // сортування
        System.out.println(arraylist1);

        ArrayList<Integer> arraylist2 = new ArrayList<Integer>(); // ініціалізація списку 2
        for(int i = 48;i>arraylist2.size();i--){
            arraylist2.add((int)(Math.random()*24));
        }
        int max = arraylist2.get(0);
        int min  = arraylist2.get(0);
       for(int i =0;i<arraylist2.size();i++){
        if(arraylist2.get(i)>max){
            max = arraylist2.get(i); // шукаємо максимальне значення
        }
        if(arraylist2.get(i)<min){
            min = arraylist2.get(i); // шукаємо мінімальне значення
        }
       }
       System.out.println("ArrayList 2");
        System.out.println(arraylist2);
        System.out.println("Min value");
        System.out.println(min);
        System.out.println("Max value");
        System.out.println(max);

        ArrayList<Integer> arraylist3 = new ArrayList<Integer>(); // ініціалізація списку 3
        arraylist3.addAll(arraylist1); // додаємо всі елементи першого списку у третій
        arraylist3.addAll(arraylist2); // додаємо всі елементи другого списку у третій
        System.out.println("ArrayList 3");
        System.out.println(arraylist3);

        arraylist3.remove(3); // видялаємо елементи із списку
        arraylist3.remove(6); // видялаємо елементи із списку
        arraylist3.remove(9); // видялаємо елементи із списку 
        System.out.println("ArrayList 3 - minus some elements");
        System.out.println(arraylist3);





    }

}
