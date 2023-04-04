package __k2.__sem2.diskr.lab3;

import java.util.Scanner;

public class _lab3 {
    public static void main(String[] args) {
        int[][] booleanMatrix = {
           { 1,  1,  1,  0,  1},
           { 0,  1,  1,  0 , 0},
           { 0,  0,  1,  0,  0},
           { 0,  0,  1,  1 , 1},
           { 1,  1,  0,  0,  1}
            };
            for (int i = 0; i < booleanMatrix.length; i++) {
                for (int j = 0; j < booleanMatrix.length; j++) {
                    System.out.print(booleanMatrix[i][j]+" ");
                }
                System.out.println();
            }
     System.out.println("\n1. isReflexive\n2. isAntiReflexive\n3. isSymmetrical\n4. isAntiSymmetrical\n0. Exit");
     Scanner scanner = new Scanner(System.in);
     int choice;
     do {
        choice  =scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println(isReflexive(booleanMatrix));
                break;
                case 2:
                System.out.println(isAntiReflexive(booleanMatrix));
                   break;
                case 3:
                System.out.println(isSymmetrical(booleanMatrix));
                     break;
                case 4:
                System.out.println(isAntiSymmetrical(booleanMatrix));
                    break;
                case 0:
                    System.out.println("Exit");
                       break;
        
            default:
            System.out.println("Input number 0-4");
            scanner.close();
        }
     } while (choice!=0 && choice<4);
    }
    public static boolean isReflexive(int[][] booleanMatrix){
     for (int i = 0; i < booleanMatrix.length; i++) {
        for (int j = 0; j < booleanMatrix.length; j++) {
            if((i==j)&&(booleanMatrix[i][j]==0)) return false;  
        }
     }
    return true;
    }

    public static boolean isAntiReflexive(int[][] booleanMatrix){
        for (int i = 0; i < booleanMatrix.length; i++) {
           for (int j = 0; j < booleanMatrix.length; j++) {
               if((i==j)&&(booleanMatrix[i][j]==1)) return false;  
           }
        }
       return true;
       }
       
       public static boolean isSymmetrical(int[][] booleanMatrix){
        for (int i = 0; i < booleanMatrix.length; i++) {
           for (int j = 0; j < booleanMatrix.length; j++) {
            if((booleanMatrix[i][j] != booleanMatrix[j][i]) ) return false;  
        }
       }
        return true;
}
        public static boolean isAntiSymmetrical(int[][] booleanMatrix){
          for (int i = 0; i < booleanMatrix.length; i++) {
             for (int j = 0; j < booleanMatrix.length; j++) {
                if((booleanMatrix[i][j] == booleanMatrix[j][i])  &&(i!=j)) return false;  
            }
           }
        return true; 
}
}
