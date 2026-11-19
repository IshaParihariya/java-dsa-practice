class Solution 
{
    public int findPeakElement(int[] nums) 
    {
       //here what we are seeing is if mid < mid+1 -> means increasing slop
       //else decreasing slope
       //and we can return any peek so yes

       int start=0;
       int end=nums.length-1;
       int mid=start + (end-start)/2;

       while(start<end)
       {
        mid=start + (end-start)/2;

        if(nums[mid]<nums[mid+1])
        {
            //increasing slope
            //hence move right 
            //will find it in right and if after this we getting 
            //a decreasing slope means need to return this elem 
            //its a peek
            start=mid+1;
        }
        else
        {
            //decreasing slope
            //move in left
            end=mid;
        }
       }

       return start;
    }
}
        //so here i can simply return the max element as it is also a peak element
        //tc :O(N)
        // int maxi=Integer.MIN_VALUE;
        // int index=0;

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(maxi<nums[i])
        //     {
        //         maxi=nums[i];
        //         index=i;
        //     }
            
        // }

        // return index;
//     }
// }
public class Leetcode162 {
    
}
