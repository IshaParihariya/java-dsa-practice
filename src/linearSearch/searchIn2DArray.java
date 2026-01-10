
package linearSearch;
import java.util.*;

public class searchIn2DArray 
{
    static int[][] arr=new int[][]{ //**
            {1,2,3,4},
                {5,7,8,9},
                {23,8,0,2}
                    };    // initialising and declaring a 2D Array
    static int target;
    
    
    public static void main(String[] args)
    
    {
        System.out.println("Array : " + Arrays.deepToString(arr));
        System.out.println("---------------------");
        target=0;
        search(arr);
        
    }
    
    static int search(int[][] arr)
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
              if(arr[i][j]==target)
              {
                 System.out.println("target found at indeces : "+i +" and " + j);
              }
            }
           
        }
         return -1;
    }

}
