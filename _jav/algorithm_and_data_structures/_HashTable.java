package _jav.algorithm_and_data_structures;

import java.util.Hashtable;

public class _HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>(10); // to avoid collision of hashtable increase size

        table.put(100, "Q");
        table.put(123, "W");
        table.put(444, "E");
        table.put(300, "Z");
        table.put(321, "X");
        table.put(222, "C");

        // table.remove(222);

        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 +" | "+key+" | "+table.get(key)+" |");
        }

    }
}
