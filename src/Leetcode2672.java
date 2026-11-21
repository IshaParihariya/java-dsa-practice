class Solution 
{
    public int[] colorTheArray(int n, int[][] arr) 
    {
        //lets try with brute force first 

        int[] colors=new int[n];

        int[] result=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int index=arr[i][0];
            int color=arr[i][1];

            colors[index]=color;

            //when i==0
            //as the color starts from 1 onwards always
            //so at i==0 there is going to be no pairs 
            //so start searching for pairs when i>0

            if(i>0)
            {
                int pairs=0;
                for(int j=0;j<colors.length-1;j++)
                {
                    //search for pairs
                    //we removing 0 as 
                    //color starts from 1 so..
                    //better if done this way
                    if(colors[j]!=0 && colors[j+1]!=0 && colors[j]==colors[j+1])
                    {
                        //then it is a pair
                        //increment in pairs count
                        pairs++;
                    }
                }

                result[i]=pairs;

            }
        }

        return result;
    }
}
public class Leetcode2672 {
    
}
