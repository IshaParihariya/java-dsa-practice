
// Implementation of Queue using a Stack

// TWO STACK METHOD IS EFFICIENT

package stack_queue.intro;

import java.util.Stack;

//NOT PREFFERED DUE TO TIME COMPLEXITY
// offer = O(n)
// poll = O(1)
class QueueWithStack {
    
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    // offer
    public void offer(int value) {
        
        // move all from stack1 → stack2
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        // push new element
        stack1.push(value);
        
        // move back stack2 → stack1
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    // poll
    public int poll() {
        return stack1.pop();
    }
}

// PREFERRED ONE
//offer = O(1)
//poll = amortized O(1)
class QueueWithStacks 
{
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void offer(int x) {
        s1.push(x);
    }
    
    public int poll() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
public class QueueUsingStack
{
    public static void main(String[] args)
    {
        QueueWithStack obj=new QueueWithStack();
        // offer 
        obj.offer(1);
        System.out.println(obj.stack1);
         obj.offer(2);        
         System.out.println(obj.stack1);
          obj.offer(3);
                  System.out.println(obj.stack1);
           obj.offer(4);
                   System.out.println(obj.stack1);
            obj.offer(5);
                    System.out.println(obj.stack1);
            // poll
            Integer removed=obj.poll();
                    System.out.println("removed : "+removed);
                     Integer removed1=obj.poll();
                    System.out.println("removed : "+removed1);
    }
}
