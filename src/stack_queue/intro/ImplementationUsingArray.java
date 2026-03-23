/*

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
        
        int size=0; // size 
              
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

// for Circular Queue => when reaches end it will start from start again
class QueueUsingArray
{
    // offer or add
    int queue[] =new int[10];
    
    int front=-1; // top
    
    int rear=-1; // rear
    
    // offer or add
    public void offer(int number)
    {
        // over flow
        if(front==0&&rear==queue.length-1||front==rear+1)
        {
            System.out.println("queue overflow");
            return;
        }
        else
        {
            if(rear==queue.length-1)
            {
                 queue[rear]=number;  
                 rear=-1; // start from the start 
                 // break here??
            }
            if(front==-1)
            {
            front++;
            }
            rear++;
            queue[rear]=number; //this will be the peek 
        }
    }
    
    // poll or remove
    public void poll()
    {
       //under flow
        if(rear==-1&&front==-1 ||front>rear)
        { 
            System.out.println("queue underflow");
            return;
        }
        else
        {
            if(front==queue.length-1)
            {
                 
                 front=-1; // start from the start 
                 // break here??
            }
            
            front++;
        }
    }
}
/*
GIVEN BY CHATGPT :

class QueueUsingArray
{
    int[] queue = new int[10];
    int front = -1;
    int rear = -1;

    // OFFER (enqueue)
    public void offer(int value)
    {
        // FULL condition
        if ((rear + 1) % queue.length == front)
        {
            System.out.println("Queue Overflow");
            return;
        }

        // First element
        if (front == -1)
        {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
    }

    // POLL (dequeue)
    public int poll()
    {
        // EMPTY condition
        if (front == -1)
        {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = queue[front];

        // Last element removed
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front = (front + 1) % queue.length;
        }

        return removed;
    }

    // PEEK
    public int peek()
    {
        if (front == -1)
        {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }
}
*/
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
    }
}
