/*
Priority Queue : Elements are processed based on priority , NOT INSERTION ORDER

MIN HEAP : the smallest element has the highest priority so it will processed first 
doesnt allow NULL
syntax : 
PriorityQueue<> name = new PriorityQueue<>();

MAX HEAP : the largest element is given highest priority so it will processed first 
syntax : 
PriorityQueue<> name = new PriorityQueue<>(Collections.reverseOrder());


*/
/*
both min and max heap they internaaly are binary heap so printing of elements might feel like random but its not random 
its a heap internally **
*/
package javacollections_;

import java.util.PriorityQueue;
import java.util.Collections;
public class Queue_PriorityQueue 
{
    public static void main(String[] arge)
    {
        // min heap : smallest element = highest priority
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
         pq.add(10);
          pq.add(2);
           pq.add(21);
            pq.add(11);
            System.out.println("min heap");
            System.out.println(pq); //[2,10,3,21,11]
            // poll = removal 
            System.out.println("highest priority element : "+pq.poll()); // gives highest priority element first that is smallest one // 2
            System.out.println("2nd highest priority element : "+pq.poll()); // 3
            System.out.println("3rd highest priority element : "+pq.poll()); // 10
            System.out.println("4th highest priority element : "+pq.poll()); // 11
            System.out.println("5th highest priority element : "+pq.poll()); // 21
            
            // max heap : largest element = highest priority 
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(3);
         pq1.add(10);
          pq1.add(2);
           pq1.add(21);
            pq1.add(11);
            System.out.println("max heap");
            System.out.println(pq1); //[2,10,3,21,11]
            //poll = removal 
            System.out.println("highest priority element : "+pq1.poll()); // gives highest priority element first that is largest one // 21
            System.out.println("2nd highest priority element : "+pq1.poll()); // 11
            System.out.println("3rd highest priority element : "+pq1.poll()); // 10
            System.out.println("4th highest priority element : "+pq1.poll()); // 3
            System.out.println("5th highest priority element : "+pq1.poll()); // 2
    }
}
