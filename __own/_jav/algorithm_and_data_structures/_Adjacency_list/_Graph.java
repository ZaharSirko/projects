package __own._jav.algorithm_and_data_structures._Adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class _Graph {
    ArrayList<LinkedList<_node>> alist;
    _Graph(){
        alist = new ArrayList<>();
    }
    public void addNode(_node node){
        LinkedList<_node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }
    public void addEdge(int src,int dst){
        LinkedList<_node> currentList = alist.get(src);
        _node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);

    }
    public boolean checkEdge(int src,int dst){
        LinkedList<_node> currentList = alist.get(src);
        _node dstNode = alist.get(dst).get(0);
        for(_node node : currentList){
            if(node == dstNode){
                return true;
            } 
        }
        return false;
    }
    public void print(){
        for(LinkedList<_node> currentList : alist ){
            for(_node node : currentList){
                 System.out.print(node.data+" -> ");
            }
            System.out.println();
        }

    }
}
