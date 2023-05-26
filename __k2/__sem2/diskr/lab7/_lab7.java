package __k2.__sem2.diskr.lab7;

public class _lab7 {
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
    }
    

}
