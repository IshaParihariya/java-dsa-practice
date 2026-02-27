// insert Node before Tail

package doublylinkedlist;

class InsertbeforeTail
{
    public Node insert(Node head,Node insert)
    {
        // for only one Node
        if(head==null)
        {
            insert.prev=null;
            insert.next=null;
            return insert;
        }
        // for other cases
        Node temp=head;
        
        while(temp.next!=null)
        {
            temp=temp.next; // temp is the end Node
        }
        // from both sides the connection need to be made
        temp.prev.next=insert;
        insert.prev=temp.prev;
        temp.prev=insert;
        insert.next=temp;
        
        return head;
    }
}
public class InsertionBeforeTail 
{
    public static void main(String[] args)
    {            
     InsertbeforeTail obj=new  InsertbeforeTail();
     
     // creating the nodes
       Node end=new Node(5);
       Node d=new Node(4);
       Node c=new Node(3);
       Node b=new Node(2);
       Node head=new Node(1);
       //insert this Node
       Node insert=new Node(0);
       
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
       
       Node h=obj.insert(head,insert);
       
       Node temp=h;
       
       while(temp!=null)
       {
           System.out.print(temp.data+" <-> ");
           temp=temp.next;
       }
       System.out.println("NULL");
}
}
