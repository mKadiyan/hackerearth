/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.graph;

public class TestGraph
{
    public static void main(String[] args)
    {
        Graph graph = new Graph(8);
        for (int i = 0; i < 8; i++)
            graph.addVertex((char) ('A' + i));
        
        graph.addEdge(0, 1);// A-B
        graph.addEdge(1, 2);// B-C
        graph.addEdge(1, 7);// B-H
        graph.addEdge(2, 3);// C-D
        graph.addEdge(2, 4);// C-E
        graph.addEdge(7, 4);// H-E
        graph.addEdge(4, 5);// E-F
        graph.addEdge(4, 6);// E-G
        
        graph.dfs();
        System.out.println();
        graph.bfs();
        System.out.println();
        graph.dijkstra(0);
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
