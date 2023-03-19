package __k2.__sem1.algo_lab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class lab_4 {
    public static void main(String[] args) {
        ArrayList<String> wordlist = new ArrayList<String>();
        wordlist.add("q"); // додаємо елементи у список
        wordlist.add("w");
        wordlist.add("e");
        wordlist.add("r");
        wordlist.add("t");
        wordlist.add("y");
        wordlist.add("u");
        wordlist.add("i");
        wordlist.add("o");
        wordlist.add("p");
        wordlist.add("a");
        wordlist.add("s");
        wordlist.add("d");
        wordlist.add("f");
        wordlist.add("g");
        wordlist.add("h");
        wordlist.add("j");
        wordlist.add("k");
        wordlist.add("l");
        System.out.println("Default wordlist\n"+wordlist);
        Collections.reverse(wordlist); // змінюємо порядок
        System.out.println("Reversed wordlist\n"+wordlist);
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        for(int i = 48;i>arraylist1.size();i--){
            arraylist1.add((int)(Math.random()*24)); // додаємо елементи у список
        }
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        for(int i = 48;i>arraylist2.size();i--){
            arraylist2.add((int)(Math.random()*24)); // додаємо елементи у список
        }
        ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
        System.out.println("Default arr\n"+"arr1 = "+arraylist1+"\narr2 = "+arraylist2);
        arraylist3 = arraylist1;
        arraylist1 = arraylist2; // міняємо місцями значення першого і другого списка
        arraylist2 = arraylist3;
        System.out.println("Swapped arr\n"+"arr1 = "+arraylist1+"\narr2 = "+arraylist2);
        Set<Integer> s = new LinkedHashSet<Integer>(arraylist1); // ініціалізація s LinkedHashSet для видалення дублікатів з arraylist1  
        arraylist1.clear(); // видаляємо всі елементи
        arraylist1.addAll(s); // додаємо всі елементи s у список
        System.out.println("arr1 without duplicates ");
        System.out.println("arr1 = "+ arraylist1);

}
}
