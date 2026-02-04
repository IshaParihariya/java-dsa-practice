/*
Given an integer array nums, move all the 0's to the end of the array.
The relative order of the other elements must remain the same.



This must be done in place, without making a copy of the array.


Example 1

Input: nums = [0, 1, 4, 0, 5, 2]

Output: [1, 4, 5, 2, 0, 0]

Explanation:

Both the zeroes are moved to the end and the order of the other elements stay the same

Example 2

Input: nums = [0, 0, 0, 1, 3, -2]

Output: [1, 3, -2, 0, 0, 0]

Explanation:

All 3 zeroes are moved to the end and the order of the other elements stay the same
*/
package array.questions.easy;
import java.util.Arrays;

class MoveZeroesToEnd_//class
{
    public void moveZeroesToEnd(int[] arr)//method
    {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==0)
            {
                count++; // count of zeroes
                int j;
                // shitfting of elements
                for(j=i;j<n-1;j++)
                {
                arr[j]=arr[j+1]; 
                }
                // after shifting if the arr[i]==0 then it means more than one 0's together so recheck on that index again
            i--; //IMPORTANT
            
            }
           
        }
        // for assigning zeroes in the end
        for(int i=n-1;i>n-1-count;i--)
        {
            arr[i]=0;
        }
        
       System.out.println("count of zeroes in the arr : "+count);
       System.out.println("Array after moving zeroes to the end : "+Arrays.toString(arr));
    }
}
public class MoveZereosToEnd 
{
    public static void main(String[] args)
    {
        MoveZeroesToEnd_ m=new MoveZeroesToEnd_();
        m.moveZeroesToEnd(new int[]{1,1,2,3,0,3,0,0,5,6});
    }
}
