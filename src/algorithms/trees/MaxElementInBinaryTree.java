/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

public class MaxElementInBinaryTree
{
    
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> fleft = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> fright = new BinaryTreeNode<Integer>(3);
        root.setLeftNode(fleft);
        root.setRigthNode(fright);
        fleft.setLeftNode(new BinaryTreeNode<Integer>(4));
        fleft.setRigthNode(new BinaryTreeNode<Integer>(5));
        
        fright.setLeftNode(new BinaryTreeNode<Integer>(6));
        fright.setRigthNode(new BinaryTreeNode<Integer>(7));
        
        System.out.println(maxElementRecursion(root));
        System.out.println(maxElementWithoutRecursion(root));
        
    }
    
    private static int maxElementWithoutRecursion(BinaryTreeNode<Integer> root)
    {
        return -1;
    }
    
    private static int maxElementRecursion(BinaryTreeNode<Integer> root)
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
            if (root.data() > max)
                max = root.data();
        }
        return max;
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
