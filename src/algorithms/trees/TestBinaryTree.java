/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

public class TestBinaryTree
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
        tree.preOrder(root);
        System.out.println();
        tree.preOrderIterativeStack(root);
        System.out.println();
        
        tree.inOrder(root);
        System.out.println();
        tree.inOrderIterativeStack(root);
        System.out.println();
        
        tree.postOrder(root);
        System.out.println();
        tree.postOrderIterativeStack(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();
        System.out.println("Max element = " + tree.maxElement(root));
        System.out.println("Max element = " + tree.maxElementRecursion(root));
        tree.printAllancestors(root, 6);
        System.out.println();
        tree.printAllancestors(root, 7);
        System.out.println();
        tree.printAllancestors(root, 3);
        System.out.println();
        tree.printAllancestors(root, 4);
        System.out.println();
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
