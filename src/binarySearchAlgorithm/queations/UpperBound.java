/*
Upper Bound

Given a sorted array of nums and an integer x, write a program to find the upper bound of x.

The upper bound of x is defined as the smallest index i such that nums[i] > x.

If no such index is found, return the size of the array.

Example 1

Input : n= 4, nums = [1,2,2,3], x = 2

Output:3

Explanation:

Index 3 is the smallest index such that arr[3] > x.

Example 2

Input : n = 5, nums = [3,5,8,15,19], x = 9

Output: 3

Explanation:

Index 3 is the smallest index such that arr[3] > x.
*/
package binarySearchAlgorithm.queations;

class UpperBound_
{
    public int upperboundbinary(int[] arr,int x)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        // while loop
        int ans=arr.length;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            /*if(arr[mid]==x)
            {     if {2,2,2,2} then it take miss the smallest index at it will stop searching so not adding here
                return mid+1;
            }*/
            if(arr[mid]>x)
            {
                ans=mid;
                end=mid-1;
            }
            if(arr[mid]<x)
            {
                start=mid+1;
            }
        }
        return ans;
    }
}
public class UpperBound 
{
    public static void main(String[] args)
    {
        UpperBound_ u=new UpperBound_();
       int ans= u.upperboundbinary(new int[]{3,5,8,15,19},9);
       System.out.println(ans);
    }
}
