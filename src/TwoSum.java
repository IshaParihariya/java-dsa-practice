
//easy one!
class SolutionTwoSum1
{
    public int[] twoSum(int[] nums, int target)
    {
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // If we found the pair that adds up to target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {-1, -1}; // should never happen because problem guarantees one solution */

        int l=0;
        int r=1;
        while(l<nums.length)
        {
            if(nums[l]+nums[r]==target)
            {
                return new int[] { l , r };
            }
            else
            {
                //dont store...
            }
            //keep increasing
            r++;
            if(r==nums.length)
            {
                l++;
                if(l!=nums.length-1)
                {
                    r=l+1;
                }
            }
        }
        //end of while loop
        return new int[] {-1, -1};
    }
}

public class TwoSum 
{
    public static void main(String[] args)
    {
        
    }
}
