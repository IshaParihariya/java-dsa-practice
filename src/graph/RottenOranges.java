/*
994. Rotting Oranges
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

Example 1:


Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
Example 2:

Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 10
grid[i][j] is 0, 1, or 2.
*/
package graph;

import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    int rotten=2;
    int fresh=1;
    int empty=0;
    
    // max time
    int maxTime=0;

       // count of fresh oranges
        int freshCount=0;




//bfs
   public void bfs(int[][] grid , Queue<int[]> queue)
   {

    // Queue<int[]> queue=new LinkedList<>(); //queue -> removed from here bcuz 
    // first one two needed to be completed then new one starts but
    // we need to complete 2's simultaneously..

    //vis[startRow][startCol]=true; // mark this one as visited..

    // we will consider time as well here

    // 4 directions
    int[] dr={-1,1,0,0};
    int[] dc={0,0,-1,1};

    //queue.add(new int[]{startRow,startCol, 0}); //added in the queue

    while(!queue.isEmpty()) // till the queue is empty
    {
        //remove from the queue
        int[] removed=queue.poll();

        //in all 4 directions
        int row=removed[0];
        int col=removed[1];
        int time=removed[2]; // TIME**

        // max time in order to return..
        maxTime=Math.max(maxTime,time);
        

        //for loop to go in all 4 directions
        for(int i=0;i<4;i++)
        {
            // new rows and columns
            int newRow=row+dr[i];
            int newCol=col+dc[i];

            // now no exception
            if(newRow>=0 && newCol>=0 && newRow<grid.length && newCol<grid[0].length)
            {
                if(grid[newRow][newCol]==fresh)
                {
                    grid[newRow][newCol]=rotten;
                    queue.add(new int[]{newRow,newCol,time+1});
                    freshCount--;
                }
            }
        }
    }
   }

    public int orangesRotting(int[][] grid) 
    {
        if(grid == null || grid.length == 0) return -1;
        
        // visited ones to be marked..
        boolean[][] vis=new boolean[grid.length][grid[0].length];

        // this is the game**
        Queue<int[]> queue=new LinkedList<>(); //queue

        for(int i=0;i<grid.length;i++) //row 
        {
            for(int j=0;j<grid[0].length;j++) // column
            {

                // 2 is rotten orange 
                // 1 is fresh orange
                // 0 is no orange present
                if(grid[i][j]==rotten)
                {
                    queue.add(new int[]{i,j, 0}); //added in the queue first so 
                    // multiple 2s can be uk done simultaneously..
                }
                if(grid[i][j]==fresh)
                {
                    freshCount++;
                }
            }
        }

        // so first getting all 2's initially then all could be used simulatenously
                    //level by level
                    bfs(grid,queue);

    if(freshCount==0)
    {
        return maxTime;
    }
    else
     return -1;

    }
}

public class RottenOranges {
    
}
