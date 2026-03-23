// stack = LIFO
// queue = FIFO
/*

GENERAL WAY : 
 Stack<Integer> stack=new Stack<Integer>(); // Called Diamond Operator (<>)
     
Stack<Integer> stack=new Stack<>(); -> preferred as no repeatation 

Queue<Integer> queue=new LinkedList<>();
Queue is AN INTERFACE

1. offer() vs add() (Queue insert)
offer()
queue.offer(1);
Returns true/false
If queue is full → returns false (no exception)

add()
queue.add(1);
Returns true
If queue is full → throws exception

2. poll() vs remove() (Queue delete)
poll()
queue.poll();
Removes element
If queue is empty → returns null (safe)

remove()
queue.remove();
Removes element
If queue is empty → throws exception
*/
package stack_queue.intro;


import java.util.*;


public class Basic 
{
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<>();
        stack.push(1); // 1
        stack.push(2); // 1 2
        stack.push(3); // 1 2 3
        // pop = LIFO so 3 will be out
        stack.pop(); //  1 2
        stack.peek(); // 2
        System.out.println(stack);
        
        
        // since Queue is an interface and LinkedList provides its implementation.”
       Queue<Integer> queue=new LinkedList<>();
       queue.offer(1); // offer or add 
       // 1                // offer and poll are safer as no exceptions
       queue.offer(2); // 1 2
       queue.offer(3); // 1 2 3
        // poll or remove 
        queue.poll(); //  2 3  FIFO
        queue.peek(); //  2 
        System.out.println(queue);
        
        
    }
}
