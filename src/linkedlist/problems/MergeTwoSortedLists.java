/*

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 
*/
package linkedlist.problems;

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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode temp1=list1;
        ListNode temp2=list2;

        ListNode newlist=new ListNode();
        ListNode current=newlist;


        while(temp1!=null && temp2!=null)
        {
            if(temp1.val>temp2.val)
            {
                current.next=new ListNode(temp2.val);
                current=current.next;
                 temp2=temp2.next;
            }
            else if(temp1.val<temp2.val)
            {
                current.next=new ListNode(temp1.val);
                 current=current.next;
                 temp1=temp1.next;
            }
            else 
            {
                current.next=new ListNode(temp1.val);
                current=current.next;
                current.next=new ListNode(temp2.val);
                current=current.next;
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }

        // even afterwards if nodes are still remaining in one list while
        // other doesnt have anything remaining then we will simply add up remaining ones 
        // in the list 
        /*
        EXAMPLE : 
        Example 3:
        Input: list1 = [], list2 = [0]
        Output: [0]
        */

          // remaining nodes of list1
        while (temp1 != null) {
            current.next = new ListNode(temp1.val);
            current = current.next;
            temp1 = temp1.next;
        }

        // remaining nodes of list2
        while (temp2 != null) {
            current.next = new ListNode(temp2.val);
            current = current.next;
            temp2 = temp2.next;
        }

        return newlist.next;
    }
}
public class MergeTwoSortedLists {
    
}
