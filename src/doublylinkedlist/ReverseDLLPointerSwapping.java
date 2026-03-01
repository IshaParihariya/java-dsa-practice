// swapping pointers


package doublylinkedlist;

class Reverse
{
    public Node reverse(Node head)
    {
       /*
        FOR 3 NODES : 
        
        Node current=head.next;
        Node tail=head.next.next;
        
        current.prev=tail;
        tail.next=current;
        tail.prev=null;
        
        current.next=head;
        head.prev=current;
        head.next=null;
                
        return tail;
*/
        // DLL null
        if(head==null)
            return null;
        // only one Node
        if(head.next==null)
            return head;
        
        
        // pointer swapping
        Node current =head;
        Node last=null;
        Node next=current;
        while(current!=null)
        {
            next=current.next;
            
            current.next=last;
            current.prev=next;
            
            last=current;
            current=next;
        }
        return last;
    }
}
public class ReverseDLLPointerSwapping 
{
    public static void main(String[] args)
    {
        Reverse obj=new Reverse();
        Node head=new Node(1);
        Node b=new Node(2);
         Node c=new Node(3);
          Node d=new Node(4);
           Node e=new Node(5);
        Node tail=new Node(6);
        //prev pointers
        b.prev=head;
        c.prev=b;
        d.prev=c;
        e.prev=d;
        tail.prev=e;
        //next pointers
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=tail;
        tail.next=null;
        
        Node h=obj.reverse(head);
        //printing the reverse DLL
        Node temp=h;
        while(temp!=null)
        {
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
