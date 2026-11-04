
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Solution 
{
    public int countHighestScoreNodes(int[] parents) 
    {
        /*
The actual concept to remember
- BFS normally processes parents before children.
- Reverse BFS processes children before parents.
- Subtree calculations require children to be processed first.
This is called Bottom-Up Processing.
        */

        //try another way broo

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<parents.length;i++)
        {
           list.add(new ArrayList<>()); //new lists for each index
        } 

        for(int i=1;i<parents.length;i++)
        { 
           list.get(parents[i]).add(i);
        }

        //this will have the subtree of each node
        //in the first example given here
        //0 has 1+size(child) = 5
        //for 2 => 1+size(child) = 3 

        int[] subtree=new int[parents.length];

        for(int i=0;i<parents.length;i++)
        {
            //as initially all are having themselves only
            //like initially 0 has itself no other node so..
            subtree[i]=1;
        }

        //now lets get to the main thing
        // for(int i=0;i<parents.length;i++)
        // {
        //no need for for loop 
        //as we will iterte through the main parent node 
        //and will get all subrtree from there
        //as tree starts from 0 always so 
        //we will always have 0 as the parent node for all

        Queue<Integer> q=new LinkedList<>();

        List<Integer> order=new ArrayList<>();

        q.offer(0);

        while(!q.isEmpty())
        {
            int node=q.poll();

            order.add(node);

            if(!list.get(node).isEmpty())
            {
                //hence it has further  children nodes
                for(Integer child:list.get(node))
                {
                    q.offer(child);
                }
            }
        }

        // }

        //now we having the order in which nodes are 
        //THIS IS IMPORTANT HERE
        //iterating backwards
        for(int i=order.size()-1;i>-1;i--)
        {
            int node=order.get(i);

            //getting this node's parents
            int parent=parents[node];

            if(parent!=-1)
            {
                subtree[parent]=subtree[parent]+subtree[node];
            }
        }

        long maxi = 0;

Map<Long, Integer> map = new HashMap<>();

for(int i = 0; i < parents.length; i++)
{
    long product = 1;

    // Component outside the current subtree
    int remaining = parents.length - subtree[i];

    if(remaining > 0)
    {
        product *= remaining;
    }

    // Calculate the sizes of child subtrees
    for(Integer child : list.get(i))
    {
        product *= subtree[child];
    }

    // Store score frequency
    map.put(product, map.getOrDefault(product, 0) + 1);

    maxi = Math.max(maxi, product);
}

return map.get(maxi);







// Time Complexity (TC)
// Operation	Complexity
// Creating adjacency list	O(n)
// Building adjacency list	O(n)
// Outer loop	O(n)
// BFS for each node	O(n) per node (worst case)
// HashMap operations	O(1) average

// Overall TC: O(n²)
        //TLE FOR THIS ONE
        // List<List<Integer>> list=new ArrayList<>();

        // Map<Long,Integer> map=new HashMap<>();

        // for(int i=0;i<parents.length;i++)
        // {
        //    list.add(new ArrayList<>()); //new lists for each index
        // } 

        // for(int i=1;i<parents.length;i++)
        // { 
        //    //starting from index 1
        //    //as start node is fixed i.e., 0
        //    //so we need to start from 1 index onwards
        //    list.get(parents[i]).add(i);
        // }

        // //now get this in mind
        // //if parents[i] is not in the list
        // //then it means its product -> 1*parents.length-1;
        // long product=1;

        // long maxi=Long.MIN_VALUE;

        // for(int i=0;i<parents.length;i++)
        // {
        //     if(list.get(i).isEmpty())
        //     {
        //         //means its no ones's parent
        //         //means its product is length-1
        //         product=parents.length-1;
        //         maxi=Math.max(maxi,product);
        //     }
        //     else
        //     {
        //         Queue<Integer> q=new LinkedList<>();
        //         //add those in the queue

        //         for(Integer n:list.get(i))
        //         {
        //             q.offer(n);
        //         }

        //         int len=0;

        //         int len1=0;
        //         int len2=0;


        //         //for only one node
        //         if(q.size()==1)
        //         {

        //         //means it is a parent node of some other node
        //         while(q.size()>0)
        //         {
        //             //need to cheack all nodes ryt so we can get the size here
        //             int node=q.poll();

        //             len++;

        //             if(!list.get(node).isEmpty())
        //             {
        //                 //means further we have nodes
        //                 for(Integer n:list.get(node))
        //                 {
        //                     q.offer(n);
        //                 }
        //             }


        //         }
        //         //but arent we already counting the leaf itself 
        //         //as we are removing it as well from the queue hence counting
        //         //KEEP IN MIND ABOUT REMAINING ONES
        //         //WE CAN COUNT EM LIKE THIS
        //         int remaining=parents.length-1-len;
        //         product = (long) len * Math.max(remaining, 1);//as there could be remaining ones uk as well
        //         }
        //         else
        //         {
        //             //for q.size==2
        //             Queue<Integer> q1=new LinkedList<>();
        //             Queue<Integer> q2=new LinkedList<>();

        //             q1.offer(q.poll());

        //             q2.offer(q.poll());
        //             //means that parent node ahs 2 two child
        //             //0 and 1 case have been handled

        //             while(q1.size()>0)
        //             {
        //                 int node1=q1.poll();

        //                 len1++;

        //                 if(!list.get(node1).isEmpty())
        //             {
        //                 //means further we have nodes
        //                 for(Integer n:list.get(node1))
        //                 {
        //                     q1.offer(n);
        //                 }
        //             }

        //             }

        //             //same one for q2
        //             while(q2.size()>0)
        //             {
        //                 int node2=q2.poll();

        //                 len2++;

        //                 if(!list.get(node2).isEmpty())
        //             {
        //                 //means further we have nodes
        //                 for(Integer n:list.get(node2))
        //                 {
        //                     q2.offer(n);
        //                 }
        //             }

        //             }

        //             //KEEP IN MIND ABOUT REMAINING ONES
        //             //WE CAN COUNT EM LIKE THIS

        //            int remaining = parents.length - 1 - len1 - len2;

        //            product = (long) len1 * len2 * Math.max(remaining, 1);
        //         }
        //     }

        //     map.put(product, map.getOrDefault(product, 0) + 1);

        //     maxi = Math.max(maxi, product);
        // } 



        // return map.get(maxi);
    }
}  
public class Leetcode2049 {
    
}
