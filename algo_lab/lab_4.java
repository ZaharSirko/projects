import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class lab_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        System.out.println("Default ArrayList 1");
        for(int i = 48;i>arraylist1.size();i--){
            arraylist1.add((int)(Math.random()*24));
        }
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        for(int i = 48;i>arraylist2.size();i--){
            arraylist2.add((int)(Math.random()*24));
        }
        ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
        System.out.println("Default arr\n"+"arr1 = "+arraylist1+"\narr2 = "+arraylist2);
        arraylist3 = arraylist1;
        arraylist1 = arraylist2;
        arraylist2 = arraylist3;
        System.out.println("Swapped arr\n"+"arr1 = "+arraylist1+"\narr2 = "+arraylist2);
        Set<Integer> s = new LinkedHashSet<Integer>(arraylist1);  
        arraylist1.clear();
        arraylist1.addAll(s);
        System.out.println("arr1 with out duplicates ");
        System.out.println("arr1 = "+ arraylist1);

}
}
