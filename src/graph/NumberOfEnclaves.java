
package graph;

import java.util.LinkedList;
import java.util.Queue;

class Solution 
{
    int land=1;
    int sea=0;

    // bfs
    public void bfs(int[][] grid,boolean[][] vis,int startRow,int startCol)
    {
        Queue<int[]> queue=new LinkedList<>();

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        queue.add(new int[]{startRow,startCol});

        vis[startRow][startCol]=true;

        //while loop
        while(!queue.isEmpty())
        {
            int[] removed=queue.poll();

            int row=removed[0];
            int col=removed[1];

            for(int i=0;i<4;i++)
        {
            int newRow=row+dr[i];
            int newCol=col+dc[i];

            if(newRow>=0 && newCol>=0 && newRow<grid.length && newCol<grid[0].length)
            {
                if(grid[newRow][newCol]==land)
                {
                    if(!vis[newRow][newCol])
                    {
                        queue.add(new int[]{newRow,newCol});
                        vis[newRow][newCol]=true;
                        //from here we found those which cant be includes in the count
                    }
                }
            }
        }
        }
    }

    public int numEnclaves(int[][] grid) 
    {
        int count=0; //count

        boolean[][] vis=new boolean[grid.length][grid[0].length];

        //lets get the boundaries 1's first
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0 || i==grid.length-1 || j==0 || j==grid[0].length-1)
                {
                    if(grid[i][j]==land) //1 is land
                    {
                        bfs(grid,vis,i,j); //bfs
                    }
                }
            }
        }

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!vis[i][j] && grid[i][j]==land)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
public class NumberOfEnclaves 
{
    
}
