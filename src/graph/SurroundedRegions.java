
package graph;
// here we saw we can go to edge or boundaries 'O''s only and we did that only..

import java.util.LinkedList;
import java.util.Queue;

/*
For example, mark safe Os as '#' during BFS, then:

'#' → 'O'
'O'  → 'X'

That removes the vis[][] matrix and gives O(1) extra auxiliary marking space apart from the BFS queue.

But your current solution is already O(mn) time, which is the important part.
*/
class Solution 
{
    ///bfs
    public void bfs(char[][] board,int startRow,int startCol,boolean[][] vis)
    {
        Queue<int[]> queue=new LinkedList<>();      //queue

        vis[startRow][startCol]=true;

        queue.add(new int[]{startRow,startCol});

        //4 directions
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        //while loop
        while(!queue.isEmpty())
        {
            int[] removed=queue.poll();

            int row=removed[0];
            int col=removed[1];

            //for loop 
            for(int i=0;i<4;i++)
            {
                int newRow=row+dr[i];
                int newCol=col+dc[i];

                if(newRow>=0 && newCol>=0 && newRow<board.length && newCol<board[0].length)
                {
                    if(board[newRow][newCol]=='O')
                    {
                        //we aren't changing these 'O''s to 'X''s bcuz these are
                        //connected with the boundaries
                    if(!vis[newRow][newCol])
                    {
                        queue.add(new int[]{newRow,newCol});
                        vis[newRow][newCol]=true;
                    }
                    }
                }
            }
        }
    }

    public void solve(char[][] board) 
    {
        boolean[][] vis=new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
               //only catch the boundary ones and do bfs or dfs on them they will not be changes
               //others will be changes to 'X'
               if(i==0 || i==board.length-1 ||j==0 || j==board[0].length-1)
               {
                //only boundaries 'O' we are getting bro..
                if(board[i][j]=='O' && !vis[i][j])
                {
                    bfs(board,i,j,vis);
                }
               }
            }
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(!vis[i][j] && board[i][j]=='O')
                {
                    board[i][j]='X'; //changed to X 
                }
            }
        }
    }
}
public class SurroundedRegions 
{
    
}
