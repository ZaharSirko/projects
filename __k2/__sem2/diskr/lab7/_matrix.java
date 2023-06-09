package __k2.__sem2.diskr.lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _matrix {
public int[][] OrientExtractVertices(int[][] orientArr) {
    int numRows = orientArr.length;
    int numCols = orientArr[0].length;
    int[][] result = new int[numCols-1][2];
    
    for (int j = 0; j < numCols; j++) { 
        int rowIndex = 0;
        for (int i = 0; i < numRows; i++) {
            if (orientArr[i][j] != 0) {
                if (orientArr[i][j] == 2) {
                    result[j-1][rowIndex] = i;
                    rowIndex++;
                }
                result[j-1][rowIndex] = i;
                rowIndex++;
            }
        }
    }
    return result;
}
public  int[][] orientAdjacencyMatrix(int[][] inputMatrix) {
    Set<Integer> vertices = new HashSet<>();
    for (int[] edge : inputMatrix) {
        vertices.add(edge[0]);
        vertices.add(edge[1]);
    }

    int numVertices = vertices.size();
    int[][] matrix = new int[numVertices][numVertices];

    Map<Integer, Integer> vertexIndexMap = new HashMap<>();
    int index = 0;
    for (int vertex : vertices) {
        vertexIndexMap.put(vertex, index);
        index++;
    }

    for (int[] edge : inputMatrix) {
        int from = vertexIndexMap.get(edge[0]);
        int to = vertexIndexMap.get(edge[1]);
        matrix[from][to] = 1;
    }

    return matrix;
}

public  int[][] NotOrientExtractVertices(int[][] matrix) {
    List<int[]> vertexList = new ArrayList<>();
    int numVertices = matrix.length;

    for (int i = 0; i < numVertices; i++) {
        for (int j = i + 1; j < numVertices; j++) {
            if (matrix[i][j] == 1) {
                int[] vertex = {i + 1, j + 1};
                vertexList.add(vertex);
            }
        }
    }

    int[][] vertices = new int[vertexList.size()][2];
    for (int i = 0; i < vertexList.size(); i++) {
        vertices[i] = vertexList.get(i);
    }

    return vertices;
}

public  int[][] NotOrientAdjacencyMatrix(int[][] inputMatrix) {
    Set<Integer> vertices = new HashSet<>();
    for (int[] edge : inputMatrix) {
        vertices.add(edge[0]);
        vertices.add(edge[1]);
    }

    int numVertices = vertices.size();
    int[][] matrix = new int[numVertices][numVertices];

    Map<Integer, Integer> vertexIndexMap = new HashMap<>();
    int index = 0;
    for (int vertex : vertices) {
        vertexIndexMap.put(vertex, index);
        index++;
    }

    for (int[] edge : inputMatrix) {
        int from = vertexIndexMap.get(edge[0]);
        int to = vertexIndexMap.get(edge[1]);
        matrix[from][to] = 1;
        matrix[to][from] = 1;
    }

    return matrix;
}
public  void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
}
