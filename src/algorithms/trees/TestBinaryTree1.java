/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

public class TestBinaryTree1
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> fleft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> fright = new BinaryTreeNode<Integer>(3);
        root.setLeftNode(fleft);
        root.setRigthNode(fright);
        fleft.setLeftNode(new BinaryTreeNode<Integer>(4));
        fleft.setRigthNode(new BinaryTreeNode<Integer>(5));
        
        fright.setLeftNode(new BinaryTreeNode<Integer>(6));
        fright.setRigthNode(new BinaryTreeNode<Integer>(7));
        
        BinaryTree<Integer> tree = new BinaryTree<>(root);
        System.out.println(tree.diameter(root));
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
