/*
 
THIS IS NOT KADANE'S ALGO: 

Kadane's Algorithm

Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

A subarray is a contiguous non-empty sequence of elements within an array.


Example 1

Input: nums = [2, 3, 5, -2, 7, -4]

Output: 15

Explanation:

The subarray from index 0 to index 4 has the largest sum = 15

Example 2

Input: nums = [-2, -3, -7, -2, -10, -4]

Output: -2

Explanation:

The element on index 0 or index 3 make up the largest sum when taken as a subarray
*/
package array.questions.medium;

class KadaneAlgo
{
    public void kadane(int[] arr)
    {
        int sum=0;
        int max=arr[0];
        // for going thorugh each subarray 
        for(int i=0;i<arr.length;i++)
        {
             for(int j=i;j<arr.length;j++)
             {
                 sum=0;// reset sum
                 for(int k=i;k<=j;k++)
                 {
                     sum=sum+arr[k];
                     if(max<sum)
                     {
                         max=sum;
                     }
                 }
             }
             
        }
        System.out.println(max);
    }
}
public class MaxSubArraySum
{
    public static void main(String[] args)
    {
        KadaneAlgo ka=new KadaneAlgo();
        ka.kadane(new int[]{2, 3, 5, -2, 7, -4});
    }
}
