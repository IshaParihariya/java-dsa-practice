// reverse a DLL with Array approach

package doublylinkedlist;

class ReverseWithArray
{
    public Node reverse(Node head)
    {
        // DLL null
        if(head==null)
            return null;
        // only one Node
        if(head.next==null)
            return head;
        
        // DLL to array
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int arr[]=new int[count];
        temp=head;
        for(int i=0;i<count;i++)
        {
            /*
            while(temp!=null)
            {
            arr[i]=temp.data;
            temp=temp.next;
            break;
            }*/
            
            arr[i]=temp.data;
            temp=temp.next;
        }
        // array reverse
        int newarr[]=new int[count];
        for(int i=0,j=count-1;i<count &&j>-1;i++ ,j--)
        {
              newarr[i]=arr[j];
        }
        
        // now reverse array to DLL
     
        Node newhead=new Node(newarr[0]);
        Node mover=newhead;
        for(int i=1;i<count;i++)
        {
           Node node=new Node(newarr[i]);
           node.prev=mover;
           mover.next=node;
           mover=node;
           
        }
        return newhead;
    }
}
public class ReverseDLLArrayApproach 
{
    public static void main(String[] args)
    {
        ReverseWithArray obj=new ReverseWithArray();
        
        Node head=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node tail=new Node(5);
        //prev pointers
        b.prev=head;
        c.prev=b;
        d.prev=c;
        tail.prev=d;
        //next pointers
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=tail;
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
