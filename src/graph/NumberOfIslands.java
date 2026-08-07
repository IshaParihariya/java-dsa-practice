/*
200. Number of Islands
Solved
Medium
Topics
premium lock icon
Companies
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
*/
package graph;

import java.util.LinkedList;
import java.util.Queue;

class Solution 
{
    public void bfs(char[][] grid, int startRow,int startCol  ,boolean[][] vis)
    {
        //here we will see all neighbours and will note them as visited
        // it should include neighbours and their neighbours as well..
        
        Queue<int[]> queue=new LinkedList<>(); // fifo queue
       queue.add(new int[]{startRow, startCol}); // adding in the queue ds
        vis[startRow][startCol]=true;  // the added ones are visited now.. 

        // directions or cols and rows..
        // for left ryt
        // or change in rows
        int[] dr={-1,1,0,0};
        // for up down
        // or change in columns
        int[] dc={0,0,-1,1};
        //while loop as we need to go to all neighbours 
        while(!queue.isEmpty())
        {
            //push neighbours if not visited and one else not
           int[] removed= queue.poll(); // pop -> get the neighbours -> push if not visited..

           int row=removed[0];
           int col=removed[1];

           // need to check in 4 directions for neighbours ryt..
           // for directions 
           // example : this is the first row and column=> (0,0)
           // lets say we going in up direction => (0,0) -> (-1,0)
           // for down (0,0) -> (1,0)
           // for left (0,0) -> (0,-1)
           // for ryt (0.0) -> (0,1)
           // so from here we can see for up down only ROW CHANGES
           // and for ryt left only COLUMNS CHANGES
           // so as per that we are taking dr and dc for rows and cols directions..
           for(int k=0;k<4;k++)
           {
            /*
            the loop checks:

k = 0 → Up
k = 1 → Down
k = 2 → Left
k = 3 → Right
*/
            int newRow= row+ dr[k];
            int newCol= col+ dc[k];
            if(newRow>=0 && newCol>=0 && newRow<grid.length && newCol<grid[0].length) // exception 
            {
            //now check if visited or not
            if(grid[newRow][newCol]=='1' && !vis[newRow][newCol])
            {
                vis[newRow][newCol]=true; //marked as visited 
               //new array
                queue.add(new int[]{newRow,newCol});
            }
            }
           }

        }

    }
    public int numIslands(char[][] grid) 
    {
        //lets try with bfs
        int startRow=0;
        int startCol=0;
        boolean[][] vis=new boolean[grid.length][grid[0].length]; // to mark visited nodes..
        int islands=0;

        for(int i=0;i<grid.length;i++) //rows
        {
            for(int j=0;j<grid[i].length;j++)//columns
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    islands++;
                    startRow=i;
                    startCol=j;
                    // do dfs or bfs for it
                    bfs(grid , startRow, startCol, vis);
                }
            }
        }
        return islands;
    }
}
/*
Yes. Since modifying the input is allowed, I can eliminate the visited array by marking visited land cells as '0' (or another marker) directly in the grid.
*/
public class NumberOfIslands {
    
}
