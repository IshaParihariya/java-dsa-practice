/*

// IN QUEUE :
1. front
Points to the first element
Used for removing (poll)

2. rear
Points to the last element
Used for adding (offer)
*/
package stack_queue.intro;

// for stack
class StackUsingArray
{
    // global data members 
     int[] stack=new int[10]; // size fixed so static
        
        int top=-1; // top
              
        int peek;   // peek
        
    // push method
    public void push(int push)
        {
            
            // overflow stack
       if(top==stack.length-1)
       {
           System.out.println("Stack is overflow");
           return;
       }
       else
       {
           top++;
           stack[top]=push;
           peek=stack[top]; // peek
           System.out.println("peek :" + peek);
       }
        }
    
    // pop method 
    public void pop()
        {
            if(top==-1)
            {
                System.out.println("Stack is underflow");
                return ;
            }
            else
            {
                top--;

                if(top!=-1)
                {
                    peek=stack[top];
                     System.out.println("peek :" + peek);
                }      
            }
        }

}


// This is a linear queue. One limitation is that once the rear
// reaches the end, we cannot reuse empty space. To optimize this, we can use a circular queue
// Linear Queue
class QueueUsingArray
{
    // offer or add
    int queue[] =new int[10]; // full size = 10 
    int size=queue.length;
    int front=-1; // front
    
    int rear=-1; // rear
    
    // current size => till where the elements are stored
    int currentSize=0;
    
    // offer or add
    // NOTE : we can also use currentSize comparision with size rather than these length and all conditions
    public void offer(int number)
    {
        // over flow
        if(rear==queue.length-1)
        {
            System.out.println("overflow queue");
            return;
        }
        else
        {
        if(front==-1)
        {
            front++;
        }
        rear++;
        queue[rear]=number;
        currentSize++;   
        }
    }
    public void poll()
    {
        // underflow
        if(front==-1&&rear==-1||front>rear)
        {
            System.out.println("queue underflow");
            return;
        }
        else
        {
            if(front==0&&rear==0)
            {
                front=-1;
                rear=-1;
                currentSize--;
            }
            else
            {
                front++;
                currentSize--;
            }
        }
       
    }
}

public class ImplementationUsingArray 
{
    public static void main(String[] args)
    {
        // for stack
        // size = top+1
        StackUsingArray s=new StackUsingArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        s.pop();

        
        // for Queue
        QueueUsingArray q=new QueueUsingArray();
        q.offer(1);
         q.offer(2);
          q.offer(3);
           q.offer(4);
            q.offer(5);
            
            q.poll();     
    }
}
