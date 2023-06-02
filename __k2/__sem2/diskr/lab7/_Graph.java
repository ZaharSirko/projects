package __k2.__sem2.diskr.lab7;

import java.util.ArrayList;

public class _Graph {
    ArrayList<_node> nodes;
    int Number=1;
    int[][] matrix;
    int[][] matrix2;

    _Graph(int rows, int columns){
        matrix2 = new int[rows+1][columns+1];
    }
    _Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int [size][size];
    }
    public void addNode(_node node){
    nodes.add(node);
    }
    public void addEdge(int src,int dst){
        matrix[src][dst] = 1;
    }
    public void orientGraph(int edge,int src,int dst){
        matrix2[src][edge] = -1;
        matrix2[dst][edge] = 1;
        if(src==dst){
            matrix2[src][edge] = 2;
        }

    }
    public void printNumber(){
        System.out.println(Number);
    }
public void print_orient_graph(){
    for(int i =1;i<matrix2.length;i++){
        for(int j =1;j<matrix2[i].length;j++){
            if(matrix2[i][j]==-1){
                System.out.print(matrix2[i][j]+" ");
            }
            else{
                System.out.print(" "+matrix2[i][j]+" ");
            }
        }
        System.out.println();
    }
}

    // public void print(){
    //     System.out.print("  ");
    //     for(_node node : nodes){
    //         System.out.print(node.data+" ");
    //     }
    //     System.out.println();
    //     for(int i =0;i<matrix.length;i++){
    //         System.out.print(nodes.get(i).data+" ");
    //         for(int j =0;j<matrix[i].length;j++){
    //             System.out.print(matrix[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}
