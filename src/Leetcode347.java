
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); //counting the frequencies
        }

        //now go through the map
        //and put each value in this pq
        //we need to do this in descending order
        //3 ways:
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder())
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)-> Integer.compare(map.get(b),map.get(a)) //sorting numbers based on their frequencies
        );

        for(Integer key: map.keySet())
        {
            pq.offer(key);
        }

        int[] result=new int[k];

        for(int i=0;i<k;i++)
        {
            result[i]=pq.poll();
        }

        return result;

    }
}
public class Leetcode347 {
    
}
