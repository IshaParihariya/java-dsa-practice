// queue using linked list
// FIFO
/*
FRONT → 10 → 20 → 30 → 40 ← REAR
         ↑ remove         ↑ insert
*/
package stack_queue.intro;

 class QueueWithLL
 {
     int size=0; // no. of elements 
     
     Node top=null; // top or head
     
      Node newNode=null;
      Node temp=null;
     
     // add 
     public void offer(int value)
     {
         if(size==0)
         {
             top=new Node(value); // head / top fixed
             temp=top;
         }
          newNode=new Node(value);
          newNode.next=temp;
          temp=newNode;
          size++;
     }
     
     // poll
     public int poll()
     {
         int removed=0; 
         
         // empty list or underflow
         if(size==0)  // or top == null
         {
           System.out.println("underflow queue");  
           return -1;
         }
         
         return removed;
     }
 }
public class QueueUsingLinkedList
{
    public static void main(String[] args)
    {
        QueueWithLL obj=new QueueWithLL();
        obj.offer(1);
        obj.offer(2);
        obj.offer(3);
        obj.offer(4);
        obj.offer(5);
        
        Node head=obj.temp;
        // print
         Node temp1=head;
         while(temp1.next!=null)
         {
             System.out.print(temp1.data+" -> ");
             temp1=temp1.next;
         }
         System.out.print("NULL");
          System.out.print("\n");
    }
 }
