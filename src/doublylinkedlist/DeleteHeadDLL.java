/*
deleting the head of the DLL

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

class DeleteHead
{
    public Node delete_head(Node head)
    {
        // if null linked list 
        
        if(head==null)
          return null;
        
        // if only one node
        if(head.next==null)
            return null; // After deleting, nothing remains so NULL
        
        //deleting the head
        
        Node temp;
        temp=head.next;
        temp.prev=null;
        
        return temp;
    }
}


public class DeleteHeadDLL
{
   public static void main(String[] args)
   {
       DeleteHead obj=new DeleteHead();
  
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
       Node newhead=obj.delete_head(head);
       
       //printing the DLL after deletion of the head
       
       Node temp=newhead;
       
       System.out.println("after deletion of the head : 1");
       while(temp!=null)
       {
           System.out.print(temp.data+" <-> ");
           temp=temp.next;
       }
       System.out.println("NULL");
   }
}
