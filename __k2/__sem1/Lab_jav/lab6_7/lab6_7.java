package __k2.__sem1.Lab_jav.lab6_7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class lab6_7 {
    public static void main(String[] args) {
        composition composition1= new composition("Beethoven Moonlight 1st", 6.00, 1827, "Ludwig van Beethoven");
        composition composition2 = new composition();
        composition2.setAuthor("Wolfgang Amadeus Mozart");
        composition2.setName("Requiem, K. 626: III. Sequenz - 1. Dies irae");
        composition2.setYear(1791);
        composition2.setDuring(2);
        composition composition3 = new composition("Canzonetta Sull`aria",3.02,1786,"Wolfgang Amadeus Mozart");

        System.out.println("LinkedList");
        LinkedList<composition> list = new LinkedList<>();
        list.add(composition1);
        list.add(composition2);
        list.add(composition3);
        list.remove(composition2);
        for(composition i: list){
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("HashMap");
        HashMap<Integer,composition> hashMap = new HashMap<>();
        hashMap.put(32114, composition1);
        hashMap.put(32551, composition2);
        hashMap.put(1, composition3);
        hashMap.remove(32551);
        for(Map.Entry<Integer,composition> entry: hashMap.entrySet()){
            System.out.println(entry.toString());
        }

    }
 
}
