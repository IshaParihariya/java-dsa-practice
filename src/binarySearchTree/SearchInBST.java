/*
00. Search in a Binary Search Tree

You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.


Example 1:


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Example 2:


Input: root = [4,2,7,1,3], val = 5
Output: []
 

Constraints:

The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107
*/
package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;


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
 * 
 */

//STANDARD SOLUTION 
class SolutionSIBST1 {
    public TreeNode searchBST(TreeNode root, int k) {

        while(root != null)
        {
            if(root.val == k)
            {
                return root;
            }
            else if(root.val > k)
            {
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }

        return null;
    }
}

// NO NEED TO USE QUEUE HERE BUT I TRIED USING A QUEUE
class SolutionSIBST {
    public TreeNode searchBST(TreeNode root, int k) 
    {
        // root is null

        if(root==null)
        {
            return null;
        }
        //if root is the node that we searching for

        if(root.val==k)
        {
            return root;
        }

        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
              TreeNode current=queue.poll();

              //as its a BST (L<N<R)
              //go in the right direction
              if(current.val<k && current.right!=null)
              {
                queue.add(current.right);

                TreeNode cr=current.right;

                if(cr.val==k)
                {
                    return cr;
                }
              }
              //in the left direction
              if(current.val>k && current.left!=null)
              {
                queue.add(current.left);

                TreeNode cl=current.left;

                if(cl.val==k)
                {
                    return cl;
                }
              }
        }
return null;
        
    }
}
public class SearchInBST {
    
}
