/*
Floor and Ceil in Sorted Array

Given a sorted array nums and an integer x. Find the floor and ceil of x in nums.
The floor of x is the largest element in the array which is smaller than or equal to x. 
The ceiling of x is the smallest element in the array greater than or equal to x. 
If no floor or ceil exists, output -1.

Example 1

Input : nums =[3, 4, 4, 7, 8, 10], x= 5

Output: 4 7

Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2

Input : nums =[3, 4, 4, 7, 8, 10], x= 8

Output: 8 8

Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
*/
package binarySearchAlgorithm.questions.easy;

class FloorandCeiling
{
   public void floorandceiling(int[] num,int target)
   {
       // end = floor 
       // start = ceiling 
       int start=0;
       int end=num.length-1;
       int mid=0;
       
       // while loop
       while(start<=end)
       {
           mid=start+(end-start)/2;
           
           if(num[mid]==target)
           {
               System.out.println(num[mid]+" "+num[mid]);
               return;
           }
           if(num[mid]>target)
           {
               end=mid-1; 
           }
           if(num[mid]<target)
           {
               start=mid+1;
           }
       }
       System.out.println(num[end]+" "+num[start]);
   }
}
public class FloorAndCeil 
{
    public static void main(String[] args)
    {
        FloorandCeiling fc=new FloorandCeiling();
        fc.floorandceiling(new int[]{3, 4, 4, 7, 8, 10}, 5);
    }
}
