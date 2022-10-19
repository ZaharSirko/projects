package Lab_jav.lab5;

import java.util.Arrays;

public class lab5 {
    public static void main(String[] args) {
        set <String> set = new set<>();
        String[] arr = {"2d","asdsa","asd"};
        set.setSet(arr);
        System.out.println(Arrays.toString(set.getSet()));

        set <Integer> set2 = new set<>();
        Integer[] arr2 = {1,2,3,4,5};
        set2.setSet(arr2);
        System.out.println(Arrays.toString(set2.getSet()));

        operation <String> operation = new operation<>();
        String[] arr3 = {"2d","asdsa","asd3"};
        operation.diferenceSets(arr, arr3);
        System.out.println(" ");
        System.out.println(Arrays.toString(operation.unionSet(arr, arr3)));
        
        operation<Integer> operation2 = new operation<>();
        Integer[] arr4 = {3,4,5,6,7};
        operation2.intersectionSets(arr2, arr4);
        operation2.diferenceSets(arr2, arr4);
        System.out.println(" ");
        System.out.println("end");

       
    }
}
