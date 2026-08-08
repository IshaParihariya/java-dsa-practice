/*

You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill:

Begin with the starting pixel and change its color to color.
Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.
Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.
The process stops when there are no more adjacent pixels of the original color to update.
Return the modified image after performing the flood fill.

 

Example 1:

Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2

Output: [[2,2,2],[2,2,0],[2,0,1]]

Explanation:



From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.

Note the bottom corner is not colored 2, because it is not horizontally or vertically connected to the starting pixel.

Example 2:

Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0

Output: [[0,0,0],[0,0,0]]

Explanation:

The starting pixel is already colored with 0, which is the same as the target color. Therefore, no changes are made to the image.

 

Constraints:

m == image.length
n == image[i].length
1 <= m, n <= 50
0 <= image[i][j], color < 216
0 <= sr < m
0 <= sc < n
*/
package graph;

import java.util.LinkedList;
import java.util.Queue;

class Solution 
{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int original=image[sr][sc]; //original pixel
        
        // most optimal solution..
        if(original == color)
            return image;


        //lets try with bfs
        Queue<int[]> queue=new LinkedList<>(); // queue to store
        boolean[][] vis=new boolean[image.length][image[0].length]; //to mark visited nodes as visited

        //mark this one as visited
        vis[sr][sc]=true;
        //change this one to our given color
        image[sr][sc]=color;

        //directions
        int[] dr={-1,1,0,0}; // up down direction changes in row
        int[] dc={0,0,-1,1}; // left right direction chnages in the column

        queue.add(new int[]{sr,sc}); //adding in the queue

        // while loop 
        // till the queue isnt empty
        while(!queue.isEmpty())
        {
            int[] removed=queue.poll(); // removing from the queue

            int row=removed[0]; // row from removed one
            int col=removed[1]; // column from the removed one

            //lets look in the all four directions
            for(int k=0;k<4;k++)
            {
                int newRow=row+ dr[k];
                int newCol=col+ dc[k];

                if(newRow>=0 && newRow<image.length && newCol>=0 && newCol<image[0].length)
{
                if(image[newRow][newCol]==original && !vis[newRow][newCol])
                {
                    //mark as visited 
                    vis[newRow][newCol]=true;
                    //add in the queue
                    queue.add(new int[]{newRow,newCol});
                    //change to the color is same as the original one..
                    image[newRow][newCol]=color;
                }
}
            }

        }

        return image;

    }
}
public class FloodFill {
    
}
