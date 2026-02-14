/*
insertion at the head
*/
package linkedlist.operations.insertion;

// Node class
class Node
{
    int data;
    Node next;
    
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
class InsertionAtHeadHelper
{
    public Node insert(Node head,int value)
    {
       
        /*
        
        Node newhead=head;  // this doesnt create a new Node but here WE NEED A NEW NODE**
        
        newhead.data=value;
        newhead.next=head;  // infinte loop 
        
        return newhead;
*/
        
         //new head
        Node newhead=new Node(0,head);
        return newhead;
    }
}
public class InsertionAtHead 
{
    public static void main(String[] args)
    {
        InsertionAtHeadHelper i=new InsertionAtHeadHelper();
        
        
        Node tail=new Node(4,null);//tail
        Node n3=new Node(3,tail);
        Node n2=new Node(2,n3);
        Node head=new Node(1,n2);//head
        
        // updating the head
        Node newhead=i.insert(head , 0);
        
        Node temp=newhead;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
         System.out.println("null");
    }
}
