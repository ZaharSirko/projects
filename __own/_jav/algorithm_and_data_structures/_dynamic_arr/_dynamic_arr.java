package __own._jav.algorithm_and_data_structures._dynamic_arr;

public class _dynamic_arr {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("B");
        dynamicArray.delete("A");
        dynamicArray.delete("F");
        // dynamicArray.insert(0, "G");
        // dynamicArray.delete("B");
        // System.out.println(dynamicArray.search("D"));


        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);
        System.out.println("capacity: "+dynamicArray.capacity);
        System.out.println("empty: "+dynamicArray.isEmpty());
    }
}
