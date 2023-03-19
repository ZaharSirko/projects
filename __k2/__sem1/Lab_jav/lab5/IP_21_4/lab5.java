package __k2.__sem1.Lab_jav.lab5.IP_21_4;

import java.util.Arrays;

import __k2.__sem1.Lab_jav.lab5.IP_21_4.Sriko.Operation;
import __k2.__sem1.Lab_jav.lab5.IP_21_4.Sriko.Zahar.Set;

public class lab5 {
    public static void main(String[] args) {
        Set <String> set = new Set<>();
        String[] arr = {"2d","asdsa","asd"};
        set.setSet(arr);
        System.out.println(Arrays.toString(set.getSet()));

        Set <Integer> set2 = new Set<>();
        Integer[] arr2 = {1,2,3,4,5};
        set2.setSet(arr2);
        System.out.println(Arrays.toString(set2.getSet()));

        Operation <String> operation = new Operation<>();
        String[] arr3 = {"2sad","asd","asd3"};
        System.out.println("differenceSets");
        operation.differenceSets(arr, arr3);
        System.out.println("unionSet");
        System.out.println(Arrays.toString(operation.unionSet(arr, arr3)));
       
        Operation<Integer> operation2 = new Operation<>();
        Integer[] arr4 = {3,4,5,6,7};
        System.out.println("intersectionSets");
        operation2.intersectionSets(arr2, arr4);
        System.out.println("differenceSets");
        operation2.differenceSets(arr2, arr4);
        System.out.println("symmetricDiffSets");
        operation2.symmetricDiffSets(arr2, arr4);
        System.out.println("end");

       
    }
}
