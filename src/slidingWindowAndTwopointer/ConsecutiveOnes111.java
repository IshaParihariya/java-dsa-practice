package slidingWindowAndTwopointer;
// INCOMPLETE
/*
1004. Max Consecutive Ones III

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
    public void consecutiveOnes111Porblem(int[] arr,int k)
    {
        // pointers 
        int l=0;
        // r
        int r=0;
        
        int length=0;
        
        // while loop
        while(l<arr.length)
        {
            
        }
    }
}
public class ConsecutiveOnes111
{
    public static void main(String[] args)
    {
        // object of class
         ConsecutiveOnes111Porblem obj=new  ConsecutiveOnes111Porblem();
         obj.consecutiveOnes111Porblem(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
         //System.out.println(r);
    }
}
