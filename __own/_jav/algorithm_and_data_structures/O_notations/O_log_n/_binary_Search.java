package __own._jav.algorithm_and_data_structures.O_notations.O_log_n;

// import java.util.Arrays;

public class _binary_Search {
    public static void main(String[] args) {
        int arr[] = new int[10000000];
        int target = 43222;

        for (int i = 0;i <arr.length;i++){
            arr[i] = i;
        }
        // int index = Arrays.binarySearch(arr, target);
        int index = binarySearch(arr, target);

        if(index == -1){
            System.out.println(target + "Element not fount");
        }
        else{
            System.out.println("Element found at: "+index);
        }
    }

    private static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int middle = low + (high - low) /2;
            int value = arr[middle];

            System.out.println("Middle " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; // target found

        }


        return -1; // target not  found

    }
}
