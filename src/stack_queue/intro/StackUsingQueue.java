
// stack => LIFO 
// queue => FIFO
/*
 In Queue FIFO => push(1)   // 1
       push(2) => // 1 2
       
       // conveting to stack
       In Stack LIFO => _ 2 1 (move 1 after 2)
       
       Again Queue => push(3) //  _ 2  1  3
       TO Stack=> _ 3  2  1 (move all after 3)
*/
package stack_queue.intro;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackWithQueue
{
    Queue<Integer> q=new LinkedList<>();
    int size=0;
   public void push(int value)
   {
       // start
       if(size==0)
       {
          q.offer(value);
          size++;
          return;
       }
       // if size>=1
      /*
       In Queue FIFO => push(1)   // 1
       push(2) => // 1 2
       
       // conveting to stack
       In Stack LIFO => _ 2 1 (move 1 after 2)
       
       Again Queue => push(3) //  _ 2  1  3
       TO Stack=> _ 3  2  1 (move all after 3)
       */
      
    
      // for loop 
      q.offer(value); 
      for(int i=0;i<size;i++)
      {
        q.offer(q.poll());
         
      }
      size++;
      
   }   
}
public class StackUsingQueue 
{
    public static void main(String[] args)
    {
        ImplementStackWithQueue stack=new ImplementStackWithQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    }
}
