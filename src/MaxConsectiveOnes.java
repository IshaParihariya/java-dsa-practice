class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {

        int l=0;
        int r=0;

        int maxi=0;
        int zeros=0;

        while(r<nums.length)
        {
            //move l whenever 0's are > k
            //and try to make the zeros count <= k again

            if(nums[r]==0)
            {
                zeros++;
            }

                if(zeros>k)
            {
                
                while(zeros>k)
                {
                    int remove=nums[l];

                    if(remove==0)
                    {
                        zeros--;
                    }

                    l++;
                }
            }
            maxi=Math.max(maxi,r-l+1);
            r++;

           
            }

           

            return maxi;
        }



  }


        //brute force
        // int l=0;
        // int r=0;

        // int maxi=0;

        // int ones=0;
        // int zeros=0;
           

        // while(l<nums.length)
        // {
        //     if(nums[r]==1)
        //     {
        //         ones++;
        //     }
        //     else
        //     {
        //         zeros++;
        //     }
            
        //     int sum=(ones+zeros);

        //     if(zeros>k)
        //         {
        //            maxi=Math.max(maxi,sum-1);//our max value
        //            //sum-1 as we added an extra 0 here ryt so yeah
        //            ones=0;
        //            zeros=0; //start over bro
        //            l++;
        //            r=l;
        //         }


        //         maxi=Math.max(maxi,sum);

        //         r++; //this would happen in each case
        //         if(r==nums.length)
        //         {
        //             l++;
        //             r=l;
        //             ones=0;
        //             zeros=0; //start over bro
        //         }
        // }

        // return maxi;

        

        // int maxi = 0;

        // for (int l = 0; l < nums.length; l++)
        // {
        //     int zeros = 0;

        //     for (int r = l; r < nums.length; r++)
        //     {
        //         if (nums[r] == 0)
        //         {
        //             zeros++;
        //         }

        //         if (zeros > k)
        //         {
        //             break;
        //         }

        //         maxi = Math.max(maxi, r - l + 1);
        //     }
        // }

        // return maxi;

    


public class MaxConsectiveOnes {
    
}
