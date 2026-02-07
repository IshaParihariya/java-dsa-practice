/*
Sort an array of 0's 1's and 2's
Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.

The sorting must be done in-place, without making a copy of the original array.


Example 1

Input: nums = [1, 0, 2, 1, 0]

Output: [0, 0, 1, 1, 2]

Explanation:

The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Example 2

Input: nums = [0, 0, 1, 1, 1]

Output: [0, 0, 1, 1, 1]

Explanation:

The nums array in sorted order has 2 zeroes, 3 ones and zero twos
*/
package array.questions.medium;
import java.util.Arrays;
class SortInPlace_
{
    public void sortinplace(int[] arr)
    {
       int temp;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr.length-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
       System.out.println(Arrays.toString(arr));
    }
}
public class SortingInPlace 
{
    public static void main(String[] args)
    {
        SortInPlace_ sp=new SortInPlace_();
        sp.sortinplace(new int[]{1, 0, 2, 1, 0});
    }
}
