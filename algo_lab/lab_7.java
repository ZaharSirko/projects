public class lab_7 {
    public static void main(String[] args) {
        int[] arr = {4,6};
        factorial(arr);
    }
    private static void factorial(int[] arr) {
            long fact = 1;
            int j=0;
            long sum_fact = 0;
            while(j<arr.length){
                for (long i = 2; i <= arr[j]; i++) {
                    fact *= i;
                }
                j++;
                sum_fact += fact;
                fact = 1;
            }
            System.out.println(sum_fact);
    }
}
