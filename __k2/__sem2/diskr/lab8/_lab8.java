package __k2.__sem2.diskr.lab8;

import java.text.DecimalFormat;

import __own._jav.algorithm_and_data_structures.O_notations.O_log_n._binary_Search;

public class _lab8 {
    public static void main(String[] args) {
    double[][] A = d2Array(5);
    double[][] B = d2Array(17);
    double[][] C = intersectionUnion(A,B);
    System.out.println("---A---");
    print2DArray(A);
    System.out.println("---B---");
    print2DArray(B);
    System.out.println("---C---");
    print2DArray(C);

    }

    public static double[][] d2Array(int core){
        int[] u = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double[][] A = new double[u.length][2];
        int index = _binary_Search.binarySearch(u, core);

        if (index >= 1) {
            A[index - 1][1] = 1;
            A[index - 1][0] = u[index - 1];
        }
        if (index <= 19) {
            A[index + 1][1] = 1;
            A[index + 1][0] = u[index + 1]; 
        }

        A[index][1] = 1;
        A[index][0] = u[index];
        
        double value = 1.0;
        int i = index + 2;
        while (i < A.length ) {
            if(value > 0){
                A[i][1] =  value;
                A[i][0] = u[i];
                value -= 0.2;
            }
            A[i][0] = u[i];
            i++;
        }
        value = 1.0;
        i = index - 2;
        while (i >= 0) {
            if(value > 0){
                A[i][1] =  value;
                A[i][0] = u[i];
                value -= 0.2;
            }
            A[i][0] = u[i];
            i--;
        }
        return A;
    }
    public static double[][] intersectionUnion(double[][] A, double[][] B) {
        int maxLength = Math.max(A.length, B.length);
        double[][] C = new double[maxLength][2];
    
       
        for (int i = 0; i < A.length; i++) {
            C[i][0] = A[i][0];
            C[i][1] = Math.min(A[i][1], B[i][1]);
        }
    
        for (int i = A.length; i < B.length; i++) {
            C[i][0] = B[i][0];
            C[i][1] = B[i][1];
        }
    
        return C;
    }
    public static void print2DArray(double[][] A) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i][0] + " " + decimalFormat.format(A[i][1]));
        }
}
}
