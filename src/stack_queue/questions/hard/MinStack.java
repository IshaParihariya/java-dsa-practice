// finding min in the given stack and if min is popped out then next smallest one now the min one


/*
Vector<Integer> v = new Vector<>();

v.add(10);
v.add(20);
v.add(30);

It behaves like an ArrayList but thread-safe — grows automatically.

->> why does Stack use Vector?
Because:
Java Stack class extends Vector

So internally:

Stack → Vector → Dynamic Array

We usually DON’T use Vector because:

It’s old (legacy)
It’s synchronized by default → slower
Better alternatives exist

Use:

ArrayList instead of Vector
ArrayDeque instead of Stack

*/
package stack_queue.questions.hard;
import java.util.Stack;


// method 1 : slow (O(n))
class ImplementMinStack
{
    Stack<Integer> stack=new Stack<>();
    
    public Integer getMin()
    {
        if(stack.isEmpty()) //  || size == 0 
        {
            System.out.println("stack underflow");
            return -1;
        }
        
        Integer min=stack.get(0);
        for(int i=0;i<stack.size();i++)
        {
            if(min>stack.get(i))
            {
                min=stack.get(i);
            }
        }
        
        return min;
    }
}

class method2
{
     Stack<Integer> stack=new Stack<>();
}
public class MinStack
{
    public static void main(String[] args)
    {
        ImplementMinStack s=new ImplementMinStack();
        s.stack.push(101);
        s.stack.push(20);
        s.stack.push(5);
        s.stack.push(70);
        s.stack.push(11);
        System.out.println(s.stack);
        Integer min=s.getMin();
        System.out.println("min without pop operation : "+min);
        s.stack.pop(); // 11
        Integer min1=s.getMin();
        System.out.println("min : "+min1);
        s.stack.pop();// 70
        Integer min2=s.getMin();
        System.out.println("min : "+min2);
        s.stack.pop(); // 5
        Integer min3=s.getMin();
        System.out.println("min : "+min3);
    }
}
