package slidingWindowAndTwopointer;
// INCOMPLETE
/*
1004. Max Consecutive Ones III
Medium
Topics
premium lock icon
Companies
Hint
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
package slidingWindowAndTwopointer;


SOLUTION:***
subarray with max k 0's can be found and that will be the max consecutive ones with atmost k 0's..
*/

class ConsecutiveOnes111Porblem
{
    public int consecutiveOnes111Porblem(int[] arr,int k)
    {
        //pointer
        int l=0;
        
        //length
        int length=0;
        //max length 
        int maxLength=0;
        // flip
        int flip=0;
        
        // for loop
        for(int r=0;r<arr.length;r++)
        {
            // 0 case
            if(arr[r]==0)
            {
               flip++; 
               length=r-l+1;
            }
            // if k<flip => shrink it
            while(flip>k)
            {
                l++;
                
                // if 0 
                if(arr[l]==0)
                {
                    flip--;
                    length=r-l+1;
                    l++;
                    r=l;
                    flip=0;
                }
            }
            // 1 case
            if(arr[r]==1)
            {
                length=r-l+1;
            }
            maxLength=Math.max(length,maxLength);
            length=0;
        }
      return maxLength;
    }
}
public class ConsecutiveOnes111
{
    public static void main(String[] args)
    {
        // object of class
         ConsecutiveOnes111Porblem obj=new  ConsecutiveOnes111Porblem();
         int r=obj.consecutiveOnes111Porblem(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
         System.out.println(r);
    }
}
