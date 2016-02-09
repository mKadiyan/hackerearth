/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.graph;

public class AdjacencyMatrixGraph
{
    private boolean adjMatrix[][];
    private int vertexCount;
    
    public AdjacencyMatrixGraph(int count)
    {
        this.vertexCount = count;
        this.adjMatrix = new boolean[count][count];
    }
    
    public void addEdge(int row, int column)
    {
        if (row >= 0 && row < vertexCount && column >= 0 && column < vertexCount)
        {
            adjMatrix[row][column] = true;
            adjMatrix[column][row] = true;
        }
    }
    
    public void removeEdge(int row, int column)
    {
        if (row >= 0 && row < vertexCount && column >= 0 && column < vertexCount)
        {
            adjMatrix[row][column] = false;
            adjMatrix[column][row] = false;
        }
    }
    
    public boolean isEdge(int row, int column)
    {
        if (row >= 0 && row < vertexCount && column >= 0 && column < vertexCount)
        {
            return adjMatrix[row][column];
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
        graph.addEdge(1, 2);
        graph.addEdge(4, 1);
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
                System.out.print(graph.isEdge(i, j) + " ");
            System.out.println();
        }
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
