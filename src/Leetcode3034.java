class Solution 
{
    public int countMatchingSubarrays(int[] nums, int[] pattern) 
    {
        //brute force first..

        int m=pattern.length;

        int count=0;

        for(int i=0;i<nums.length-m;i++)
        {
            int len=0;

            for(int k=0;k<m;k++)
            {
                if(pattern[k]==1 && nums[i + k]<nums[i + k + 1])
                {
                    //continue then
                    len++;
                }
                else if(pattern[k]==0 && nums[i + k] == nums[i + k + 1])
                {
                    //continue
                    len++;
                }
                else if(pattern[k]==-1 && nums[i + k] > nums[i + k + 1])
                {
                    //contiue
                    len++;
                }
                else
                {
                    break; //as this is not going to be the subarray right here 
                }

            }

            if(len==m)
            {
                count++;
            }

            
        }

        return  count;
    }
}
public class Leetcode3034 {
    
}
