class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        //KADANE'S ALGORITHM 
        //keeping a negative previous sum will always give us a smaller result than starting fresh from the next element.
        int maxi=Integer.MIN_VALUE; 

        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];

            maxi=Math.max(maxi,sum);

            if(sum<0)
            {
                sum=0; //start over then 
            }

        }

        return maxi;





        //TLE FOR THIS ONE SOLUTION
        //get sum of each subarray and atlast return the max one..

        // int maxi=Integer.MIN_VALUE; 

        // int l=0;
        // int r=l;

        // int sum=0;

        // while(l<nums.length)
        // {
        //     sum=sum+nums[r];

        //     maxi=Math.max(sum,maxi);

        //     r++;

        //     if(r==nums.length)
        //     {
        //         sum=0; //again start
        //         l++;
        //         r=l;
        //     }
        // }

        // return maxi;
    }
}

public class Leetcode53KadaneAlgo {
    
}
