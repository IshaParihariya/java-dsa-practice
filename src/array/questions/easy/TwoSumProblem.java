/*
NOTE :
In Java two values can be returned using an array

Two Sum

Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements
in nums such that they add up to target.

Each input will have exactly one solution, and the same element cannot be used twice.


Example 1

Input: nums = [1, 6, 2, 10, 3], target = 7

Output: [0, 1]

Explanation:

nums[0] + nums[1] = 1 + 6 = 7

Example 2

Input: nums = [1, 3, 5, -7, 6, -3], target = 0

Output: [1, 5]

Explanation:

nums[1] + nums[5] = 3 + (-3) = 0
*/
package array.questions.easy;

import java.util.Arrays;
class TwoSum_ // class 
{
    public int[] twosum(int[] nums,int target) // method
    {
        int i,j;
     for(i=0;i<nums.length;i++)
     {  
         for(j=i+1;j<nums.length;j++)      
         {
         if( nums[i]+nums[j]==target)
         {
           return new int[]{i,j};
         }
         }
     }
     return new int[]{-1,-1};
    }
}
public class TwoSumProblem 
{
    public static void main(String[] args)
    {
        TwoSum_ t=new TwoSum_(); // object of the class
        int[] A=new int[2]; 
        A=t.twosum(new int[]{1, 3, 5, -7, 6, -3}, 0); // method called
        System.out.print(Arrays.toString(A));
    }
}
