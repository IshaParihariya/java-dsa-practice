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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {

        ListNode temp1=l1;
        ListNode temp2=l2;

        int carry=0;

        ListNode dummy=new ListNode(-1);//this is the dummy one
        ListNode temp=dummy;

        while(temp1!=null || temp2!=null)
        {
            int a=0;
            int b=0;

            if(temp1!=null)
            {
             a=temp1.val;
            }

            if(temp2!=null)
            {
             b=temp2.val;
            }//else give 0 as value here as adding with 0 gives same number
            //handling carry case here
            if(carry==1)
            {
                //we are adding of these by 1
                //which ever is smaller 
                //lets go with that uk
                if(a>=b)
                {
                    b++;
                }
                else
                {
                    a++;
                }
                //then decrement in carry 
                carry--;
            }
           

            //not getting into the binary thing rn
            //a+b would always range between 0-> 19
            //the max carry will always be 1
            //else nothing
            int add=a+b;

            //if add<10 => no issues
            //else we need to get that carry up to the next one
            if(add>9)
            {
                carry++;
                //there will be always be 2 digits here
                //and we need to get the last digit and carry will be 1 
                //which we need to add in the further value
                String str=Integer.toString(add);

                char ch=str.charAt(1);//we will get the secound digit 

                //which we will add as the value
                add=ch-'0'; //this is that we need to add in that
            }
            //make a new node here
            //and get the value with this addition in it

            ListNode result=new ListNode(add); //new node

            //attach it 
            temp.next=result;

            //move it as well
            temp=temp.next;

            if(temp1!=null)
            {
            temp1=temp1.next;
            }

            if(temp2!=null)
            {
            temp2=temp2.next;
            }

        }

        //if after all this if the carry is still 1 
        //then we need to add on one more here 
        if(carry!=0)
        {
            //this is the left one in the last its always one babes
            ListNode result=new ListNode(1); //new node

            temp.next=result;
            temp=temp.next;
        }

        return dummy.next;//as we starting from -1
    }
}
        // ListNode temp1=l1; //head of the l1 

        // ListNode temp2=l2;  //head of l2

        // //we can simply store each numbers in Integer

        // //from l1 we need to get in the reverse order
        // //NO SIMPLY REVERSE L2
        // StringBuilder s1=new StringBuilder();

        

        // while(temp1!=null)
        // {
        //     s1.append(String.valueOf(temp1.val));
        //     temp1=temp1.next;
        // }

        // // reversing both here
        // s1.reverse();

        // //convert to Integer
        // Integer a=Integer.parseInt(s1.toString());

        // s1.setLength(0); //use same sb

        // //same thing for l2
        // while(temp2!=null)
        // {
        //     s1.append(String.valueOf(temp2.val));

        //     temp2=temp2.next;
        // }

        // s1.reverse(); //here we getting the reverse

        // Integer b=Integer.parseInt(s1.toString());

        // Integer res=a+b;

        // String ans=Integer.toString(res);

        // //we need to return this in LinkedList form
        // ListNode temp=new ListNode();

        // int l=0;

        // while(l<ans.length())
        // {
        //     char c=ans.charAt(l);
        //     temp.val=c-'0';
        //     temp=temp.next;
        //     l++;
        // }

        // temp.next=null;//at last we doing this..

        
//     }
// }
public class Leetcode2 {
    
}
