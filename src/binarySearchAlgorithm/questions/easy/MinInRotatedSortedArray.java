/*

// NOT SOLVED GAWD!!

Find minimum in Rotated Sorted Array

Given an integer array nums of size N, sorted in ascending order with distinct values,
and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.

Example 1

Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

Output: 0

Explanation: Here, the element 0 is the minimum element in the array.

Example 2

Input : nums = [3, 4, 5, 1, 2]

Output: 1

Explanation:Here, the element 1 is the minimum element in the array.
*/
package binarySearchAlgorithm.questions.easy;

class MininRotatedArray
{
    public int mininrotatedsortedarray(int[] arr)
    {
        // if length <=2 and >0
        if(arr.length<=2 && arr.length>0)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                    return arr[i+1];
                else
                    return arr[i];
            }
        }
        
        // not considering the not rotated part 
        
        //
        return -1;
    }
}
public class MinInRotatedSortedArray
{
     public static void main(String[] args)
     {
          MininRotatedArray m=new  MininRotatedArray();
          int a=m.mininrotatedsortedarray(new int[]{4, 5, 6, 7, 0, 1, 2, 3});
          System.out.println(a);
     }
}
