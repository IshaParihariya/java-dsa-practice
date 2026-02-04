/*

Given an integer array nums, rotate the array to the left by one.



Note: There is no need to return anything, just modify the given array.


Example 1

Input: nums = [1, 2, 3, 4, 5]

Output: [2, 3, 4, 5, 1]

Explanation:

Initially, nums = [1, 2, 3, 4, 5]

Rotating once to left -> nums = [2, 3, 4, 5, 1]

*/
package array.questions.easy;
import java.util.Arrays;
class RotateArray_//class
{
    public void rotateArray(int[] arr)//method 
    {
        System.out.println("The array initially : "+Arrays.toString(arr));
        
        // note : array is not sorted 
        int n=arr.length;//length of the array arr
         int temp= arr[0];
        for(int i=0;i<=n-2;i++)
        {
          arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        
        //printing the rotated array 
        System.out.println("The rotated array : "+Arrays.toString(arr));
    }
}
public class RotateArrayByOnePlace 
{
    public static void main(String[] args)
    {
        RotateArray_ rs=new RotateArray_();
        rs.rotateArray(new int[]{1,2,3,4,5});
    }
}
