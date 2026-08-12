package graph;
//couldnt understand at once
//go through it again

import java.util.LinkedList;
import java.util.Queue;

/*
class Solution 
{
    boolean cycle=false;

    //lets try with bfs
    public void bfs(char[][] grid,boolean[][] vis,int startRow,int startCol)
    {
        vis[startRow][startCol]=true; 

        // all 4 directions
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        Queue<int[]> queue=new LinkedList<>(); //queue

        queue.add(new int[]{startRow,startCol,-1,-1});

        //while loop
        while(!queue.isEmpty())
        {
            int[] removed=queue.poll(); // poll

            int row=removed[0];
            int col=removed[1];

            int parentRow=removed[2];
            int parentCol=removed[3];

            char c=grid[row][col];


            for(int i=0;i<4;i++)
            {
                int newRow=row+dr[i];
                int newCol=col+dc[i];

                if(newRow>=0 && newCol>=0 && newRow<grid.length && newCol<grid[0].length)
                {
                    if(grid[newRow][newCol]==c)
                    {
                        if(!vis[newRow][newCol]) 
                        {
                            // if not visited no problem continue..
                        queue.add(new int[]{newRow,newCol,row,col});
                        vis[newRow][newCol]=true;
                        }
                        //if already visited
                        else
                        {
                            //then check if its the parent one or not
                            //if not parent then its a cycle
                            if(newRow!=parentRow || newCol!=parentCol)
                            {
                                //This cell is already visited. If this already-visited cell is NOT the cell I came from, then I found a cycle.
                                cycle=true; //its a cycle
                            }
                        }
                    }
                }
            }
        }

    }
    public boolean containsCycle(char[][] grid) 
    {
        boolean[][] vis=new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {

        if(!vis[i][j])
        {
            bfs(grid,vis,i,j);
        }
            }
        }

    return cycle;

}
}*/
class Solution
{
    boolean cycle=false;
    //dfs 
     public void dfs(char[][] grid, boolean[][] vis,
                    int row, int col,
                    int parentRow, int parentCol)
    {
        // mark current cell visited
        vis[row][col] = true;

        // directions
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // check all 4 directions
        for(int i = 0; i < 4; i++)
        {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            // valid cell + same character
            if(newRow >= 0 && newCol >= 0 &&
               newRow < grid.length &&
               newCol < grid[0].length &&
               grid[newRow][newCol] == grid[row][col])
            {
                // not visited -> DFS
                if(!vis[newRow][newCol])
                {
                    dfs(grid, vis,
                        newRow, newCol,
                        row, col);
                }
                // visited + not parent -> cycle
                else
                {
                    if(newRow != parentRow ||
                       newCol != parentCol)
                    {
                        cycle = true;
                        return;
                    }
                }
            }
        }
    }
    //bfs 
    public void bfs(char[][] grid,boolean[][] vis,int startRow,int startCol)
    {
        Queue<int[]> queue=new LinkedList<>();

        queue.add(new int[]{startRow,startCol,-1,-1}); 
        //parentRow and Column as well

        vis[startRow][startCol]=true;

        //directions
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};


        //while loop
        while(!queue.isEmpty())
        {
            int[] removed=queue.poll();

            int row=removed[0];
            int col=removed[1];
            int parentRow=removed[2];
            int parentCol=removed[3];

            char c=grid[row][col];

            for(int i=0;i<4;i++)
            {
                int newRow=row+dr[i];
                int newCol=col+dc[i];

                if(newRow>=0 && newCol>=0 && newRow<grid.length && newCol<grid[0].length)
                {
                    if(grid[newRow][newCol]==c)
                    {
                    if(!vis[newRow][newCol])
                    {
                        //bfs
                        queue.add(new int[]{newRow,newCol,row,col});
                        vis[newRow][newCol]=true;
                    }
                    else
                    {
                        if(newRow!=parentRow || newCol!=parentCol)
                        {
                            cycle=true;
                            return;
                        }
                    }
                    }
                }
            }
        }
    }
    public boolean containsCycle(char[][] grid) 
    {
        boolean[][] vis=new boolean[grid.length][grid[0].length];


        for(int i=0;i<grid.length;i++) //rows
        {
            for(int j=0;j<grid[0].length;j++) //columns
            {
                if(!vis[i][j]) //if not visited 
                {
                //bfs(grid,vis,i,j); ///bfs
                //dfs 
                //everything is same in dfs recursion is happening..
                dfs(grid,vis,i,j,-1,-1);
                }
            }
        }

        return cycle;
    }
}
public class CycleDetectBFS
{
    
}