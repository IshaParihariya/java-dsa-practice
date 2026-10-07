
package graph;

class SolutionWordL 
{
    public boolean dfs(char[][] board, String word,boolean[][] vis,int i,int j,int idx)
    {
    

        if(i < 0 || i >= board.length ||
   j < 0 || j >= board[0].length)
{
    return false;
}

if(vis[i][j])
{
    return false;
}

        //character doesn't match bro
        if(word.charAt(idx)!=board[i][j])
        {
            return false;
        }

         if(idx==word.length()-1)
        {
            return true;
        }

        //character matches

        // so mark it visited first
        vis[i][j]=true;

        //now lets check for padosis here

        // up down left right
        int[] dr={-1,1,0,0};//up down left ryt or row

        int[] dc={0,0,-1,1}; //up down left ryt for col

        for(int k=0;k<4;k++)
        {
            //for row change 
            int row=i+dr[k];

            //for col change
            int col=j+dc[k];

            //now check if the next charcter matches with the neighbours
            if(row>=0 && row<board.length && col>=0 && col<board[0].length)
            {
                //backtracking

               if(dfs(board,word,vis,row,col,idx+1))   
               {
                return true;
               }
                
            }

        }


        vis[i][j]=false;

        return false;
    }

    public boolean exist(char[][] board, String word) 
    {
        boolean[][] vis=new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++)
        {
            //i th row
            for(int j=0;j<board[0].length;j++)
            {
               //jth column 

               //dfs backtracking
               if(dfs(board,word,vis,i,j,0)) 
               {
                return true;
               } 
               //here idx == 0 as we starting from word start
               //we will keep increasing this
            }
        }

        return false;
        
    }
}
public class WordLength {
    
}
