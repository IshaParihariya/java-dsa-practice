/*
Find out how many times the array is rotated

Given an integer array nums of size n, sorted in ascending order with distinct values.
The array has been right rotated an unknown number of times, between 0 and n-1 (including).
Determine the number of rotations performed on the array.

Example 1

Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

Output: 4

Explanation: The original array should be [0, 1, 2, 3, 4, 5, 6, 7]. So, we can notice that the array
has been rotated 4 times.

Example 2

Input: nums = [3, 4, 5, 1, 2]

Output: 3

Explanation: The original array should be [1, 2, 3, 4, 5]. So, we can notice that the array has been rotated 3 times.
*/
package array.questions.easy;

class Solution
{
    //THIS ONE NOT DONE!!
    //using binary search 
    public int solution(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(arr[mid]>arr[mid+1])
            {
               return mid+1; // this would be the count
            }
            
            if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1])
            {
               return mid;
            }
            if(arr[mid]<arr[mid-1])
            {
                end=mid-1;
            }
            
        }
        return -1;
    }
    
    // using for loop 
    public int rotationCount(int[] arr)
{
    int min = arr[0];
    int index = 0;

    for(int i=1;i<arr.length;i++)
    {
        if(arr[i] < min)
        {
            min = arr[i];
            index = i;
        }
    }
    return index;
}

}
public class NumberOfTimesArrayRotated 
{
   public static void main(String[] args)
   {
       Solution s=new Solution();
       int Number=s.solution(new int[]{ 6, 7, 0, 1, 2, 3, 4,5});
       System.out.println(Number);
       
       int ans=s.rotationCount(new int[]{ 6, 7, 0, 1, 2, 3, 4,5});
       System.out.println(ans);
   }
}
