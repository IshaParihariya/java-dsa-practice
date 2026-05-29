// preorder => root -> left -> right
// inorder => left -> root -> right
// postorder => left -> right -> root
 
// TC : O(N)
// SC : O(N) at max
/*
example tree we are taking here :

      1
     __|_________
    |            |
  __2__        __3__
 |      |     |     |
 4      5_    6     7
          |
          8
*/

package binaryTree;

// pre order traversing using recursion
class Preorder
{
    // using BinaryTreeNode from RepresentationOfBt 
    public void preorder(BinaryTreeNode root)
    {
        // if root is null i.e., NO nodes further
        /*
        When null finishes:

        preorder(null) ends

        Java goes back to:

        preorder(previous one)
        */
        if(root==null)
        {
            return;
        }
        
        //printing the root
        System.out.print(root.data +" ");
        
        // moving to the left
        preorder(root.left);
        
        // moving to the right
        preorder(root.right);
        
    }
}

// for inorder
class Inorder
{
    public void inorder(BinaryTreeNode root)
    {
        if(root==null)
        {
            return;
           
        }
        
        inorder(root.left);
        
        System.out.println(root.data+" ");
        
        inorder(root.right);
    }

}
// for postorder
class Postorder
{
    public void poorder(BinaryTreeNode root)
    {
        if(root==null)
        {
            return;
           
        }
        
        poorder(root.left);
        
        poorder(root.right);
        
        System.out.println(root.data+" ");
        
    }
}
public class DifferentTraversing
{
    public static void main(String[] args)
    {
        // tree
        BinaryTreeNode root=new BinaryTreeNode(1);
        
        root.left=new BinaryTreeNode(2);
        
        root.right=new BinaryTreeNode(3);
        
        root.left.left=new BinaryTreeNode(4);
        
        root.left.right=new BinaryTreeNode(5);
        
        root.left.right.right=new BinaryTreeNode(8);
        
        root.right.left=new BinaryTreeNode(6);
        
        root.right.right=new BinaryTreeNode(7);
        
        // object of class preorder
        Preorder obj=new Preorder();
        obj.preorder(root);
        
    }
}
