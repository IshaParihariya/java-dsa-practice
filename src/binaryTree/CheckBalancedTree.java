// check if a binary tree is balanced or not
// left height - right height < = 1

package binaryTree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public boolean isBalanced(TreeNode root) 
    {
        // if root is null then balanced binary tree
       if(root==null)
        {
            return true;
        }

       int lh=height(root.left);
       int rh=height(root.right);

       if(Math.abs(lh-rh)>1)
       {
        return false;
       }

       //checking for both the nodes on the left and right as well
       return isBalanced(root.left) && isBalanced(root.right);
    }
    //for finding height of the tree 
    public int height(TreeNode root)
    {
        // this is where recursion will stop 
        /*
        lets say we are having this tree 
        _1_
        |  |
        2  3
        so when we will reach at 2.left or right or 3.left or right we are not having anything further so it will stop here and will calcuate the height 
        */
        if(root==null)
        {
            return 0;
        }

        int lheight=height(root.left);
        int rheight=height(root.right);

        //choose max 
        return Math.max(lheight,rheight)+1;
    }
}
public class CheckBalancedTree {
    
}
