/*
deleting the tail of the DLL
*/
package doublylinkedlist;

class Node
{
    // data members
    int data;
    Node next;
    Node prev;
    
    //constructor
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    
    Node(int data,Node next,Node prev)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

class Deletetail
{
    public Node deletetail(Node head)
    {
        // if null DLL
        if(head==null)
            return null;
        
        // if only one node the head==tail
        if(head.next==null)
        {
            return null;
        }
       // deleting the tail 
       Node temp =head;
       
       while(temp.next.next!=null) // going till last secound node
       {
           temp=temp.next;
       }
       
       // breaking both the links**
       temp.next.prev=null;
       temp.next=null;
       
       return head; 
    }
}
public class DeleteTailDLL
{
    public static void main(String[] args)
    {
        Deletetail obj=new Deletetail();
        
        // creating the nodes
       Node end=new Node(5);
       Node d=new Node(4);
       Node c=new Node(3);
       Node b=new Node(2);
       Node head=new Node(1);
      
       // next pointers
       head.next=b;
       b.next=c;
       c.next=d;
       d.next=end;
       end.next=null;
       
       // prev pointers
       b.prev=head;
       c.prev=b;
       d.prev=c;
       end.prev=d;
       
       // method call
       Node h=obj.deletetail(head);
       
       //printing the DLL after deletion of the head
       
       Node temp=h;
       
       System.out.println("after deletion of the tail : 5");
       while(temp!=null)
       {
           System.out.print(temp.data+" <-> ");
           temp=temp.next;
       }
       System.out.println("NULL");
    }
}
