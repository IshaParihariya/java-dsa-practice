/*
896. Monotonic Array
Easy
Topics
premium lock icon
Companies
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 
note : [2,2,2] is monotonic

Constraints:

1 <= nums.length <= 105
-105 <= nums[i] <= 105
*/

package array.questions.easy;


// this code took 2ms 
class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        
        // many issues in this code 
        
        /*
        // if sorted either in ascending or descending order then monotonic else not

        // loop 
        // ascending order
        // boolean flag
        boolean monotonic=false;
            if(nums[0]<nums[1])
            {
                 for(int i=1;i<nums.length-1;i++)
        {
            if(!(nums[i]<=nums[i+1]))
            {
                monotonic=false;
                return monotonic;
            }
            else
            {
                monotonic=true;
            }
        }
            }
       // descending order
       if(nums[0]>nums[1])
       {
        for(int i=1;i<nums.length-1;i++)
        {
            if(!(nums[i]>=nums[i+1]))
            {
               monotonic=false;
               return monotonic;
            }
            else
            {
               monotonic=true;
            }
        }
       }
       return monotonic;
*/
        
        // lets assume true
        boolean increasing=true;
        boolean decreasing=true;
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                increasing=false;
            }
            if(nums[i]<nums[i+1])
            {
                decreasing=false;
            }
        }
        
        // equal to cases will be handled here
        //track both patterns simultaneously
        return increasing||decreasing;
        
    }
    
}

// this one took 0ms (best one)
class Solution1 {
    public boolean isMonotonic(int[] nums) {
        if(nums[0] >= nums[nums.length-1]){
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }
        } else if(nums[0] <= nums[nums.length-1]){
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] > nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
public class MonotonicArray896
{
    //tried on leetcode 
}
