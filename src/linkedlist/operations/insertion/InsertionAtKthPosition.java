/*

// AN ISSUE IN A PART

insertion at Kth position
*/
package linkedlist.operations.insertion;

class InsertionAtKthPositionHelper
{
    public Node insert(Node head,int position,int value)
    {
        // if the head == null i.e., LL 's length == 0
        //then dont 
        // but if position ==1 then just insert at the head
        if(head==null && position==1)
        {
           /*
            
            // cannot do this because if head== null so no node exists 
            // NEED TO CREATE A NEW ONE!**
            head.data=value;
            head.next=null;
            return head;
*/
            return new Node(value,null);
        }
          else if(head==null)
            return null;
        
        // insertion new Node
        Node insert=new Node(value,null);// just for initiasation
        
        // for insertion at postion 1 or head
        if(position==1)
        {
            insert.next=head;
            return insert;
        }
        
        // for LL's length == 1
        
        
        // for LL 's length > 1
        int count=0;
        
        Node del=head;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            if(count==position)
            {
               del.next=insert;
               insert.next=temp;
               return head;
            }
            
            // NOTE : HERE IN THE HANDLING OF THIS THERES AN ISSUE SO HANDLE IT
            // if insertion need to be done at length + 1
            if(count<position)
            {
                temp.next=insert;
                insert.next=null;
            }
            del=temp;
            temp=temp.next;
        }
        return head;
    }
}
public class InsertionAtKthPosition
{
    public static void main(String[] args)
    {
        InsertionAtKthPositionHelper i=new InsertionAtKthPositionHelper();
        
        Node tail=new Node(4,null);//tail
        Node n3=new Node(3,tail);
        Node n2=new Node(2,n3);
        Node head=new Node(1,n2);//head
        
        head=i.insert(head, 2,0); // insert 0 at 2nd position
        
        Node temp=head;
        
        while(temp!=null)
        {
             System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
          System.out.println("null");
    }
}
