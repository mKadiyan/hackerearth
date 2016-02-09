/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.linkedlist;

public class LinkedList
{
    private int length = 0;
    private Node<Integer> first;
    
    void add(Node<Integer> element)
    {
        Node<Integer> head = first;
        if (first == null)
            first = element;
        else
        {
            while (head.next() != null)
            {
                head = head.next();
            }
            head.setNext(element);
        }
        length++;
    }
    
    Node<Integer> head()
    {
        return first;
    }
    
    void display(Node<Integer> head)
    {
        System.out.print("[ ");
        while (head != null)
        {
            System.out.print(head.value() + " ");
            head = head.next();
        }
        System.out.println("]");
    }
    
    public Node<Integer> reverse(Node<Integer> head)
    {
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        
        while (temp != null)
        {
            Node<Integer> next = temp.next();
            temp.setNext(prev);
            prev = temp;
            temp = next;
            
        }
        return prev;
    }
    
    int size()
    {
        return length;
    }
    
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
