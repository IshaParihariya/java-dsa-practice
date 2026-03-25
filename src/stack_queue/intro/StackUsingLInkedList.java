// stack using Linked List
package stack_queue.intro;

// class Node
class Node
{
    int data;
    Node next;
    
      
     // constructor with 2 param  
     public Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
     
    
    }
    // constructor with 1 param
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        
    }
}
class StackWithLL
{
  
    int size=0; // the elements in the LL
    Node temp=null;
    Node head=null; // top or head
    // stack => LIFO
    public void push(int value)
    {
        // NOTE : LL is dynamic so no space or some issue so NO OVERFLOW
        // BUT STILL => There is no fixed size limit like array, so overflow doesn't occur due to capacity. 
        // However, it can still happen if heap memory is exhausted.**
        
        // (top) 40 -> 30 -> 20 -> 10  =>  LIFO ( 10 came first so will go in last )
        // the top keeps on updating 
        // the newest node becomes the top
        
        Node newNode = new Node(value);
        newNode.next=head; // head==top
        head=newNode;
        size++;
        
      //  return head; // to print the LL
    }
    
    // for pop()
    public int pop()
    {
        // stack unerflow
        if(size==0) // or if head==null
        {
            System.out.println("stack underflow");
            return -1;
        }
        
        int removed=head.data;
        head=head.next;
        size--;
        
        return removed;
    }
}
public class StackUsingLInkedList 
{
    public static void main(String[] args)
    {
        StackWithLL object=new StackWithLL();
        
      object.push(1);
        object.push(2);
         object.push(3);
          object.push(5);
          Node head=  object.head; // we did this instead
         
         // print
         Node temp=head;
         while(temp!=null)
         {
             System.out.print(temp.data+" -> ");
             temp=temp.next;
         }
         System.out.print("NULL");
          System.out.print("\n");
           
           int removed=object.pop();
           System.out.println("removed :"+removed);
           int removed1=object.pop();
           System.out.println("removed :"+removed1);
    }
}
