/*

//gud imp solve again


## here we will be using set as there are no duplicates in set so we automatically
## get the count of the diff. islands pattern

LOCKED ON LEETCODE

Number of Distinct Islands

You are given an m x n binary matrix grid.

1 represents land
0 represents water
An island is a group of 1s connected 4-directionally — up, down, left, right.
All four edges of the grid are surrounded by water.

Two islands are considered the same if one can be translated (moved up/down/left/right) to exactly match the other.

⚠️ Rotation and reflection do NOT count as the same.

Return the number of distinct islands.

Example 1
Input:
[
  [1,1,0,0,0],
  [1,1,0,0,0],
  [0,0,0,1,1],
  [0,0,0,1,1]
]

Output:
1

Why?

Both islands have the same shape:

1 1        1 1
1 1        1 1

They're just located in different positions, so they count as one distinct island.

Example 2
Input:
[
  [1,1,0,1,1],
  [1,0,0,0,0],
  [0,0,0,0,1],
  [1,1,0,1,1]
]

Output:
3

There are 3 different shapes.

VERY IMPORTANT example

These are different:

1 1        1
1          1

Because one cannot be obtained from the other by translation alone. Rotation/reflection isn't allowed.

Constraints
1 <= m, n <= 50
grid[i][j] is either 0 or 1
*/
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class S1
        {
    int land=1;
    int water=0;
    
    //set 
    Set<List<String>> set=new HashSet<>(); //set as we dont need dupliactes..
    //we need new list for each bfs but only one set
    
    //bfs
    public void bfs(int[][] grid,boolean[][] vis,Integer startRow,Integer startCol)
    {
      Queue<int[]> queue=new LinkedList<>();
      
      
      //note: int[] we didnt use cuz **
      // BUT remember our previous discussion: int[] doesn't compare by contents automatically, so using:
      
      List<String> shape=new ArrayList<>();  // each shape will be stored in the set if distinct
      
      // ambiguity can be there 
      //shape.add(Integer.toString(startRow)+Integer.toString(startCol));
      
      //Yes, startRow and startCol are Integer, 
      //but Java can convert them to String automatically when you concatenate with a String.**
      shape.add("0,0");
      //Because the starting cell is our reference point.
      
      //4 directions
      int[] dr={-1,1,0,0};
      
      int[] dc={0,0,-1,1};
      
      vis[startRow][startCol]=true;
      
      queue.add(new int[]{startRow,startCol});
      
      //whike loop
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
                      int relativeRow=newRow-startRow; // main concept 
                      int relativeCol=newCol-startCol;
                      shape.add(relativeRow +"," + relativeCol);
                      vis[newRow][newCol]=true;
                  }
                  }
              }
          }
      }
      
      //after while loop ended means one pattern is done
      // so now store the shape or list in the set
      set.add(shape);
    }
    
    //need to return the count of distinct islands 
    public int islands(int[][] grid)
    {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==land && !vis[i][j])
                {
                    bfs(grid,vis,i,j);
                }
            }
        }
        
        return set.size(); //returning size of set
        // as set has no duplicates in there..
        
    }
}
public class NumberOfDistinctIslands {
    
}
