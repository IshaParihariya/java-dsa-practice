/*
Count Occurrences in a Sorted Array

You are given a sorted array of integers arr and an integer target. 
Your task is to determine how many times target appears in arr.

Return the count of occurrences of target in the array.

Example 1

Input: arr = [0, 0, 1, 1, 1, 2, 3], target = 1

Output: 3

Explanation: The number 1 appears 3 times in the array.

Example 2

Input: arr = [5, 5, 5, 5, 5, 5], target = 5

Output: 6

Explanation: All elements in the array are 5, so the target appears 6 times.
*/
package binarySearchAlgorithm.queations.easy;

class Countocc
{
    public int countoccurence(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        //while loop 
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            if(arr[mid]==target)
            {
                
            }
        }
        return -1; 
    }
}
public class CountOccurence 
{
    public static void main(String[] args)
    {
         Countocc c=new Countocc();
         c.countoccurence(new int[]{0, 0, 1, 1, 1, 2, 3}, 0);
    }
}
