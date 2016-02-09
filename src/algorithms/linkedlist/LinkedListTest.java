/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.linkedlist;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.add(new Node<Integer>(1));
        ll.add(new Node<Integer>(2));
        ll.add(new Node<Integer>(3));
        ll.add(new Node<Integer>(4));
        ll.add(new Node<Integer>(5));
        ll.add(new Node<Integer>(6));
        
        ll.display(ll.head());
        ll.display(ll.reverse(ll.head()));
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
