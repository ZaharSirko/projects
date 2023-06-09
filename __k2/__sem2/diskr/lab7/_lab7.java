package __k2.__sem2.diskr.lab7;


public class _lab7 {
    public static void main(String[] args) { 
        _matrix matrix = new _matrix();
        _Graph graph1 = new _Graph(5,6);
        graph1.notOrientGraph(1,1, 5);
        graph1.notOrientGraph(2,1, 2);
        graph1.notOrientGraph(3,1, 4);
        graph1.notOrientGraph(4,5, 3);
        graph1.notOrientGraph(5,2, 3);
        graph1.notOrientGraph(6,4, 3);
        graph1.print_graph();   
        System.out.println("------Vertices-------");
        matrix.printMatrix(matrix.NotOrientExtractVertices(graph1.getMat()));
        System.out.println("------AdjacencyMatrix-------");
        matrix.printMatrix(matrix.NotOrientAdjacencyMatrix( matrix.NotOrientExtractVertices(graph1.getMat())));

        _Graph graph2 = new _Graph(4,3);
        graph2.orientGraph(1, 1, 2);
        graph2.orientGraph(2, 2, 3);
        graph2.orientGraph(3, 3, 4);
        graph2.print_graph();
        System.out.println("------Vertices-------");
        matrix.printMatrix(matrix.OrientExtractVertices(graph2.getMat()));
        System.out.println("------AdjacencyMatrix-------");
        matrix.printMatrix(matrix.orientAdjacencyMatrix( matrix.OrientExtractVertices(graph2.getMat())));
  

        
        // _Graph graph2 = new _Graph(5,6);
        // graph2.notOrientGraph(1,1, 2);
        // graph2.notOrientGraph(2,1, 3);
        // graph2.notOrientGraph(3,2, 3);
        // graph2.notOrientGraph(4,2, 4);
        // graph2.notOrientGraph(5,3, 5);
        // graph2.notOrientGraph(6,4,5);
        // graph2.print_graph();
        // System.out.println("------Vertices-------");
        // matrix.printMatrix(matrix.NotOrientExtractVertices(graph2.getMat()));
        // System.out.println("------AdjacencyMatrix-------");
        // matrix.printMatrix(matrix.NotOrientAdjacencyMatrix( matrix.NotOrientExtractVertices(graph2.getMat())));

        // _Graph graph1 = new _Graph(7,9);
        // graph1.orientGraph(1, 1, 2);
        // graph1.orientGraph(2, 1, 3);
        // graph1.orientGraph(3, 2, 3);
        // graph1.orientGraph(4, 1, 4);
        // graph1.orientGraph(5, 4, 5);
        // graph1.orientGraph(6, 5, 5);
        // graph1.orientGraph(7, 1, 6);
        // graph1.orientGraph(8, 6, 7);
        // graph1.orientGraph(9, 2, 7);
        // graph1.print_graph();   
        // System.out.println("------Vertices-------");
        // matrix.printMatrix(matrix.OrientExtractVertices(graph1.getMat()));
        // System.out.println("------AdjacencyMatrix-------");
        // matrix.printMatrix(matrix.orientAdjacencyMatrix( matrix.OrientExtractVertices(graph1.getMat())));


    }

}

