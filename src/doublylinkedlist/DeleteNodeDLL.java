// delete a given Node from the DLL

package doublylinkedlist;

class DeleteGivenNode
{
    public Node delete(Node head,int Node)
    {
      /*  // null DLL
        if(head==null)
            return null;
        // if only one Node
        if(head.next==null)
            return null;
        */
        
        // for other cases
        boolean found=false;
        Node deletenode=head;
        while(deletenode!=null)
        {
            if(deletenode.data==Node)
            {
                found=true;
                break;
            }
            deletenode=deletenode.next;
        }
       
        // if Node not found in the DLL
        if(found==false)
        {
            System.out.println("Node doesn't exist");
            return head;
        }
         Node previous=deletenode.prev;
        Node next=deletenode.next;
        // for head case
        if(previous==null)
        {
            // only one node deletion case
            if(next==null)
                return null;
            else
            { // for more than one node case
            Node newhead=head.next;
            head.next.prev=null;
            head.next=null;
            return newhead;
            }   
        }
        
        // tail case
        if(next==null)
        {
            previous.next=null;
            deletenode.prev=null;
            return head;
        }
        
        // for any other node
        if(next!=null && previous!=null)
        {
            previous.next=next;
            next.prev=previous;
            deletenode.prev=null;
            deletenode.next=null;
            return head;
        }
        return head;
    }
}
public class DeleteNodeDLL
{
    public static void main(String[] args)
    {
        DeleteGivenNode obj=new DeleteGivenNode();
        
        Node head=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node tail=new Node(4);
        
        // next pointers
        head.next=b;
        b.next=c;
        c.next=tail;
        tail.next=null;
        
        // prev poniters
        b.prev=head;
        c.prev=b;
        tail.prev=c;
        
        Node h=obj.delete(head, 3);
        
        Node temp=h;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
