class Solution 
{
    public int minOperations(int[] nums1, int[] nums2) 
    {

        //sum of all digits in nums1
        int sum1=0;
        //PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
           for(int i=0;i<nums1.length;i++)
           {
            //pq1.offer(nums1[i]);
            sum1=sum1+nums1[i];
           }

        //sum of all digits in nums2
        int sum2=0;
        //PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
           for(int i=0;i<nums2.length;i++)
           {
            //pq2.offer(nums2[i]);
            sum2=sum2+nums2[i];
           }

           // Check if equal sums are possible
        if (nums1.length * 6 < nums2.length ||
            nums2.length * 6 < nums1.length) {
            return -1;
        }

        // Make nums1 the array with the larger sum
        if (sum1 < sum2) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int tempSum = sum1;
            sum1 = sum2;
            sum2 = tempSum;
        }


        //difference between nums1 and nums2
        int diff=Math.abs(sum1-sum2);

        //now make 'em both equal i.e., nums1==nums2
        //decrease the larger one 
        //and increase the smaller one
        //if sum1>sum2 => sum1-- and sum2++
        //if sum1<sum2 => sum1++ and sum2--
        int[] freq = new int[6];

for (int x : nums1) {
    freq[x - 1]++;
}

for (int x : nums2) {
    freq[6 - x]++;
}
int operations=0;
for (int gain = 5; gain >= 1 && diff > 0; gain--) {
    while (freq[gain] > 0 && diff > 0) {
        diff -= gain;
        operations++;
        freq[gain]--;
    }
}

return operations;
    }
}


public class Leetcode1775 {
    
}
