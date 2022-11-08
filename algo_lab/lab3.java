package algo_lab;

import java.util.ArrayList;

public class lab3 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        System.out.println("Default ArrayList 1");
        for(int i = 48;i>arraylist1.size();i--){
            arraylist1.add((int)(Math.random()*24));
        }
        System.out.println(arraylist1);
        System.out.println("Sorted ArrayList 1");
        arraylist1.sort(null);
        System.out.println(arraylist1);

        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        for(int i = 48;i>arraylist2.size();i--){
            arraylist2.add((int)(Math.random()*24));
        }
        int max = arraylist2.get(0);
        int min  = arraylist2.get(0);
       for(int i =0;i<arraylist2.size();i++){
        if(arraylist2.get(i)>max){
            max = arraylist2.get(i);
        }
        if(arraylist2.get(i)<min){
            min = arraylist2.get(i);
        }
       }
       System.out.println("ArrayList 2");
        System.out.println(arraylist2);
        System.out.println("Min value");
        System.out.println(min);
        System.out.println("Max value");
        System.out.println(max);



        ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
        arraylist3.addAll(arraylist1);
        arraylist3.addAll(arraylist2);
        System.out.println("ArrayList 3");
        System.out.println(arraylist3);






    }

}
