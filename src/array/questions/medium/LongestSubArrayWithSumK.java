/*
Longest subarray with sum K
Medium

Hints
Company
Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.


Example 1

Input: nums = [10, 5, 2, 7, 1, 9],  k=15

Output: 4

Explanation:

The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2

Input: nums = [-3, 2, 1], k=6

Output: 0

Explanation:

There is no sub-array in the array that sums to 6. Therefore, the output is 0.
*/
package array.questions.medium;

class Solution
{
    public int solution(int[] arr,int k)
    {
        int sum=0;
        int max=0;
        int count=0;
         int temp=0;
        for(int i=0;i<arr.length;i++)
        {
           sum=sum+arr[i];
           if(temp<sum)
           {
           temp=sum;
           }
           count++;
           if(count>=max) // keep increasing the count of the elements basically length of the sub array
              {
                  max=count;
              }
           if(sum>k)
           {
               count=0;
               sum=0;
               i--; // again loop not ending
              continue; // skip the iteration and go to the next element
           }
           if(sum==k && temp!=sum)//loop here not ending
           {                 
               count=0;
               sum=0;
               i--;
           }
           
        }
        if(sum!=k)
        {
            return 0;
        }
        else
        return max;
    }
}
public class LongestSubArrayWithSumK 
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int ans=s.solution(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 1);
        System.out.println(ans);
    }
}
