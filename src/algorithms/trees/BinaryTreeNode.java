/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.trees;

public class BinaryTreeNode<T>
{
    private T data;
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rigthNode;
    
    public BinaryTreeNode(T data)
    {
        this.data = data;
    }
    
    public BinaryTreeNode<T> left()
    {
        return leftNode;
    }
    
    public void setLeftNode(BinaryTreeNode<T> leftNode)
    {
        this.leftNode = leftNode;
    }
    
    public BinaryTreeNode<T> right()
    {
        return rigthNode;
    }
    
    public void setRigthNode(BinaryTreeNode<T> rigthNode)
    {
        this.rigthNode = rigthNode;
    }
    
    public T data()
    {
        return data;
    }
    
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
