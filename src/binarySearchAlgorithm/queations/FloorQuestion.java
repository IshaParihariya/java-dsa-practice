/*
floor : Floor of a target element is the largest element in the array that is less than or equal to the target.

eg : int a[] = {10,20,30,40,50,60,70,80,90,100}
target : 93
floor : 90

return arr[end] bcuz after the binary search terminates (loop is violated => start > end ) the end point to the floor**

## Memory Trick (super useful)**
Floor → return end
Ceiling → return start
*/



package binarySearchAlgorithm.queations;

import java.util.*;
public class FloorQuestion 
{
    public static void main(String[] args)
    {
      floor(new int []{10,20,30,40,50,60,70,80,90,100} , 102);  
    }
    
    static int floor(int arr[],int target)
    {
        //print array 
        System.out.println("Array : "+Arrays.toString(arr));
        //print the target 
        System.out.println("target : "+target);
        
        if(target<arr[0])
        {
            return -1;
        }
        //solution with binary search 
        int start=0; //start index
        int end=arr.length-1; //end index
        int mid; // mid index
        
        while(start<=end) //loop condition
        {
            mid=start+(end-start)/2; //mid index
            
            if(arr[mid]==target) 
            {
                return arr[mid];
            }
            else if(arr[mid]>target) //LHS search
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        
        //end points to the floor
        return arr[end];
    }
}
