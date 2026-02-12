/*
traversing in linked list 
NOTE : NEVER EVER tamper the head dont ever change it 
*/
package linkedlist;

class TraversingInLinkedList
{
    int data;
    TraversingInLinkedList next;  // NOTE : this next should have same as the class name 
    
    // constructor 
    TraversingInLinkedList(int data,TraversingInLinkedList next) //**
    {
        this.data=data;
        this.next=next;
    }
    
    public void traversinginll()
    {
        TraversingInLinkedList head=this;// this means: current object (the one that called the method). => t1
        
        TraversingInLinkedList temp=head;
        /*
        temp doesn’t “know” data or address.
It holds the node object, which already has both inside.
        */
        
        // while loop
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
}
public class TraversinginLL 
{
    public static void main(String[] args)
    {
         TraversingInLinkedList t4=new TraversingInLinkedList(6,null);
         TraversingInLinkedList t3=new TraversingInLinkedList(6,t4);
         TraversingInLinkedList t2=new TraversingInLinkedList(6,t3);
        TraversingInLinkedList t1=new TraversingInLinkedList(6,t2);
        
        t1.traversinginll();
    }
}
