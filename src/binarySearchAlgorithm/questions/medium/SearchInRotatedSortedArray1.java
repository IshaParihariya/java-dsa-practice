/*
Search in rotated sorted array-I

Given an integer array nums, sorted in ascending order (with distinct values)
and a target value k. The array is rotated at some pivot point that is unknown.
Find the index at which k is present and if k is not present return -1.


Example 1

Input : nums = [4, 5, 6, 7, 0, 1, 2], k = 0

Output: 4

Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums.
Thus, we get output as 4, which is the index at which 0 is present in the array.

Example 2

Input: nums = [4, 5, 6, 7, 0, 1, 2], k = 3

Output: -1

Explanation: Here, the target is 3. Since 3 is not present in the given rotated sorted array.
Thus, we get the output as -1.
*/
package binarySearchAlgorithm.questions.medium;

class SearchinSortedArray1
{
    public int searchinsortedarray(int[] arr,int target)
    {
        
        // if length of the array == 2 example : [2,3] or [3,2]
   
        if(arr.length<=2)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    return i;
                }
            }
            return -1;
        }
        
        // for checking at what index the array has
        
        int m=0; // index where array is rotated
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                m=i+1;
                break;
            }
        }
        
        // binary search now for LHS : [4, 5, 6, 7,  
        int start=0;
        int end=m-1;
        int mid;
        
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(arr[mid]==target)
                return mid;
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;
        }
        
        // binary search for the RHS : 0, 1, 2]
        start=m;
        end=arr.length-1;
        while(start<=end)
        {
             mid=start+(end-start)/2;
            
            if(arr[mid]==target)
                return mid;
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;
        }
        
        return -1;
    }
}
public class SearchInRotatedSortedArray1
{
    public static void main(String[] args)
    {
        SearchinSortedArray1 s=new SearchinSortedArray1();
        int index=s.searchinsortedarray(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(index);
    }
}
