/*
Maximum Consecutive Ones

Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s.

Example 1

Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]

Output: 3

Explanation:

The maximum consecutive 1s are present from index 4 to index 6, amounting to 3 1s

Example 2

Input: nums = [0, 0, 0, 0, 0, 0, 0, 0]

Output: 0

Explanation:

No 1s are present in nums, thus we return 0
*/
package array.questions.easy;

class MaxNumberOfC1s
{
    public int max(int[] arr)
    {
        int count=0;
        int max=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==1)
                {
                    count++;
                    if(count>max)
                {
                    max=count;
                }
                }
                else // when a 0 comes
                {
                    count=0;
                }
                
            }
            
        return max;
    }
}
public class MaxNumberOfConsecutive1s
{
    public static void main(String[] args)
    {
        MaxNumberOfC1s mn=new MaxNumberOfC1s();
        int count=mn.max(new int[]{1, 1, 0, 0, 1, 1, 1, 0,1,1,0,1});
        System.out.println(count);
    }
}
