
package array.questions.medium;

import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        boolean[][] vis=new boolean[matrix.length][matrix[0].length];

        int startRow=0;
        int startCol=0; //starting from first col and first row

        vis[0][0]=true;

        List<Integer> list=new ArrayList<>();
        list.add(matrix[0][0]);

        int[] c = {1, 0, -1, 0};  // column movement
        int[] r = {0, 1, 0, -1};  // row movement

        int n=matrix.length*matrix[0].length;

        int row=0;
        int col=0;

        int d=0;
        int count=1; //matrix[0][0] already visited so

        while(count < n)
        {
            int newRow = row + r[d];
            int newCol = col + c[d];
        
            if(newRow<matrix.length && newCol<matrix[0].length && newRow>=0 && newCol>=0 && !vis[newRow][newCol])
            {
                row=row+r[d];
                col=col+c[d];

                //yes row and col are with in the correct boundary 
                list.add(matrix[row][col]);
                count++;

                vis[row][col]=true; //marked as visited now
            }
            else
            {
                d=(d+1)%4 ;//We want to move to the next direction whenever we hit a boundary or a visited cell
                //even if the cell is visited we will be doing this retry
                
            }

        }


        return list;

    }
}

public class Leetcode56 {
    
}
