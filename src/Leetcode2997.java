class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int current=0;
        for(int i=0;i<nums.length;i++)
        {
            //lets check the XOR of our current elems from nums array
            current=current^nums[i];
        } 

        //now whatever out current is and k 
        //we need to check how many different bits are there 
        //baiscally comparison
        //between current and k value
        int xor=current^k;

        //as xor -> same =0
        //diff-> 1
        //so example:
        // current 100 
        // k 001
        // so if we do xor on it
        //then we will get 101 
        //1 means they is a diff one 
        //and 0 means same one is present so
        //the number of 1s will be the changes we will need

        //lets convert xor to string first then we can get to know about the number of 1's here

        String str=Integer.toBinaryString(xor); //int to string for xor

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
        {
            count++;
        }
        }

        return count;

        }
    
}
public class Leetcode2997 {
    
}
