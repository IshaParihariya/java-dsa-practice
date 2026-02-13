/*
deleting the tail in the Linked List
*/
package linkedlist.operations.deletion;

class Deletetail
{
    public void tail()
    {
       Node tail=new Node(5,null); 
       Node h3=new Node(4,tail); 
       Node h2=new Node(3,h3); 
       Node h1=new Node(2,h2); 
       Node head=new Node(1,h1);
       
       // 
       h3.next=null;
       tail=h3;
       
       //printinh the updated Linked List
       Node temp=head;
       while(temp!=null)
       {
       System.out.print(temp.data+" -> ");
       temp=temp.next;
       }
       System.out.println("null");
    }
}
public class DeleteTail 
{
    public static void main(String[] args)       
    {
        Deletetail d=new Deletetail();
        d.tail();
    }
}
