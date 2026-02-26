// delete the Kth Node of the DLL
package doublylinkedlist;

class Node
{
    // data members
    int data;
    Node next;
    Node prev;
    
    //constructor
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    
    Node(int data,Node next,Node prev)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

class DeleteKthelement
{
    public Node deleteKthnode(Node head,int K)
    {
         // if null linked list 
         if(head==null)
          return null;
        
        
        // for head
        if(K==1)
        {
            if(head.next==null)
                return null;
            else
            {
            Node newHead;
            newHead=head.next;
            newHead.prev=null;
            head.next=null;
            return newHead;
            }
        }
        
        //for tail
        Node temp;
        temp=head;
        if(K==5) // here length is 5 so taking that stuff
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.prev.next=null;
            temp.prev=null;
            return head;
        }
        
        // deleting Kth Node
        int count=0;
         temp =head;
        
        boolean found=false;
        while(temp!=null)
        {
          
          count++;
          
          if(count==K)
          {
              found=true;
              temp.prev.next=temp.next; 
              temp.next.prev=temp.prev;
              temp.next=null;
              temp.prev=null;
              return head;
          }  
          temp=temp.next;
        }
        if(found==false)
        {
            System.out.println("Node doesnt exist");
        }
        return head;
    }
}
public class DeleteKthNode 
{
    public static void main(String[] args)
    {
        
         DeleteKthelement obj = new  DeleteKthelement();
        
        // creating the nodes
       Node end=new Node(5);
       Node d=new Node(4);
       Node c=new Node(3);
       Node b=new Node(2);
       Node head=new Node(1);
      
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
       
       Node h= obj.deleteKthnode(head,1);
       
       
       //printing the DLL after deletion of the head
       
       Node temp=h;
       
       System.out.println("after deletion of the Kth Node : 2");
       while(temp!=null)
       {
           System.out.print(temp.data+" <-> ");
           temp=temp.next;
       }
       System.out.println("NULL");
    }
}
