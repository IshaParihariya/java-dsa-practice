/*

do again its not solved

NOTE : 
In Java, the condition part of for loop must be a boolean expression.
 for(int i=num1.length,j=0 ; i<=size,j<=num2.length-1 ; i++,j++) NOT ALLOWED AS COMMA IN THE CONDITION
BUT  for(int i=num1.length,j=0 ; i<=size && j<=num2.length-1 ; i++,j++)**

Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays.
The elements in the union must be in ascending order.



The union of two arrays is an array where all values are distinct and are present in either the first array, 
the second array, or both.


Example 1

Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation:

The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Example 2

Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]

Output: [1, 3, 4, 5, 6, 7, 8, 9]

Explanation:

The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2
*/
package array.questions.easy;
import java.util.Arrays;

class Union_
{
    public void union(int[] num1,int[] num2)
    {
        // The size of the new array union
        int n1=num1.length;
        int n2=num2.length;
        int size=n1+n2; // max . this will be the size
        // new array union to store the union of both the arrays 
        int[] union=new int[size];// took size+1 for safety
        
        
        // storing num1 in union first
        for(int i=0,j=0 ; i<size && j<num1.length ; i++,j++) 
        {
           union[i]=num1[j];
        }
        // storing num2 in union now
        for(int i=num1.length,j=0;i<size && j<num2.length;i++,j++) // java allows boolean in the condition
        {
            union[i]=num2[j];
        }
        
        
        // sorting the union array
        // both are already sorted individually 
        for(int i=0;i<size-1;i++) 
        {
            if(union[i]>union[i+1]) // swap if a>b (a comes before b)
            {
                int temp=union[i];
                union[i]=union[i+1];
                union[i+1]=temp;
                i=-1; // restart from start
                size--;

            }
        }
       // System.out.println(Arrays.toString(union));
       
       // now Removal of duplicates from the array
       
       for(int i=0;i<size-1;i++)
       {
           if(union[i]!=union[i+1])
           {
               //do nothing and eat 5 star
           }
           else
           {
               for(int j=i;j<size-1;j++)//swapping
               {
                   union[j]=union[j+1];
               }
               i--;
           }
       }
       
       // now finally after sorting and removing duplicates 
       
       // for size of the final answer array u
       int count=0;
       for(int i=0;i<size-1;i++)
       {
           if(union[i]!=union[i+1])
           {
               count++;
           }
            count++;
       }
       
       
       int[] u=new int[count]; // new array for final result
       
       int i=0;
       while(i < size-1 && union[i]!=union[i+1])
       {
           u[i]=union[i];
           i++;
       }
       // for last element
       u[i] = union[size-1];

       System.out.println(Arrays.toString(u));
    }
}
public class Union
{
    public static void main(String[] args)
            {
            Union_ u=new Union_();
            u.union(new int[]{3, 4, 6, 7, 9, 9}, new int[]{1, 5, 7, 8, 8});
            }
}
