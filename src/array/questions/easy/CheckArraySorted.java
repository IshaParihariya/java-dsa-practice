/*
roblem Statement: Given an array of size n, write a program to check if the given array is sorted in
(ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

the array can be in ascending or descending manner so Agnostic Order
*/
package array.questions.easy;

class SortedArray
{
    public void sortedarray(int[] arr)
    {
        int n=arr.length;
        if(arr[0]>arr[n-1]) // maybe descending order 
        {
            for(int i=0;i<=n-2;i++)
            {
               if(arr[i]>arr[i+1])
               {
                   if(i==n-2)
                   {
                       System.out.println("Array sorted in descending order");
                   }
                 // will check all
               }
               else
               {
                   System.out.println("array isnt sorted");
                   break;
               }
            }
        }
        if(arr[0]<arr[n-1]) // maybe ascending order
        {
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]<arr[i+1])
                {
                     if(i==n-2)
                   {
                       System.out.println("Array sorted in Ascending order");
                   }
                    //will check all cant print for each time
                }
                else
                {
                 System.out.println("array isnt sorted");
                 break;
                }
            }
            
        }
        if(arr[0]==arr[n-1])//(3,4,6,5,3) or (3,3,3,3,3)
        {
            for(int i=0;i<=n-2;i++)
            {
                if(arr[i]==arr[i+1])
                {
                    if(i==n-2)
                    {
                        System.out.println("The array is having same elements");
                    }
                    // will check for all indeces
                }
                else
                    System.out.println("Array isnt sorted");
            }
        }
    }
}
public class CheckArraySorted
{
    public static void main(String[] args)
    {
        SortedArray sa=new SortedArray();
        sa.sortedarray(new int[]{6,6,6,6,6,6});
    }
}
