/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.linkedlist;

import java.util.Hashtable;

public class NthElementFromEndOfLinkedList
{
    static int counter = 0;
    
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 13; i++)
        {
            Node<Integer> eleNode = new Node<>(i);
            list.add(eleNode);
        }
        int n = 1;
        
        bruteForce(list, n);// 2O(n)
        hastTable(list, n);// O(n) +o(n) space
        OnEfficientWay(list, n);// O(n)
        recursion(list.head(), n);
        
    }
    
    private static void recursion(Node<Integer> head, int n)
    {
        if (head == null)
            return;
        recursion(head.next(), n);
        ++counter;
        if (counter == n)
        {
            System.out.println(head.value());
        }
        
    }
    
    private static void OnEfficientWay(LinkedList list, int n)
    {
        Node<Integer> nth = list.head();
        Node<Integer> temp = list.head();
        for (int i = 0; i < n; i++)
            nth = nth.next();
        while (nth != null)
        {
            nth = nth.next();
            temp = temp.next();
        }
        System.out.println(temp.value());
        
    }
    
    private static void hastTable(LinkedList list, int n)
    {
        Node<Integer> temp = list.head();
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int length = 0;
        while (temp != null)
        {
            table.put(++length, temp.value());
            temp = temp.next();
        }
        System.out.println(table.get(length - n + 1));
        
    }
    
    private static void bruteForce(LinkedList list, int n)
    {
        int number = list.size() - n;
        Node<Integer> temp = list.head();
        for (int i = 0; i < number; i++)
            temp = temp.next();
        System.out.println(temp.value());
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
