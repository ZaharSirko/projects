package __own._jav.algorithm_and_data_structures.O_notations.O_n_log_n;

public class _merge_sort {
   public static void main(String[] args) {
    int[] arr = {8,2,5,3,4,7,6,1};
    mergeSort(arr);

    for(int i=0;i< arr.length;i++){
        System.out.print(arr[i]+" ");

    }
   }
   private static void mergeSort(int[] array){

    int length = array.length;
    if(length<=1) return;

    int middle = length/2; 
    int[] left_array = new int[middle];
    int[] right_array = new int[length-middle];
    
    int i = 0; // left
    int j = 0; //right
    for(;i<length;i++){

        if(i<middle){
            left_array[i] = array[i];
        }
        else{
            right_array[j] = array[i];
            j++;
        }
    }
    mergeSort(left_array);
    mergeSort(right_array);
    merge(left_array, right_array, array);
}

public static void merge(int[] left_array,int[] right_array,int[] array){
    int left_size = array.length/2;
    int right_size = array.length - left_size;
    int i = 0 , l = 0, r = 0;

    while(l<left_size && r<right_size){
        if(left_array[l]<right_array[r]){
            array[i] = left_array[l];
            i++;
            l++;
        }
        else{
            array[i] = right_array[r];
            i++;
            r++;
        }

    }
    while(l < left_size){
        array[i] = left_array[l];
        i++;
        l++; 
    }
    while(r < right_size){
        array[i] = right_array[r];
        i++;
        r++; 
    }


}
 
}

