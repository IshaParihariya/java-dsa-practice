
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

// this solution is // O(N^2)
// we can solve with // O(N) but i didnt understand that yet 
class SolutionDOBT
 {
    int max=0;

    public int diameterOfBinaryTree(TreeNode root)
    {

        if(root==null)
        {
            return 0;
        }


        int lh=height(root.left); // O(N)
        int rh=height(root.right);

        max=Math.max(max,lh+rh);


       diameterOfBinaryTree(root.left); // O(N)
       diameterOfBinaryTree(root.right);

       return max;
       
    }

// to get the lh and rh as 
// diamter of BT = max(lh+rh) for ech node 
    public int height(TreeNode root)
{
    if(root==null)
    {
        return 0;
    }

    int lh=height(root.left);
    int rh=height(root.right);

//return both lh and rh

    return 1 + Math.max(lh, rh);

}
}
public class DiameterOfBT {
    
}
