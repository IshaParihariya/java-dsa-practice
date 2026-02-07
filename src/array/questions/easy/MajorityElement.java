/*
Majority Element-I

Given an integer array nums of size n, return the majority element of the array.

The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

Example 1

Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

Output: 7

Explanation:

The number 7 appears 5 times in the 9 sized array

Example 2

Input: nums = [1, 1, 1, 2, 1, 2]

Output: 1

Explanation:

The number 1 appears 4 times in the 6 sized array
*/
package array.questions.easy;

class MajorityElement_
{
    public void majorityelement(int[] arr)
    {
        int n=arr.length; // n is the length of the array
        int m=n/2; // count > m => majority element 
        int majority=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0; // count of the element
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                majority=arr[i];
            }
        }
        if(max>m)
            System.out.println(majority);
    }
}
public class MajorityElement 
{
    public static void main(String[] args)
    {
         MajorityElement_ m=new  MajorityElement_();
         m.majorityelement(new int[]{1, 1, 1, 2, 1, 2});
    }
}
