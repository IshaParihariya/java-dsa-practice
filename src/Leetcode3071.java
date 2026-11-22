
import java.util.HashMap;
import java.util.Map;

class Solution 
{
    //try this out again
    public int minimumOperationsToWriteY(int[][] grid) 
    {
        int n=grid.length;

        Map<Integer,Integer> map=new HashMap<>(); //outside Y

        //inside Y counts of 0,1,2
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                //diagoal from left to mid
                if(i==j && i<=(n-1)/2 && j<=(n-1)/2) 
                {
                    if(grid[i][j]==0)
                    c0++;
                    else if(grid[i][j]==1)
                    c1++;
                    else
                    c2++;
                } //diagonal from ryt to centre
                else if(i+j==(n-1) && i<=(n-1)/2 && j>=(n-1)/2)
                {
                    if(grid[i][j]==0)
                    c0++;
                    else if(grid[i][j]==1)
                    c1++;
                    else
                    c2++;
                }//for verticle line from centre to bottom 
                else if(i>=(n-1)/2 && j==(n-1)/2)
                {
                    if(grid[i][j]==0)
                    c0++;
                    else if(grid[i][j]==1)
                    c1++;
                    else
                    c2++;
                }//rest ones does not come in the Y 
                else
                {
                    map.put(grid[i][j] , map.getOrDefault(grid[i][j],0)+1);
                }
            }
        }

        //like this we will get the counts of all
        //now try to find the maximum one from the map
        //as outside ones have more numbers
        //so on it mainly it will depend what to where to change
        //so we will change as per the outside elements
        Integer maxFreq=Integer.MIN_VALUE;

        Integer maxi=0; //lets say 0 

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            Integer elem=entry.getKey();

            Integer freq=entry.getValue();

            if(freq>maxFreq)
            {
                maxFreq=freq;

                maxi=elem;
                //like this we will get the maximum frequency elem outside the Y
            }
        }

        //Integer maxFreqOutside=Math.max(c0,Math.max(c1,c2)); //max among ll 3 counts inside Y


        //later on if not same this will proeprly work
        //means will hafta change rest ones to the max one
        // int changes=0;

        int insideTotal = c0 + c1 + c2;

        int outsideTotal = (n*n)-insideTotal;

        int[] inside={c0,c1,c2}; //accessing frequencies directly using indeces

        int ans=Integer.MAX_VALUE;

        for(int y=0;y<3;y++)
        {
            //inside y from 0,1,2

            for(int out=0;out<3;out++)
            {
                //this is outside ones

                if(y==out)
                continue; //as both outside and inside elems cannot be same

                int outsideFreq=map.getOrDefault(out,0);

                //THIS IS MAIN LOGIC BEHIND THIS PROBLEM'S SOLUTION

                ans=Math.min(ans,(insideTotal-inside[y])+(outsideTotal-outsideFreq));
            }
        }


return ans;
    }
}
public class Leetcode3071 {
    
}
