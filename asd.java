import java.util.Arrays;


public class asd {
    public static void main(String[] args) {
    int[] asd = {3,1,3,4,2};
    System.out.println(zeroAtEnd(asd));
  }
    
    public static int zeroAtEnd(int[]nums) {
      int dup = 0;
      Arrays.sort(nums);
      for (int q = 0; q < nums.length-1; q++) {
      if(nums[q]==nums[q+1]){
         dup= nums[q] ;
        }
      }
      return dup;
    }
  }


        
   

