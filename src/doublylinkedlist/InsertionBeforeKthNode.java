// insert before the Kth Node

package doublylinkedlist;

class InsertBeforeKth
{
    public Node insert(Node head,int k,Node insert)
    {
        // not including the head and tail cases here
        
        // if DLL is null
        if(head==null)
        {
          if(k==1) // insert at this position
          {
              insert.next=null;
              insert.prev=null;
              return insert;
          }
        }
        // for other cases
        int count=0;
        Node temp=head;
        boolean found=false;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                found = true;
                break;
            }
            temp=temp.next;
        }
        if(found==false)
        {
            System.out.println("invalid position");
            return head;
        }
        // temp is the Node at Kth position
        Node previous = temp.prev;

        previous.next = insert;
        insert.prev = previous;

        insert.next = temp;
        temp.prev = insert;
        return head;
    }
}
public class InsertionBeforeKthNode 
{
    public static void main(String[] args)
    {
        InsertBeforeKth obj=new InsertBeforeKth();
        
        // creating the nodes
       Node end=new Node(5);
       Node d=new Node(4);
       Node c=new Node(3);
       Node b=new Node(2);
       Node head=new Node(1);
       
       // insert this Node
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
       
       Node h=obj.insert(head, 2,insert);
       Node temp=h;
       
      
       while(temp!=null)
       {
           System.out.print(temp.data+" <-> ");
           temp=temp.next;
       }
       System.out.println("NULL");
    }
}
