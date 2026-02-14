/*
deleting on the basis of position
*/
package linkedlist.operations.deletion;

class DeleteKthHelper
{
    public Node delete(Node head, int position)
    { 
        Node temp=head;
        int count=0;
        
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
        // null LL
        if(head==null)
            return head;
        
         // position given doesnt exists
        if(count<position)
            return head;
    
        // for removing head
        if(position==1)
        {
            head=head.next;
            return head;
        }
       
        
        count=0; // again count == 0
        Node del=head;
        temp=head;
        // deleting Kth element in the LL
        while(temp!=null)
        {
            count++;
            if(count==position)
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
public class DeleteKth
{
    public static void main(String[] args)
    {
        DeleteKthHelper d=new DeleteKthHelper();
        
        Node tail=new Node(4,null);//tail
        Node n3=new Node(3,tail);
        Node n2=new Node(2,n3);
        Node head=new Node(1,n2);//head
        
        head=d.delete(head,2);
        
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
