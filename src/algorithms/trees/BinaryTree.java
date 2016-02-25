/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree<T>
{
    BinaryTreeNode<T> root;
    
    public BinaryTree(BinaryTreeNode<T> root)
    {
        this.root = root;
    }
    
    BinaryTreeNode<Integer> addBST(BinaryTreeNode<Integer> root, int t)
    {
        if (root == null)
            return new BinaryTreeNode<>(t);
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            BinaryTreeNode<Integer> pop = stack.pop();
            if (pop.data() > t)
            {
                if (pop.left() != null)
                    stack.push(pop.left());
                else
                    pop.setLeftNode(new BinaryTreeNode(t));
            }
            else
            {
                if (pop.right() != null)
                    stack.push(pop.right());
                else
                    pop.setRigthNode(new BinaryTreeNode(t));
            }
        }
        return root;
    }
    
    void preOrder(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            System.out.print(root.data() + " ");
            preOrder(root.left());
            preOrder(root.right());
        }
    }
    
    void preOrderIterativeStack(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            Stack<BinaryTreeNode<T>> treeStack = new Stack<>();
            treeStack.push(root);
            while (!treeStack.isEmpty())
            {
                BinaryTreeNode<T> pop = treeStack.pop();
                System.out.print(pop.data() + " ");
                if (pop.right() != null)
                    treeStack.push(pop.right());
                if (pop.left() != null)
                    treeStack.push(pop.left());
            }
        }
    }
    
    void inOrder(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            inOrder(root.left());
            System.out.print(root.data() + " ");
            inOrder(root.right());
        }
    }
    
    void inOrderIterativeStack(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            Stack<BinaryTreeNode<T>> treeStack = new Stack<>();
            BinaryTreeNode<T> currNode = root;
            boolean isDone = false;
            while (!isDone)
            {
                if (currNode != null)
                {
                    treeStack.push(currNode);
                    currNode = currNode.left();
                }
                else
                {
                    if (treeStack.isEmpty())
                        isDone = true;
                    else
                    {
                        currNode = treeStack.pop();
                        System.out.print(currNode.data() + " ");
                        currNode = currNode.right();
                    }
                    
                }
                
            }
        }
    }
    
    void postOrder(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            postOrder(root.left());
            postOrder(root.right());
            System.out.print(root.data() + " ");
        }
    }
    
    void postOrderIterativeStack(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            Stack<BinaryTreeNode<T>> treeStack = new Stack<>();
            treeStack.push(root);
            BinaryTreeNode<T> prev = null;
            while (!treeStack.isEmpty())
            {
                BinaryTreeNode<T> curr = treeStack.peek();
                if (prev == null || prev.left() == curr || prev.right() == curr)
                {
                    if (curr.left() != null)
                        treeStack.push(curr.left());
                    else if (curr.right() != null)
                        treeStack.push(curr.right());
                }
                else if (curr.left() == prev)
                {
                    if (curr.right() != null)
                        treeStack.push(curr.right());
                }
                else
                {
                    System.out.print(curr.data() + " ");
                    treeStack.pop();
                }
                prev = curr;
                
            }
        }
    }
    
    void levelOrder(BinaryTreeNode<T> root)
    {
        if (root != null)
        {
            Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);
            while (!queue.isEmpty())
            {
                BinaryTreeNode<T> poll = queue.poll();
                if (poll != null)
                {
                    System.out.print(poll.data() + " ");
                    if (poll.left() != null)
                        queue.offer(poll.left());
                    if (poll.right() != null)
                        queue.offer(poll.right());
                }
                else
                {
                    if (!queue.isEmpty())
                        queue.offer(null);
                }
            }
        }
    }
    
    int maxElementRecursion(BinaryTreeNode<T> root)
    {
        int max = -1;
        if (root != null)
        {
            
            int leftMax = maxElementRecursion(root.left());
            int rightMax = maxElementRecursion(root.right());
            if (leftMax > rightMax)
                max = leftMax;
            else
                max = rightMax;
            if (root.data() instanceof Integer && (Integer) root.data() > max)
                max = (Integer) root.data();
        }
        return max;
    }
    
    int maxElement(BinaryTreeNode<T> root)
    {
        int max = -1;
        if (root != null)
        {
            int max1 = maxElement(root.left());
            int max2 = maxElement(root.right());
            if (max1 > max2)
                max = max1;
            else
                max = max2;
            if ((Integer) root.data() > max)
                max = (Integer) root.data();
        }
        return max;
    }
    
    int maxElementWithoutRecurssion(BinaryTreeNode<T> root)
    {
        int max = -1;
        Queue<BinaryTreeNode<T>> queue = new LinkedBlockingQueue<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            BinaryTreeNode<T> poll = queue.poll();
            
            if ((Integer) poll.data() > max)
                max = (Integer) poll.data();
            if (root.left() != null)
                queue.offer(root.left());
            
            if (root.right() != null)
                queue.offer(root.right());
        }
        return max;
    }
    
    boolean printAllancestors(BinaryTreeNode<T> root, int data)
    {
        if (root == null)
            return false;
        if ((root.left() != null && (int) (Integer) root.left().data() == data) || (root.right() != null && (int) (Integer) root.right().data() == data)
            || printAllancestors(root.left(), data) || printAllancestors(root.right(), data))
        {
            System.out.print(root.data() + " ");
            return true;
        }
        return false;
    }
    
    static int height(BinaryTreeNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;
        
        /*
         * If tree is not empty then height = 1 + max of left
         * height and right heights
         */
        return (1 + Math.max(height(node.left()), height(node.right())));
    }

    /* Method to calculate the diameter and return it to main */
    int diameter(BinaryTreeNode root)
    {
        /* base case if tree is empty */
        if (root == null)
            return 0;
        
        /* get the height of left and right sub trees */
        int lheight = height(root.left());
        int rheight = height(root.right());
        
        /* get the diameter of left and right subtrees */
        int ldiameter = diameter(root.left());
        int rdiameter = diameter(root.right());
        
        /*
         * Return max of following three
         * 1) Diameter of left subtree
         * 2) Diameter of right subtree
         * 3) Height of left subtree + height of right subtree + 1
         */
        return Math.max(lheight + rheight + 1,
            Math.max(ldiameter, rdiameter));
        
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
