/*
delete the element by giving the value
*/
package linkedlist.operations.deletion;

class DeleteByValueHelper
{
    public Node delete(Node head, int value)
    {
        if(head==null)
        {
            return null;
        }
        
        // if deleting head but LL >=1 
        if(head.data==value)
        {
            head=head.next;
            return head;
        }
        
        
        Node del=head;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==value)
            {
              del.next=temp.next;
              return head;
            }
            del=temp;
            temp=temp.next;
        }
        return head;
    }
}
public class DeleteByValue
{
    public static void main(String[] args)
    {
        DeleteByValueHelper d=new DeleteByValueHelper();
        
        Node tail=new Node(4,null);//tail
        Node n3=new Node(3,tail);
        Node n2=new Node(2,n3);
        Node head=new Node(1,n2);//head
        
        d.delete(head, 3);
    }    
}
