package __own._jav.algorithm_and_data_structures.O_notations.O_n;

public class _liner_search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,56,76};

        int index = linerSerch(array,5);

        if(index!=-1){

            System.out.println("Element index: "+index);
        }
        else{
            System.out.println("No element");

        }


    }

    private static int linerSerch(int[] array, int value) {

        for(int i = 0; i<array.length;i++){
            if(array[i]==value){
                return i;

            }
        }
        return -1;
    }
}
