// circular queue

package stack_queue.intro;
// I used modulo to reuse space and avoid wasted memory from linear queue
class CircularQueueUsingArray
{
    // array
    int[] arr=new int[10];
    // size = 10
    int size=arr.length;
    
    // front
    int start=-1;
    // rear
    int end=-1;
    int currentSize=0; // count of elements in the array 
    // offer operation
    public int offer(int  value)
    {
        int added=-1;
       
        // overflow 
        if(currentSize==size) 
        {
            System.out.println("Queue overflow");
            return -1;
        }
        // when start == -1 and end == -1 
        if(currentSize==0)
        {
            start=0;
            end=0;
            arr[end]=value;
            added=arr[end]; 
            currentSize++;
        }
        // start>-1 and end>-1
        else
        {
            end=(end+1)%size; 
            arr[end]=value;
              added=arr[end];
            currentSize++;
        }
        return added;
    }
    // poll operation
    public int poll()
    {
         int peek=-1;
         int removed=-1;
        // underflow
        if(currentSize==0) // or start==-1 and end==-1
        {
            System.out.println("Queue underflow");
            return -1;
        }
        if(currentSize==1)
        {
            removed=arr[start];
            start=-1;
            end=-1;
              currentSize--;
        }
        else
        {
             removed=arr[start];
            start=(start+1)%size;
             peek=arr[start];
            currentSize--;
        }
        return removed;
    }
}
public class CircularQueue
{
   public static void main(String[] args)
   {
        CircularQueueUsingArray obj=new  CircularQueueUsingArray();
       int added1= obj.offer(1);
       System.out.println("added :"+added1);
        int added2= obj.offer(2);
            System.out.println("added :"+added2);
         int added3= obj.offer(3);
             System.out.println("added :"+added3);
        int added4=   obj.offer(4);
            System.out.println("added :"+added4);
          int added5=  obj.offer(5);
              System.out.println("added :"+added5);
            
          int removed1= obj.poll();
          System.out.println("removed :" + removed1);
           int removed2= obj.poll();
          System.out.println("removed :" + removed2);
   }
}
