/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

public class TestBinarySearchTree
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(8);
        BinaryTree<Integer> bst = new BinaryTree<>(root);
        bst.addBST(root, 4);
        bst.addBST(root, 2);
        bst.addBST(root, 6);
        bst.addBST(root, 12);
        bst.addBST(root, 11);
        bst.addBST(root, 14);
        
        bst.addBST(root, 1);
        bst.addBST(root, 3);
        bst.addBST(root, 5);
        bst.addBST(root, 7);
        bst.addBST(root, 9);
        bst.addBST(root, 10);
        bst.addBST(root, 13);
        bst.addBST(root, 15);
        
        bst.preOrder(root);
        System.out.println();
        bst.inOrder(root);
        System.out.println();
        bst.postOrder(root);
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
