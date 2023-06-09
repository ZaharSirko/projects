package __k2.__sem2.diskr.lab7;

public class _Graph {
    int[][] matrix;
    _Graph(){
       
    }
    _Graph(int rows, int columns){
        matrix = new int[rows+1][columns+1];

    }

    public void notOrientGraph(int edge,int src,int dst){
        matrix[src][edge] = 1;
        matrix[dst][edge] = 1;
    }
    public void orientGraph(int edge,int src,int dst){
        matrix[src][edge] = -1;
        matrix[dst][edge] = 1;
        if(src==dst){
            matrix[src][edge] = 2;
        }
    }
    int[][] getMat(){
        return matrix;
    }
public void print_graph(){
    System.out.println("\nGraph");
    for(int i =1;i<matrix.length;i++){
        for(int j =1;j<matrix[i].length;j++){
            if(matrix[i][j]==-1){
                System.out.print(matrix[i][j]+" ");
            }
            else{
                System.out.print(" "+matrix[i][j]+" ");
            }
        }
        System.out.println();
    }
}

}
