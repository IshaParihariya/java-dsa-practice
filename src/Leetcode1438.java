
import java.util.LinkedList;
import java.util.Queue;

class Solution 
{
    //try this later on 
    //could not solve yet
    public int longestSubarray(int[] nums, int limit) 
    {
        //kadane is used for longest sum in subarrays all possible ones

        int maxLength=0;

        for(int i=0;i<nums.length;i++)
        {
            //nums[i]-nums[i] is counted as a subarray as well so..
            //so will start from length 1
            int length=1;
            //update ml
            maxLength=Math.max(maxLength,length);
            //we counted nums[i]-nums[j] where i==j
            //this case we already counted

            //int sum=nums[i]; //and as liit could be starting from 0 only
            //so we are safe here
            //its always 0 or above limit

            //so we starting from i+1 as well

            Queue<Integer> queue=LinkedList<>();

            for(int j=i+1;j<nums.length;j++)
            {
                int sum=Math.abs(nums[j]-nums[i]); //first  pair 

                
                if(sum>limit)
                {
                    break; //as futher there wont be larger length subarray with this limit absolute sum
                }

            //when -> sum<=limit   
            if(sum<=limit)
            {  
                //then store in queue
                //we will compare each pair with each other

                queue.add(nums[j]);

                //we need to do check for each pair here

                           
                length=j-i+1;
                maxLength=Math.max(maxLength,length); //our max length
            }
            }
        }

        return maxLength;

    }
}
public class Leetcode1438 {
    
}
