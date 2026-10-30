
import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public long countSubarrays(int[] nums, int minK, int maxK) 
    {



        //BRUTE FORCE SOLUTION
        //CORRECT BUT MEMORY LIMIT EXCEEDED

        //get all possible sybarrays
        //then take the ones which are having both minK and maxK in it
        int l=0;

        List<List<Integer>> li=new ArrayList<>();

        while(l<nums.length)
        {
            List<Integer> list=new ArrayList<>();
            //add first one 
            list.add(nums[l]);
            li.add(new ArrayList<>(list));

            if(l<nums.length-1)
            {
            int r=l+1;
            while(r<nums.length)
            {
                list.add(nums[r]);
                li.add(new ArrayList<>(list));
                r++;
            }
            }

            l++;
        }   


        //get through every list 
        //lets see if the subaarays have minK maxK 
        //then we gonn' count 'em else not
        int result=0;
        for(List<Integer> ls:li)
        {
            if(ls.contains(minK) && ls.contains(maxK))
            {
                int max=Integer.MIN_VALUE; //taking these as defaults
                int min=Integer.MAX_VALUE;
                //also minK should be the max and minK should be the maximum one the the list
                //another loop here
                for(Integer current:ls)
                {
                    max=Math.max(max,current);
                    min=Math.min(min,current);
                }

                //if max and min equals minK and maxK
                //then we need to do increment
                if(max==maxK && min==minK)
                { 
                result++;
                }
            }
        }   

        //return the number of subarrays containing minK and maxK
        return result;  
    }
}
public class Leetcode2444 {
    
}
