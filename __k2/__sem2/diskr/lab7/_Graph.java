package __k2.__sem2.diskr.lab7;

import java.util.ArrayList;

public class _Graph {
    ArrayList<_node> nodes;

    int[][] matrix;

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
    public boolean checkEdge(int src,int dst){
        if(matrix[src][dst] ==1){
            return true;
        }
        else{
            return false;
        }
    }
    public void print(){
        System.out.print("  ");
        for(_node node : nodes){
            System.out.print(node.data+" ");
        }
        System.out.println();
        for(int i =0;i<matrix.length;i++){
            System.out.print(nodes.get(i).data+" ");
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
