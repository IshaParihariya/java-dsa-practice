
package fipkartGrid8;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution123456 
{
    public int[] topKFrequent(int[] arr, int k) 
    {
        //lets use priority queue
        //by default in java its min prioeirty queue or heap
        // so we need to use max heap => comparator


//storing in hash map
        HashMap<Integer,Integer> map = new HashMap<>();

for(int num : arr){
    map.put(num, map.getOrDefault(num,0)+1);
}

//each key value pair is an entry and its givevn like this..Map.Entry<type,type>
       // PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(Collections.reverseOrder()); 
       //NOTE HERE BRO COMPARATOR DOESNT KNOW HOW TO COMPARE 
       //SO WE NEED TO ADD A LOGIC HERE ABOUT HOW TO COMPARE AS TWO VALUES ARE THERE IN THE ENTRY
       // SO... 
       PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b) -> b.getValue()
       - a.getValue()); 

       // (a,b) -> Integer.compare(b.getValue(), a.getValue()) => INTERVIEW PREFERABLE..

       /*
       brief:
Entry A = (1,3)
Entry B = (2,5)

Comparator asks:

Which should come first?

Your answer:

Compare 5 and 3.

So (2,5) comes before (1,3).
       */
       //pq takes only one data type at a time..


        //iterating each entry.....
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) //like keySet => entrySet
        {
            pq.offer(entry);
        }


        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            //extracting key and adding it in the array
           Map.Entry<Integer,Integer> entry = pq.poll();
           result[i] = entry.getKey();
        }

        return result;

    }
}
public class TopKFrequentElements {
    
}
