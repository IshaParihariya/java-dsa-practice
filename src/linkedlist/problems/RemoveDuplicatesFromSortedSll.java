/*

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/
package linkedlist.problems;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SolutionRDFSSLL {
    public ListNode deleteDuplicates(ListNode head) 
    {
        HashSet<Integer> set = new HashSet<>(); //since hashmap needsa both key and value!

        ListNode temp=head;
        /*
        This does not create a new node.
It simply creates another reference to the same linked list.

head ──► 1 ─► 2 ─► 3

temp ──┘

Both head and temp point to the first node initially.
        */
        ListNode prev=null;

        while(temp!=null)
        {
            if(!set.contains(temp.val))
            {
                //is not in set so store there
                set.add(temp.val);
                prev=temp;
            }
            else
            {
                //if set has this value alraedy then remove this Node
                prev.next=temp.next;
            }


            temp=temp.next;


        }
        //end of while loop

        return head;
  
}
}
public class RemoveDuplicatesFromSortedSll {
    
}
