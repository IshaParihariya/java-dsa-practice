/*
ArrayDeque is a resizable array implementation of the Deque interface.

Deque = Double Ended Queue

You can add and remove elements from both ends

ArrayDeque is used because it is:
-Faster than Stack
-Faster than LinkedList
-Memory-efficient
-Flexible (can act as Stack or Queue)
-Does NOT allow null
-Not thread-safe
*/
package javacollections_;

import java.util.ArrayDeque;
public class Queue_ArrayDeque 
{
    public static void main(String[] args)
    {
        //Using ArrayDeque as a Queue (FIFO)
        
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10); // inserting elements
        dq.offer(20);
        dq.offer(30);
        //printing the Queue
        System.out.println(dq);      // [10, 20, 30]
        // poll is like pop deleting the element 
        System.out.println(dq.poll()); // 10
        
        //Using ArrayDeque as a Stack (LIFO)
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
stack.push(1);
stack.push(2);
stack.push(3);

System.out.println(stack);     // [3, 2, 1]
System.out.println(stack.pop()); // 3

    }
}
