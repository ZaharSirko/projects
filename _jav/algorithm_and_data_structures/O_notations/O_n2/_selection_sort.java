package _jav.algorithm_and_data_structures.O_notations.O_n2;

public class _selection_sort {
    public static void main(String[] args) {
        int arr[] = {8,7,9,2,3,1,5,4,6};

        selectionSort(arr);

        for(int i : arr){
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] arr) {

        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j = i + 1;j<arr.length;j++){
            if(arr[min] > arr[j]){
                min = j;
            }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
        }
    }
}
