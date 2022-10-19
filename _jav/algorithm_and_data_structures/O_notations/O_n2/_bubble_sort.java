package _jav.algorithm_and_data_structures.O_notations.O_n2;

public class _bubble_sort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int temp;

        for(int i= 0;i<length-1;i++){
            for(int j=length-1;j>i;j--){
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1] =array[j];
                    array[j] = temp ;
                    }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
