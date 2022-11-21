import java.util.HashSet;
import java.util.Set;

public class lab_5 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);
        for (Integer s : set) {
            if(s.equals(4)){
                System.out.println(true);
            }
            if(s.equals(10)){
                System.out.println(false);
            }
        }
        set.remove(1);
        set.remove(3);
        set.remove(5);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);
        set2.add(12);

        if(set==set2) System.out.println(true);
        else System.out.println(false);
    }
}
