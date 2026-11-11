class Solution {

    public long findScore(int[] nums) 
    {

        //if length is just 1 
        //score will be that elem itself
        if(nums.length==1)
        {
            return nums[0];
        }

        //lets try brute force first 
        boolean[] vis=new boolean[nums.length];

        Long score=0L;

        boolean allDone=false;

        while(!allDone)
        {
            //continue till all elems in the array are marked
            int smallest=Integer.MAX_VALUE; //as array nums is giving int only so
            //summation score can be long not this ryt
            int index=-1;


            for(int i=0;i<nums.length;i++)
            {
                if(!vis[i])
                {
                    if(smallest>nums[i])
                    {
                        //this will automatically choose the one with smallest index
                        //or basically the first one 
                        smallest=nums[i];
                        index=i;
                    }
                }
            }
            vis[index]=true; //mark as visited the smallest one

            //add in the score
            score=score+smallest;

            //now mark the two adjcent ones if exists
            //left one first
            if(index-1>-1 && !vis[index-1])
            {
                //mark it visited
                vis[index-1]=true;
            }

            //for right one
            if(index+1<nums.length && !vis[index+1])
            {
                //mark as visited then
                vis[index+1]=true;
            }

            //at last check this out
            boolean flag=false;
            for(int i=0;i<nums.length;i++)
            {
                if(!vis[i])
                {
                    //means yes there are unvisited ones
                    flag=true;
                }
            }

            if(!flag)
            {
                //means no unviisted ones left there
                allDone=true;
                //hence stop the while loop now
            }

        }

        return score;
    }
}
public class Leetcode2593 {
    
}
