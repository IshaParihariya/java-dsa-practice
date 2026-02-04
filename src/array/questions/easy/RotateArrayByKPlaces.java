/*
// check the optimal solution 

Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.


Example 1

Input: nums = [1, 2, 3, 4, 5, 6], k = 2

Output: nums = [3, 4, 5, 6, 1, 2]

Explanation:

rotate 1 step to the left: [2, 3, 4, 5, 6, 1]

rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

Example 2

Input: nums = [3, 4, 1, 5, 3, -5], k = 8

Output: nums = [1, 5, 3, -5, 3, 4]

Explanation:

rotate 1 step to the left: [4, 1, 5, 3, -5, 3]

rotate 2 steps to the left: [1, 5, 3, -5, 3, 4]

rotate 3 steps to the left: [5, 3, -5, 3, 4, 1]

rotate 4 steps to the left: [3, -5, 3, 4, 1, 5]

rotate 5 steps to the left: [-5, 3, 4, 1, 5, 3]

rotate 6 steps to the left: [3, 4, 1, 5, 3, -5]

rotate 7 steps to the left: [4, 1, 5, 3, -5, 3]

rotate 8 steps to the left: [1, 5, 3, -5, 3, 4]
*/
package array.questions.easy;
import java.util.Arrays;

class RotateByKPlaces_ // class
{
    public void rotateByKPlaces(int[] arr,int k)
    {
        System.out.println("The array initially : "+Arrays.toString(arr));
        int n=arr.length;// length of the array
        for(int i=0;i<k;i++) // rotate for k times
        {
            
            int temp=arr[0];
            for(int j=0;j<=n-2;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
            
        }
        //printing the rotated array 
        System.out.println("The rotated array for "+ k +" times : "+Arrays.toString(arr));
    }
}
public class RotateArrayByKPlaces
{
    public static void main(String[] args)
    {
        RotateByKPlaces_ rp=new RotateByKPlaces_();
        rp.rotateByKPlaces(new int[]{1, 2, 3, 4, 5, 6}, 2);
    }
}
