/*
Search X in sorted array

Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer.
If the target is found in the array, return its index. If the target is not found, return -1.

Example 1

Input: nums = [-1,0,3,5,9,12], target = 9

Output: 4

Explanation: The target integer 9 exists in nums and its index is 4

Example 2

Input: nums = [-1,0,3,5,9,12], target = 2

Output: -1

Explanation: The target integer 2 does not exist in nums so return -1
*/
package binarySearchAlgorithm.queations;
import java.util.*;
import java.util.Arrays;

class Searching
{
   // approach one  : linear search 
    // O(N)
    public int linearsearch(int[] num,int target)
    {
        boolean targetfound=false;
       for(int i=0;i<num.length;i++)
       {
           if(num[i]==target)
           {
               targetfound=true;
               return i;
           }
       }
       return -1;
    }
    
    // approach two : binary search 
    // O(log N)
    public int binarysearch(int[] num,int target)
    {
        int start=0;
        int end=num.length-1;
        int mid=0;
        
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(target==num[mid])
            {
                return mid;
            }
            if(target<num[mid])
            {
                end=mid-1;
            }
            if(target>num[mid])
            {
                start=mid+1;
            }
        }
        return -1;
    }
    // built in method for binary search
    public void builtinmethod()
    {
        int[] arr={-1,0,3,5,9,12};
       int ans=Arrays.binarySearch(arr,9);
        System.out.println(ans);
                }
}
public class SearchXInArray 
{
    public static void main(String[] args)
    {
        // obj of the class 
        Searching s=new Searching();
        // method called for linear search 
        int index=s.linearsearch(new int[]{-1,0,3,5,9,12},9);
        System.out.println(index);
        //method called for binary search
        int index1=s.binarysearch(new int[]{-1,0,3,5,9,12},9);
        System.out.println(index1);
        // built in method
        s.builtinmethod();
    }
}
