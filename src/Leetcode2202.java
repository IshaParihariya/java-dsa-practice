
import java.util.Collections;
import java.util.PriorityQueue;


class Solution 
{
    //please check this problem again
    //it was quite confusing 
    //and till end i coukdnt really understand that well
    public int maximumTop(int[] nums, int k) 
    {


        if(k==0)
        {
            return nums[0];
        
        }

        if(nums.length==1)
        {
            //if nums=> {2}
            // if k=2 (even)
            //means step 1 we can take 2 out 
            //step 2 we can put it back
            //if k==3 (odd)
            //we cannot do that so..
            //this condition
            if(k%2==0)
            {
                return nums[0];
            }
            else
            return -1;
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int len=nums.length;

        int i=0;
        int t=k;
        // int removedMaxElem=-1;

        while(t>1 && i<nums.length)
        {
            //let us keep 1 operation left
            //in case we can use it later uk..

            pq.offer(nums[i]);

            len--;

            t--;

            i++;

        }

        int ans=-1;

        if(!pq.isEmpty())
        {
            ans=pq.peek();
        }

        // If k removals are possible, nums[k] can remain on top

        if(k < nums.length)
        {
            ans = Math.max(ans, nums[k]);
        }


        return ans;

        


        //here k is the number operations we can perform
        //we taking priority queue here because we need greater to smaller numbers here

        //the best here would be finding the greatest number in the nums array
        //and seeing if the number of removal of them is equals to k

        //priority queue
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        // int len=nums.length;

        // int op=0;

        // //lets iterate through nums array
        // int i=0;
        // while(i<nums.length && op<=k)
        // {
        //     if(len>0)
        //     {
        //         if(!pq.isEmpty())
        //         {
        //             if(op==k-1)
        //             {
        //                 if(pq.peek()>=nums[i])
        //                 {
        //                 op++; //now op==k
        //                 //so this should be the right one and we should return peek
        //                 //means adding in the nums array 
        //                 //so 
        //                 len++;
        //                 return pq.poll(); //as it will return the laregst number from the pq
        //                 }
        //                 else
        //                 {
        //                     //elem in nums[i] is > peek
        //                     if(len>1)
        //                     {
        //                         //cuz if len==1 
        //                         //means only 1 length is left means we cannot just that elem 
        //                         //anymore 
        //                         //we need put up that one from pq only
        //                         op++;
        //                         len--;
        //                         return nums[i]; 
        //                     }
        //                     else
        //                     {
        //                         //means len==1
        //                         //so cant remove simply return pq peek
        //                         op++;
        //                         len++;
        //                         return pq.poll();
        //                     }
        //                 }
        //             }
        //            pq.offer(nums[i]);
        //         //as removed so decrement in length 
        //         //as well as operation increment there
        //         op++;
        //         len--; 
        //         }
        //         else
        //         {
        //         //for array non empty condition
        //         //means we can remove topmost elem from the nums array
        //         pq.offer(nums[i]);
        //         //as removed so decrement in length 
        //         //as well as operation increment there
        //         op++;
        //         len--;
        //         }
        //     }

        //     i++;
        // }

        // return -1;

    }
}
public class Leetcode2202 
{
    
}
