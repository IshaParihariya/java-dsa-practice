
package map;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution 
{
    public int findLeastNumOfUniqueInts(int[] arr, int k) 
    {
        //get counts of all elems
        //elems with lowest count remove it first 
        //on the basis of k value

        //count of each
        Map<Integer,Integer> map=new HashMap<>(); //elem count

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        //min priority queue on basis of lowest to highest frequency 
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>
        (
            (a,b)->Integer.compare(a.getValue(), b.getValue())
        );

        pq.addAll(map.entrySet());

        while(k>0 && !pq.isEmpty())
        {
            //here take the freq wise and make the count-- in the map and update in the pq
            
            Map.Entry<Integer,Integer> entry=pq.poll();

            Integer freq=entry.getValue();

            if(k>=freq)
            {
                k=k-freq;
                map.remove(entry.getKey());
            }
            else
            {
                break; //as there will b e further greater than freq in the pq 
                //so we stopped here only
            }

        }

        return map.size();
    }
}
public class Leetcode1481 {
    
}
