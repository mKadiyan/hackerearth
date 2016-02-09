/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Graph
{
    private int maxVertices;
    private int adjMatrix[][];
    private int vertexCount;
    private Vertex[] vertexList;
    
    public Graph(int maxVertices)
    {
        this.maxVertices = maxVertices;
        this.vertexList = new Vertex[maxVertices];
        this.adjMatrix = new int[maxVertices][maxVertices];
    }
    
    public int getMaxVertices()
    {
        return maxVertices;
    }
    
    public void addVertex(char label)
    {
        vertexList[vertexCount++] = new Vertex(label);
    }
    
    public void addEdge(int start, int end)
    {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }
    
    public void addEdge(int start, int end, int distance)
    {
        adjMatrix[start][end] = distance;
    }
    
    public void displayVertex(int v)
    {
        System.out.print(vertexList[v].getLabel() + " ");
    }
    
    public void dfs()
    {
        Stack<Integer> theStack = new Stack<>();
        vertexList[0].setVisited(true);
        displayVertex(0);
        theStack.push(0);
        while (!theStack.isEmpty())
        {
            // get unvisited vertex adjacent to stack top
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1)
                theStack.pop();
            else
            {
                vertexList[v].setVisited(true);
                displayVertex(v);
                theStack.push(v);
            }
        }
        for (int j = 0; j < vertexCount; j++)
            vertexList[j].setVisited(false);
    }
    
    public void bfs()
    {
        Queue<Integer> theQueue = new LinkedBlockingQueue<>();
        vertexList[0].setVisited(true);
        displayVertex(0);
        theQueue.offer(0);
        while (!theQueue.isEmpty())
        {
            // get unvisited vertex adjacent to stack top
            int v = getAdjUnvisitedVertex(theQueue.peek());
            if (v == -1)
                theQueue.poll();
            else
            {
                vertexList[v].setVisited(true);
                displayVertex(v);
                theQueue.offer(v);
            }
        }
        for (int j = 0; j < vertexCount; j++)
            vertexList[j].setVisited(false);
    }
    
    public void dijkstra(int source)
    {
        Queue<Integer> pq = new PriorityQueue<>();
        int v;
        pq.offer(source);
        int[] distance = new int[vertexCount];
        int[] path = new int[vertexCount];
        for (int i = 0; i < distance.length; i++)
        {
            distance[i] = -1;
            path[i] = -1;
        }
        distance[source] = 0;
        
        while (!pq.isEmpty())
        {
            v = pq.poll();
            List<Integer> allAdjacentVertices = getAllAdjacentVertices(v);
            for (Integer w : allAdjacentVertices)
            {
                int d = distance[v] + adjMatrix[v][w];
                if (distance[w] == -1)
                {
                    distance[w] = d;
                    pq.offer(d);
                    path[w] = v;
                }
                if (distance[w] > d)
                {
                    distance[w] = d;
                    pq.offer(d);
                    path[w] = v;
                }
            }
            
        }
        
    }
    
    private int getAdjUnvisitedVertex(Integer v)
    {
        for (int i = 0; i < vertexCount; i++)
            if (adjMatrix[v][i] == 1 && !vertexList[i].isVisited())
                return i;
        return -1;
    }
    
    private List<Integer> getAllAdjacentVertices(int s)
    {
        List<Integer> ad = new ArrayList<Integer>();
        for (int i = 0; i < vertexCount; i++)
            if (adjMatrix[s][i] != 0)
                ad.add(i);
        return ad;
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
