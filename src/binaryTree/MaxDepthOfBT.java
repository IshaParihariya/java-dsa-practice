/*
104. Maximum Depth of Binary Tree
Solved
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
 
*/
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

 import java.util.LinkedList;
 import java.util.Queue;


// LEVEL ORDER TRAVERSE
class LSolution 
{
    public int maxDepth(TreeNode root) 
    {
        //no nodes 
        if(root==null)
        {
            return 0;
        }
        //only 1 node
        else if(root.right==null && root.left==null)
        {
            return 1;
        } 
        //for more than 1 node
        // HINT : number of levels in level order traversing = max. depth of the BT

        // queue interafce with LinkedList implemenntation
        Queue<TreeNode> queue=new LinkedList<>();

        //add the root in the queue
        queue.offer(root);
      
       //levels
        int level=0; //already considering the level 1 (root node)

        //while loop till queue is not empty
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
            TreeNode current=queue.poll();  // remove root from the queue

            //left
            if(current.left!=null)
            {
                queue.offer(current.left);

            }
            //right
            if(current.right!=null)
            {
                queue.offer(current.right);
            }
            }
            level=level+1;
        }
        return level;
    }
}

// RECURSIVE METHOD
class RSolution
{
    public int maxDepth(TreeNode root)
    {
        // 0 nodes
        if(root==null)
        {
            return 0;
        }
        
        
        // move left side and get the max count
        int lh=maxDepth(root.left);
        
        // for right side
        int rh=maxDepth(root.right);
        
        // max of both lh and rh plus 1
        int maxHeight=1+Math.max(lh, rh);
        
        return maxHeight;
    }
}
public class MaxDepthOfBT {
    
}
