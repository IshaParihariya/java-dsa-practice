/*
35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/
package array.questions.easy;

// SOLUTION ACCEPTED BY LEETCODE  ( but not expected )
class SolutionSIP 
{
    public int searchInsert(int[] arr, int target) 
    {
        // binary search 
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<=end)
        {
            mid=start-((start-end)/2);

            // found at mid
            if(arr[mid]==target)
            {
                return mid;
            }
            // target < mid
            else if(target<arr[mid])
            {
                if(mid>0 && arr[mid-1]<target)
                {
                    return mid;
                }
                //else
               end=mid-1;
            }
            //target>mid
            else if(target>arr[mid])
            {
                if(mid+1==arr.length)
                {
                    return mid+1;
                }
                //else
                start=mid+1;
            }
        }
        return mid;
    }
}

// SOLUTION WHICH IS EXPECTED NORMALLY 
class SolutionSIP1
{
    public int consecutiveOnes111Porblem(int[] arr,int target)
    {
         // binary search 
        int start=0;
        int end=arr.length-1;
        int mid=0;
while(start <= end)
{
    mid = start + (end - start)/2;

    if(arr[mid] == target)
        return mid;
    else if(target < arr[mid])
        end = mid - 1;
    else
        start = mid + 1;
}

return start; //For Search Insert Position, we change only the final return in binary search 
// everything same as binary search just this change

    }
}
public class SearchInsertPosition {
    
}
