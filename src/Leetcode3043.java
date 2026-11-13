
import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public int longestCommonPrefix(int[] arr1, int[] arr2) 
    {
        //lets check one by one first
        int flag=0; //if arr1<arr2
        int len=arr1.length; //storing smaller one

        if(arr1.length>=arr2.length)
        {
            //if arr1.len>=arr2.len 
            flag=1;
            //else it will stay 0
            len=arr2.length; //as we storing smaller one
        }

        //whoever's length is shorter first store it
        //will only store elems from smaller array
        //so lesser space will be used uk

        //we surely do not need duplicates
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<len;i++)
        {
            if(flag==1)
            {
                //arr2 we need to store
                //lets store ALL PREFIXES
                int divisor=1;

                while(divisor<=arr2[i])
                {
                    int prefix=arr2[i]/divisor;

                    set.add(prefix);

                    divisor=divisor*10;
                }
            }
            else
            {
                //store arr1
                int divisor=1;

                while(divisor<=arr1[i])
                {
                    int prefix=arr1[i]/divisor;

                    set.add(prefix);

                    divisor=divisor*10;
                }
            }
        }

        //now lets check each Integer's first digit from Set and the larger array
        // if(flag==0)
        // {
        //     //arr2
        // }
        // if(flag==1)
        // {
        //     //arr1
        // }

        int maxLength=0; //this is the length we need to return


        if(flag==0)
        {
            //arr1 is stored 
            //arr2 needs to be iterated one by one
            len=arr2.length;
        for(int i=0;i<len;i++)
        {
            int divisor=1;

            while(divisor<=arr2[i])
            {
                int prefix=arr2[i]/divisor;

                if(set.contains(prefix))
            {
                maxLength=Math.max(maxLength, Integer.toString(prefix).length());
            }

                divisor=divisor*10;
            }
        }
        }
        else
        {
            //need to iterate through arr1
            len=arr1.length;
        for(int i=0;i<len;i++)
        {
            //as each prefix is stored in the hashset
            //now we need to know if same exists

            //CHECKING EACH PREFIX

            int divisor=1;

            while(divisor<=arr1[i])
            {
                int prefix=arr1[i]/divisor;

                if(set.contains(prefix))
            {
                maxLength=Math.max(maxLength, Integer.toString(prefix).length());
            }

                divisor=divisor*10;
            }
        }
        }

        return maxLength;

    }
}
public class Leetcode3043 {
    
}
