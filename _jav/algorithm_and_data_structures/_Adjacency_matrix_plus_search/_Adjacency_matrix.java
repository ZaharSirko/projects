package _jav.algorithm_and_data_structures._Adjacency_matrix_plus_search;

public class _Adjacency_matrix {
    public static void main(String[] args) {
        _Graph graph = new _Graph(6);

        graph.addNode(new _node('Q'));
        graph.addNode(new _node('W'));
        graph.addNode(new _node('E'));
        graph.addNode(new _node('Z'));
        graph.addNode(new _node('X'));
        graph.addNode(new _node('C'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        graph.addEdge(5, 5);
        
        graph.print();

        graph.depthFirstSearch(3);


    }
}

