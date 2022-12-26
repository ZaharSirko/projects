import java.util.HashSet;
import java.util.Set;

public class lab_5 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // ініціалізація set
        set.add(1); // додаємо елементи
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set); // виводим set
        System.out.println(set.contains(4)); // шукаємо елемент 4
        System.out.println(set.contains(10));  // шукаємо елемент 10
        set.remove(1); // видялаємо елементи
        set.remove(3);
        set.remove(5);
        System.out.println(set);// виводим set

        Set<Integer> set2 = new HashSet<>(); // ініціалізація set2
        set2.add(7);  // додаємо елементи
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);
        set2.add(12);
        System.out.println(set==set2); // порівнюємо множини
    }
}
