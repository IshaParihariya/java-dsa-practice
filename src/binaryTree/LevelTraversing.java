// level traversing
// using  a queue and linked list here (optimised)
// can be done using recursion but NOT OPTIMMISED

package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class LevelTraversingBT
{
    public ArrayList<Integer> levelTraversing(BinaryTreeNode root)
    {
        // queue
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        
        // ArrayList to store the data of node
        ArrayList<Integer> list=new ArrayList<>();
        
        // adding root in the queue
        queue.offer(root);
        
        //while loop till queue is not empty
        while(!queue.isEmpty())
                {
                    //remove from queue and 
                    // add in the list
                    BinaryTreeNode current =queue.poll();
                    
                    list.add(current.data);
                    
                    //if left child exists, add to queue
                    
                    if(current.left!=null)
                    {
                        queue.offer(current.left);
                    }
                    //for right
                    if(current.right!=null)
                    {
                        queue.offer(current.right);
                    }
                    
                }
        return list;
    }
}
public class LevelTraversing 
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
        
        //object of the class for level traversing
        LevelTraversingBT obj=new LevelTraversingBT();
        ArrayList<Integer> list=obj.levelTraversing(root);
        
        System.out.println(list);
        
    }
            
}
