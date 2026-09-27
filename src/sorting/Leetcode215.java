/*

Code
Testcase
Testcase
Test Result
215. Kth Largest Element in an Array
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
*/
package sorting;

import java.util.PriorityQueue;

class KthLargestElementInArray 
{
    public int findKthLargest(int[] nums, int k) 
    {
        //SORTING

        //sort in descending order and get the Kth element
        // Arrays.sort(nums);

        // int count=0;

        // for(int i=nums.length-1;i>-1;i--)
        // {
        //     count++;

        //     if(count==k)
        //     {
        //         return nums[i];
        //     }
        // }

        // return -1;


        //WITHOUT SORTING
        //TC : 0(N^3)
        // int largest=nums[0];

        // //HashSet<Integer> set=new HashSet<>();
        // //cant take set cuz even duplicates are counted as distinct so..


        // List<Integer> list = new ArrayList<>();

        // int index=-1;

        // for(int j=0;j<k;j++)
        // {
        // for(int i=0;i<nums.length;i++)
        // {
            
        //     if(nums[i]>=largest && !list.contains(i))
        //    {
        //     largest=nums[i];
        //     index=i;
        //    }
            
        // }
        // //add in the set
        // list.add(index);

        // //if size of set == k then return 
        // if(list.size()==k)
        // {
        //     return largest;
        // }
        // //again set to initial value
        // largest=Integer.MIN_VALUE;
        // }

        // return -1;


        //again trying 
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int res=nums[0];

       for(int i = 0; i < nums.length; i++)
        {
            if(pq.size() < k)
            {
                pq.add(nums[i]);
            }
            else if(nums[i] > pq.peek())
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }

        res=pq.poll();

        return res;

        //this doesnt give priority order so..
        // for(Integer elem:pq)
        // {
        //     if(count<=pq.size()-k+1)
        //     {
        //     ans=pq.poll();
        //     }

        // }
    }
}

public class Leetcode215 {
    
    
}
