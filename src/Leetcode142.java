
import java.util.HashSet;
import java.util.Set;

// /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */

public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null || head.next==null)
        {
            return null; //as only head is there then no cycle possible
            //one case could be that head has a cycle with itself

        }

        ListNode temp=head;

        Set<ListNode> set=new HashSet<>();

        while(temp!=null)
        {
            if(!set.add(temp))
            {
                //not unique
                //means repeating
                return temp;
            }

            temp=temp.next;
        }

        return null;

    }
}



// public class Solution 
// {
//     public ListNode detectCycle(ListNode head) 
//     {
//         if(head == null || head.next==null)
//         {
//             return null; //as only head is there then no cycle possible
//             //one case could be that head has a cycle with itself

//         }

//         int len=0; //starting from -1 so we can add at index 0 uk

//         ListNode temp=head;

// //this can run forever as linked list can be cyclic
// //we need to add some condition here bro
// Set<Integer> set=new HashSet<>();//each node value is unique 
// //THIS WILL WORK FOR UNIQUE VALUES ONLY

//         while(temp!=null)
//         {
//             if(set.add(temp.val))
//             {
//                 //if value can be added means yes 
//                 len=len+1;
//             }
//             else
//             {
//                 return temp;
//             }
//             //if value cannot be added means 
//             //we found our node



//             temp=temp.next;
//         }

//         boolean[] arr=new boolean[len];

//         //again get temp to head;

//         int index=-1;

//         ListNode res=null;

//         temp=head;

//         //BUT THEN THIS BECOMES UNNECESSARY

//         while(temp!=null)
//         {
//             //as array can end before our linked list
//             index=(index+1)%arr.length;  //starting from index 0 to whatsoevr the end will be

//             if(!arr[index])
//             {
//                 //not visted
//                 arr[index]=true;
//             }
//             else
//             {
//                 //already visited
//                 res=temp;
//                 //we can get index that will be our pos
//                 return res;
//             }

//             temp=temp.next;
//         }

//         return null;
//     }
// }
public class Leetcode142 {
    
}
