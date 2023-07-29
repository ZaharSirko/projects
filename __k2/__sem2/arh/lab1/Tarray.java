package __k2.__sem2.arh.lab1;

public class Tarray <T > {
    T[] arr;
    int index;
    public Tarray(int size) {
        arr = (T[]) new Object[size];
    }
    public Tarray(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }
    public void add(T element) {
        arr[index] = element;
        index++;
    }
    public void delete(T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(element)) {
                arr[i] = null;
                break;
            }
        }
    }
    public void sort() {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    private int compare(T a, T b) {
        if (a == null && b == null) {
            return 0;
        } else if (a == null) {
            return -1;
        } else if (b == null) {
            return 1;
        } else {
            return ((Comparable<T>) a).compareTo(b);
        }
    }
    public T getMaxElement() {
        T max = null;
        for (T element : arr) {
            if (element != null && (max == null || ((Comparable<T>) element).compareTo(max) > 0)) {
                max = element;
            }
        }
        return max;
    }


    
    public void printTArr(){
      for (T element : arr) {
        System.out.println(element);
      }
    }
}
