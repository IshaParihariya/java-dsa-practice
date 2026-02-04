/*
Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1.


Example 1

Input: nums = [2, 3, 4, 5, 3], target = 3

Output: 1

Explanation:

The first occurence of 3 in nums is at index 1

Example 2

Input: nums = [2, -4, 4, 0, 10], target = 6

Output: -1

Explanation:

The value 6 does not occur in the array, hence output is -1
*/
package array.questions.easy;

class LinearSearch_
{
    public int linearsearch(int [] arr,int target)
    {
        boolean targetfound=false;
        int i;
        for( i=0;i<arr.length-1;i++)
        {
            if(target==arr[i])
            {
                targetfound=true;
                break;
            }
        }
        if(targetfound==false)
        {
            return -1; // return -1 if the trget not found in the array
        }
        return i; // return index of the target
    }
}
public class LinearSearch
{
    public static void main(String[] args)
    {
         LinearSearch_ l=new  LinearSearch_();
         int result=l.linearsearch(new int[]{1,2,3,4,5,6}, 5);
         System.out.println(result);
    }
}
