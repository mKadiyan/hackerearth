/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

public class ExpressionTree
{
    public static void main(String[] args)
    {
        BinaryTreeNode<String> root = new BinaryTreeNode<>("/");
        BinaryTreeNode<String> fleft = new BinaryTreeNode<>("+");
        BinaryTreeNode<String> fright = new BinaryTreeNode<>("D");
        root.setLeftNode(fleft);
        root.setRigthNode(fright);
        BinaryTreeNode<String> rightNode = new BinaryTreeNode<String>("*");
        fleft.setLeftNode(new BinaryTreeNode<String>("A"));
        fleft.setRigthNode(rightNode);
        rightNode.setLeftNode(new BinaryTreeNode<String>("B"));
        rightNode.setRigthNode(new BinaryTreeNode<String>("C"));
        
        BinaryTree<String> tree = new BinaryTree<>(root);
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
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
