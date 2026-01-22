/*
SELECTION SORT :
-> Find the smallest (or largest) element from the unsorted part
-> Place it at the correct position
-> Repeat this until the array is sorted

-Ascending order → select the minimum element each time
-Descending order → select the maximum element each time

* Time Complexity : O(n²) (best, average, worst)
* Space Complexity : O(1)
* In-place sorting :
-> The sorting algorithm rearranges the elements within the same array,
   without using extra memory (or using only a constant amount of memory).
* Performs good for small lists or small arrays

*/
// ascending order sort :
package sorting;

import java.util.*;

public class SelectionSort
{
    public static void main(String[] args)
    {
        
   System.out.println("-----selection sort-----");
   int arr[] = {11,-2,0,13,4,-50,16,33,3,8,-180,80};  
   System.out.println("unsorted array :"+ Arrays.toString(arr));
   
   selectionSort(arr);
   System.out.println("sorted array :"+ Arrays.toString(arr));
   
    }
    
    static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++) //ith pass
        {
           for(int j = 0;j<arr.length-1;j++)
           {
               
           }
        }
    }
}
