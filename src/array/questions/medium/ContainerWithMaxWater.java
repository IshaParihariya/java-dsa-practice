/*
11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
// figure can be found on leetcode..
Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
*/
package array.questions.medium;

class SolutionCWMW {
    public int maxArea(int[] arr) 
    {
        // pointers
        int l=0;
    int r=arr.length-1;
    int width;
    int height;
    int area=0;
    int maxarea=0;
    while(l<r)
    {
         width=r-l;
         height=Math.min(arr[l],arr[r]);

         area=width*height;

         maxarea=Math.max(area,maxarea);
         
         /*
        -> cuz lets say we having here in this example arr[l]==1 
         (first element) and arr[r]==7 (last element)
        -> as height is depeendent on the smaller one i.e., 1 as all others are larger than it 
        -> so no meaning in doing the iteration over and over restarting it
        -> so we do this
         */
        if(arr[l]<arr[r]) // height is fixed as 1 is the smallest
        {
            l++;
        }
        else
        r--;

    }
      return maxarea;  
    }
}
public class ContainerWithMaxWater {
    
}
