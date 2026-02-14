/*
deleting the tail in the Linked List
*/
package linkedlist.operations.deletion;

class DeletetailHelper
{
    public Node tail(Node head)
    {
       Node temp=head;
       
       if(temp.next==null|| head==null)
           return null;
       
       //while loop
       while(temp.next.next!=null)
       {
           temp=temp.next;
       }
       
       //Delete last node**
       temp.next=null;
       
       return head;
    }
}
public class DeleteTail 
{
    public static void main(String[] args)       
    {
       DeletetailHelper d=new DeletetailHelper();
       Node tail=new Node(5,null); 
       Node h3=new Node(4,tail); 
       Node h2=new Node(3,h3); 
       Node h1=new Node(2,h2); 
       Node head=new Node(1,h1);
       
       // updating the tail and the garbage collector willtake care of the rest! 
       //Always update head after deletion.
       head= d.tail(head);
       
       Node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.data+" -> ");
           temp=temp.next;
       }
       System.out.println("null");
    }
}
/*
output :

1 -> 2 -> 3 -> 4 -> null
*/