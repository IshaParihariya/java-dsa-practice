//stack approach for reversing the DLL

package doublylinkedlist;

import java.util.Stack;

class ReverseWithStack
{
    public Node reverse(Node head)
    {
        // DLL null
        if(head==null)
            return null;
        // only one Node
        if(head.next==null)
            return head;
        
        //stack data structure with data type Node
        // LIFO
        Stack<Node> stack=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
         //puhing in the Stack   
        stack.push(temp);
        temp=temp.next;
        }
        
        Node newhead=stack.pop();//new head of the DLL
        Node mover=newhead;
        while(stack.isEmpty()==false) // or while(!stack.isEmpty())
        {
            Node t=stack.pop();
            t.prev=mover;
            mover.next=t;
            mover=t;
        }
        mover.next=null;
        return newhead;
    }
}
public class ReverseDLLStackApproach
{
    public static void main(String[] args)
   {
        ReverseWithStack obj=new ReverseWithStack();
        
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
