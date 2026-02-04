/* 
// will look for an another solution 

Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that
each unique element appears only once.



Return the number of unique elements in the array.



If the number of unique elements be k, then,

Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness.
The driver code will assess correctness by printing and checking only the first k elements of the modified array.


An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.


Example 1

Input: nums = [0, 0, 3, 3, 5, 6]

Output: 4

Explanation:

Resulting array = [0, 3, 5, 6, _, _]

There are 4 distinct elements in nums and the elements marked as _ can have any value.

Example 2

Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]

Output: 4

Explanation:

Resulting array = [-2, 2, 4, 5, _, _, _, _]

There are 4 distinct elements in nums and the elements marked as _ can have any value.
*/
package array.questions.easy;

class RemoveDuplicates_
{
    public void  removeDuplicates_(int[] arr)
    {
        // increasing order sorted array
        // in place modification
        
        int n=arr.length;//length of the arr
        if(n == 0)
    {
        System.out.println("Number of unique elements : 0");
    }
        
        int count=1;
        System.out.print(arr[0]+" ");
        for(int i=0;i<=n-2;i++) // k , for getting the count of unique elements
        {
            if(arr[i]<arr[i+1])
            {
                System.out.print(arr[i+1]+"  ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of unique elements : "+count);    
    }
}
public class RemoveDuplicates 
{
    public static void main(String[] args)
    {
        RemoveDuplicates_ rd=new RemoveDuplicates_();
        rd.removeDuplicates_(new int[]{-5,-1,0,1,2,3,4,5,5,6,6,6,7});
    }
}
