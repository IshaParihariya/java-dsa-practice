
package array.questions.medium;

class Solution 
{
    public void sortColors(int[] nums) 
    {
        //with sorting
        //O(N^2)

     /*   for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
            if(nums[i]>nums[j] )
            {
                //swap them 
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                
            }
            }
        }*/

        //with my idea as only three numbers are there 0,1,2

        //O(N) optiimal way
        // The Dutch Flag solution is mainly better because it sorts in one pass, whereas yours uses two passes. But asymptotically, both are O(n).hehehe
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count0++;
            }
            if(nums[i]==1)
            {
                count1++;
            }
            if(nums[i]==2)
            {
                count2++;
            }

        }

        for(int i=0;i<nums.length;i++)
        {
            if(count0!=0)
            {
                nums[i]=0;
                count0--;
            }
            else if(count1!=0)
            {
                nums[i]=1;
                count1--;
            }
            else if(count2!=0)
            {
                nums[i]=2;
                count2--;
            }
        }
    }
}
public class SortColors {
    
}
