/*
189 . ROTATE ARRAY (to right)
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 
*/
package leetcode.arrayQuestions;

import java.util.Arrays;

// So time complexity becomes here in this solution :
// O(n × k)
class Solution1
{
    public void rotate(int[] arr, int k)
    { 
          System.out.println("before rotation: "+Arrays.toString(arr));
        for(int rotatetimes=1 ; rotatetimes<=k; rotatetimes++)
        {
        int temp=arr[arr.length-1];
        int length=arr.length; // length of the array
        
        for(int i=arr.length-1;i>0;i--)
        {
                        arr[i]=arr[i-1];
        }
        arr[0]=temp;
        }
        
        System.out.println("after rotation: "+Arrays.toString(arr));
    }
}
public class RotateArray189 
{
    public static void main(String[] args)
    {
    Solution1 s=new Solution1();
    s.rotate(new int[]{-1,-100,3,99},2);
    
    }
}
