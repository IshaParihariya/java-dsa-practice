
import java.util.PriorityQueue;

class Solution 
{

    public long findScore(int[] nums) 
    {
        //in this pq we are storing
        //like int[] => [2,0] 
        //[1,1] 
        //[3,2]
        //[4,3]
        //[5,4]
        //[2,5]
        //here look at example 1 from the given examples in the left
        //here we are having pairs 
        //at index 0 we are hving elem and at index 1 we having its index
        //we are comparing 
        //first elems if elems are not same then choose the smallerelm
        //if same elems exists 
        //then compare on basis of index

            PriorityQueue<int[]> pq=new PriorityQueue<>(
                (a,b)->
                {
                    if(a[0]!=b[0])
                    {
                        //first comparing elems
                        //if elems unequal
                        //then choose smaller ones
                        return Integer.compare(a[0],b[0]); 
                    }
                    //if elems are same
                    //then compare on basis of index
                    //smaller indeces ones
                    //comes first
                    return Integer.compare(a[1],b[1]);
                }
            );

            //lets add elems in the pq from the array

            for(int i=0;i<nums.length;i++)
            {
                pq.offer(new int[]{nums[i],i});
            }

            //so we are getting smaller elems 
            //and if same elems exists
            //then saller index ones comes first
            Long score=0L;

            boolean[] vis=new boolean[nums.length];
            while(!pq.isEmpty())
            {
                //continue till all are visited
                int[] arr=pq.poll();

                int elem=arr[0];

                int index=arr[1];

                if(!vis[index])
                {
                    //if unvisited then we will 
                    //mark it as visited
                    //and adjacent ones as well

                    //add into score as well
                    score=score+elem;

                    vis[index]=true;//mark as visited

                    //mark left one as visited if exists
                    if(index-1>-1 && !vis[index-1])
                    {
                        vis[index-1]=true;
                    }

                    //right ones now
                    if(index+1<nums.length && !vis[index+1])
                    {
                        vis[index+1]=true;
                    }
                }
            }

            return score;
            
    }
}
        // //if length is just 1 
        // //score will be that elem itself
        // if(nums.length==1)
        // {
        //     return nums[0];
        // }

        // //lets try brute force first 
        // boolean[] vis=new boolean[nums.length];

        // Long score=0L;

        // boolean allDone=false;

        // while(!allDone)
        // {
        //     //continue till all elems in the array are marked
        //     int smallest=Integer.MAX_VALUE; //as array nums is giving int only so
        //     //summation score can be long not this ryt
        //     int index=-1;


        //     for(int i=0;i<nums.length;i++)
        //     {
        //         if(!vis[i])
        //         {
        //             if(smallest>nums[i])
        //             {
        //                 //this will automatically choose the one with smallest index
        //                 //or basically the first one 
        //                 smallest=nums[i];
        //                 index=i;
        //             }
        //         }
        //     }
        //     vis[index]=true; //mark as visited the smallest one

        //     //add in the score
        //     score=score+smallest;

        //     //now mark the two adjcent ones if exists
        //     //left one first
        //     if(index-1>-1 && !vis[index-1])
        //     {
        //         //mark it visited
        //         vis[index-1]=true;
        //     }

        //     //for right one
        //     if(index+1<nums.length && !vis[index+1])
        //     {
        //         //mark as visited then
        //         vis[index+1]=true;
        //     }

        //     //at last check this out
        //     boolean flag=false;
        //     for(int i=0;i<nums.length;i++)
        //     {
        //         if(!vis[i])
        //         {
        //             //means yes there are unvisited ones
        //             flag=true;
        //         }
        //     }

        //     if(!flag)
        //     {
        //         //means no unviisted ones left there
        //         allDone=true;
        //         //hence stop the while loop now
        //     }

        // }

        // return score;
//     }
// }
public class Leetcode2593 {
    
}
