/*
Insertion at the tail of a new element
*/
package linkedlist.operations.insertion;


class InsertionAtTailHelper
{
    public Node insert(Node head,int value)
    {
        // new tail
       Node newtail=new Node(value,null); 
       
       // if LL is empty
       if(head==null)
       {
           head=newtail;
           return head;
       }
       
      Node temp=head;
      while(temp!=null)
      {
          if(temp.next==null)
          {
             Node tail=temp;
             tail.next=newtail;
             return head;
          }
          temp=temp.next;
      }
      return head;
    }
}
public class InsertionAtTail
{
    public static void main(String[] args)
    {
        InsertionAtTailHelper h=new InsertionAtTailHelper();
        
        Node tail=new Node(4,null);//tail
        Node n3=new Node(3,tail);
        Node n2=new Node(2,n3);
        Node head=new Node(1,n2);//head
        
        head=h.insert(head, 0);
        
        Node temp=head;
        
        while(temp!=null)
        {
             System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
          System.out.println("null");
    }
}
