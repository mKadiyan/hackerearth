/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.graph;

public class Vertex
{
    private char label;
    private boolean isVisited;
    
    public Vertex(char label)
    {
        this.label = label;
    }
    
    public boolean isVisited()
    {
        return isVisited;
    }
    
    public void setVisited(boolean isVisited)
    {
        this.isVisited = isVisited;
    }
    
    public char getLabel()
    {
        return label;
    }
    
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
