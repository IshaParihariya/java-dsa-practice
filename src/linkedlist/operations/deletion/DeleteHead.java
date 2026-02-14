/*
deleting the head of a linked list:

// in cpp we need to free up the space of the head by delete or free() but in java we have garbage collector so
no need to delete it manually

*/
package linkedlist.operations.deletion;

class Node
{
    int data;
    Node next;
    
    //constructor
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

class Delete
{
    public Node delete(Node head,int delete)
    {   
        // if length of LL is 1 then deleting would lead to no LL at all so no deletion there
        // if length of the LL is 0 then return null
        if(head.next==null||head==null)
        {
         return null;   
        }
        //position
        int count=1;
        
        // deleting a number of heads
        while(head!=null && count<=delete)
        {
        System.out.println("deleted : "+head.data+" at position "+count);
        count++;
        head=head.next;
        // in cpp we need to free up the space of the head by delete or free but in java we have garbage collector so
        // no need to delete it manually
        } 
        return head;
    } 
}
public class DeleteHead 
{
    public static void main(String[] args)
    {
        Node n4=new Node(4,null);//end
        Node n3=new Node(3,n4);
        Node n2=new Node(2,n3);
        Node n1=new Node(1,n2);//head
        
        Delete d=new Delete();
        
        // updating the head
        n1=d.delete(n1,3);
        
        // printing the updated Linked List
        Node temp=n1;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
