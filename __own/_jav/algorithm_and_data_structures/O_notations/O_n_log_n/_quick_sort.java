package __own._jav.algorithm_and_data_structures.O_notations.O_n_log_n;

public class _quick_sort {
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,4,7,6,1};
        quickSort(arr,0,arr.length-1);
    
        for(int i : arr){
            System.out.print(i+" ");
    
        }
       
}

private static void quickSort(int[] array,int start,int end) {
        if(end<=start) return;
        int pivot = partitions(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }
    private static int partitions(int[] array,int start,int end) {
        int pivot =array[end];
        int i = start -1;
        for(int j = start;j<=end-1;j++){
            if(array[j]<pivot){ 
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
