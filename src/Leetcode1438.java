class Solution 
{
    //will try this tom
    public int longestSubarray(int[] nums, int limit) 
    {
        //kadane is used for longest sum in subarrays all possible ones

        int maxLength=0;

        for(int i=0;i<nums.length;i++)
        {
            int length=0;

            for(int j=i;j<nums.length;j++)
            {
                int sum=Math.abs(nums[i]-nums[j]);

                if(sum>limit)
                {
                    break; //as futher there wont be larger length subarray with this limit absolute sum
                }

                if(sum<=limit)
                {
                    length=j-i+1;
                    maxLength=Math.max(maxLength,length);
                }
            }
        }

    }
}
public class Leetcode1438 {
    
}
