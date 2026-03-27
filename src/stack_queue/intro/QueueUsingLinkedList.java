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
     
     // initially start and end points towards NULL
     Node start=null;
     Node end=null;
    
     
     // add 
     public void offer(int value)
     {
          Node temp=null;
        temp=new Node(value);
        if(start==null)
        {
            start=end=temp;
            size++;
            return;
        }
        end.next=temp;
        end=temp;
       
        size++;
     }
     
     // poll
     public Node poll()
     {
         Node temp=null;
        if(start==null)
        {
            System.out.println("underflow");
            return null;
        }
        if(start==end)
        {
            temp=end;
            start=null;
            end=null;
            size--;
            return temp;// removed this Node
        }
        temp=start;
        start=start.next;
        size--;
        return temp;
     }
 }
public class QueueUsingLinkedList
{
    public static void main(String[] args)
    {
        QueueWithLL obj=new QueueWithLL();
        // offer
        obj.offer(1);
        obj.offer(2);
        obj.offer(3);
        obj.offer(4);
        obj.offer(5);
        
        Node head=obj.start;
        // print
         Node temp1=head;
         while(temp1!=null)
         {
             System.out.print(temp1.data+" -> ");
             temp1=temp1.next;
         }
         System.out.print("NULL");
          System.out.print("\n");
        
          // poll
          obj.poll();
           Node head1=obj.start;
        // print
         Node temp=head1;
         while(temp!=null)
         {
             System.out.print(temp.data+" -> ");
             temp=temp.next;
         }
         System.out.print("NULL");
          System.out.print("\n");
          
    }
 }
