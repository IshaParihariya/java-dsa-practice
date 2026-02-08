/*
Search insert position

Given a sorted array of nums consisting of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Example 1

Input: nums = [1, 3, 5, 6], target = 5

Output: 2

Explanation: The target value 5 is found at index 2 in the sorted array. Hence, the function returns 2.

Example 2

Input: nums = [1, 3, 5, 6], target = 2

Output: 1

Explanation: The target value 2 is not found in the array. However, it should be inserted at index 1 to maintain the sorted order of the array.
*/
package binarySearchAlgorithm.queations;

class SearchInsertPosition_
{
    public int searchinsertposition(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int ans=start;
        
        // while loop
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            if(arr[mid]<target)
            {
                ans=mid;
                start=mid+1;
            }
        }
      return ans;  
    }
}
public class SearchInsertPosition
{
    public static void main(String[] args)
    {
    SearchInsertPosition_ s=new SearchInsertPosition_();
    int ans=s.searchinsertposition(new int[]{1, 3, 5, 6},5);
    
    }
}
