
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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp=head;

        int length=0;

        while(temp!=null)
        {
            length++; //from here we are getting the length of the Linked list
            temp=temp.next;
        }

        if(n==length)
        {
            return head.next;  //removing the head
        }

        //again temp = head;
        temp=head;

        //modifying temp.next also changes the linked list that head points to.**
        //because both references lead to the same nodes

        int target=length-(n-1); //this is the node that we hafta remove from here

        int tempLength=0;

        while(temp!=null)
        {
            if(tempLength==target-2) // as it were skipping spmething
            {
               //remove that one now..
               temp.next=temp.next.next;
               break;
            }

            tempLength++;
            temp = temp.next;
        }

        return head;

    }
}
public class Leetcode19 {
    
}
