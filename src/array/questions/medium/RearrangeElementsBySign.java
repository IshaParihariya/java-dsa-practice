/*
 Rearrange array elements by sign

Given an integer array nums of even length consisting of an equal number of positive and negative integers.
Return the answer array in such a way that the given conditions are met:

Every consecutive pair of integers have opposite signs.


For all integers with the same sign, the order in which they were present in nums is preserved.


The rearranged array begins with a positive integer.

Example 1

Input : nums = [2, 4, 5, -1, -3, -4]

Output : [2, -1, 4, -3, 5, -4]

Explanation:

The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

Example 2

Input : nums = [1, -1, -3, -4, 2, 3]

Output : [1, -1, 2, -3, 3, -4]

Explanation:

The positive number 1, 2, 3 maintain their relative positions and -1, -3, -4 maintain their relative positions
*/
package array.questions.medium;

import java.util.Arrays;


class RearrangeElementsBySign1
{
    public int[] rearrangeElementsBySign(int[] arr)
    {
        // positive elements stored in this array
        int[] p=new int[arr.length/2];
        //-ve elements stored in this array
        int[] n=new int[arr.length/2];
        
        for(int i=0,j=0,k=0;i<arr.length&&j<p.length&&k<n.length;i++,j++,k++)
        {
            if(arr[i]>=0)// +ve // cpmsiderimg 0 as a +ve element
            {
                p[j]=arr[i];
            }
             if(arr[i]<0)// -ve
            {
                n[k]=arr[i];
            }
             
        }
        
        // for loop 
        // storing elements in the arr 
        // if i%2==0 => store an element from p array 
        // else from n array
        for(int i=0,j=0;i<arr.length&&j<p.length;i++,j++)
        {
            if(i%2==0||i==0)
            {
                arr[i]=p[j];
                j=j-1;
            }
            else
            {
                arr[i]=n[j];
            }
        }return arr;
    }
}
public class RearrangeElementsBySign 
{
    public static void main(String[] args)
    {
        RearrangeElementsBySign1 p=new RearrangeElementsBySign1();
        int[] newarray=p.rearrangeElementsBySign(new int[]{2, 4, 5, -1, -3, -4});
        System.out.println(Arrays.toString(newarray));
    }
}
