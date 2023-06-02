package __k2.__sem2.diskr.lab7;

public class _lab7 {
    public static void main(String[] args) {  
        _Graph graph1 = new _Graph(6);

        _Graph graph = new _Graph(7,9);

        // graph.addNode(new _node('Q'));
        // graph.addNode(new _node('W'));
        // graph.addNode(new _node('E'));
        // graph.addNode(new _node('Z'));
        // graph.addNode(new _node('X'));
        // graph.addNode(new _node('C'));

        graph1.addEdge(0, 1);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 3);
        graph1.addEdge(2, 4);
        graph1.addEdge(4, 0);
        graph1.addEdge(4, 5);
        graph1.addEdge(5, 2);
        graph1.addEdge(5, 5);

        graph.orientGraph(1, 1, 2);
        graph.orientGraph(2, 1, 3);
        graph.orientGraph(3, 2, 3);
        graph.orientGraph(4, 1, 4);
        graph.orientGraph(5, 4, 5);
        graph.orientGraph(6, 5, 5);
        graph.orientGraph(7, 1, 6);
        graph.orientGraph(8, 6, 7);
        graph.orientGraph(9, 2, 7);
        graph.print_orient_graph();
        


        // graph.print();
    }
    

}
