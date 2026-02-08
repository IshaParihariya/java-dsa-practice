/*
Lower Bound

Given a sorted array of nums and an integer x, write a program to find the lower bound of x.

The lower bound algorithm finds the first and smallest index in a sorted array where the value at 
that index is greater than or equal to a given key i.e. x.

If no such index is found, return the size of the array.

Example 1

Input : nums= [1,2,2,3], x = 2

Output:1

Explanation:

Index 1 is the smallest index such that arr[1] >= x.

Example 2

Input : nums= [3,5,8,15,19], x = 9

Output: 3

Explanation:

Index 3 is the smallest index such that arr[3] >= x.
*/
package binarySearchAlgorithm.queations;

class LowerBound_
{
    // approach one : linear search
    public int lowerboundlinear(int[] arr,int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=x)
            {
                return i;
            }
        }
        return arr.length;
    }
    
    // approach two : binary search
    public int lowerboundbinary(int [] arr,int x)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        
        // if the array is empty returning 0
        if(arr.length<1)
            return 0;
        
        // while loop
        int ans=arr.length;
        while(start<=end)
        {
            mid=start+(end-start)/2;

            if(arr[mid]<x)
            {
                start=mid+1;
            }
            if(arr[mid]>=x)
            {
               ans=mid;
               end=mid-1;
            }
        }
        return ans;
    }
}
public class LowerBound 
{
    public static void main(String[] args)
    {
        LowerBound_ lb= new LowerBound_();
        // linear 
        int x=lb.lowerboundlinear(new int[]{1,2,2,3}, 2);
        System.out.println(x);
        // binary 
        int y=lb.lowerboundbinary(new int[]{1,2,2,3}, 2);
        System.out.println(y);
    }
}
