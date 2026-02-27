// inserting before the head
package doublylinkedlist;

class Insertionhead
{
    public Node insert(Node head,Node insert)
            {
                // if DLL is null
                if(head==null)
                {
                    insert.next=null;
                    insert.prev=null;
                    return insert;
                }
                    
               head.prev=insert;
               insert.next=head;
              return insert;  
            }
}
public class InsertionBeforeHead 
{
    public static void main(String[] args)
    {
       Insertionhead obj=new Insertionhead();
       
       
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
       
       Node h=obj.insert(head, insert);
       Node temp=h;
       
      
       while(temp!=null)
       {
           System.out.print(temp.data+" <-> ");
           temp=temp.next;
       }
       System.out.println("NULL");
    }
}
