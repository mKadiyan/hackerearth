/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.linkedlist;

public class Node<T>
{
    private T value = null;
    private Node<T> next = null;
    
    public Node(T t)
    {
        value = t;
    }
    
    public T value()
    {
        return value;
    }
    
    public Node<T> next()
    {
        return next;
    }
    
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
