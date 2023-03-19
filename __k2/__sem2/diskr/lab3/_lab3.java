package __k2.__sem2.diskr.lab3;

public class _lab3 {
    public static void main(String[] args) {
        int[][] booleanMatrix = {
           { 1,  1,  1,  0,  1},
           { 0,  1,  1,  0 , 0},
           { 0,  0,  1,  0,  0},
           { 0,  0,  1,  1 , 1},
           { 1,  1,  0,  0,  1}
            };
            System.out.println(isReflexive(booleanMatrix));
            System.out.println(isAntiReflexive(booleanMatrix));
            System.out.println(isSymmetrical(booleanMatrix));
            System.out.println(isAntiSymmetrical(booleanMatrix));
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
                if((booleanMatrix[i][j] != booleanMatrix[j][i]) ) return true;  
            }
            
           }
        return false;
            
}
}
