
package graph;
//diff approach broo

import java.util.LinkedList;
import java.util.Queue;


class Solution 
{
    int color1=0;
    int color2=1;
    int notColored=-1;

    public boolean isBipartite(int[][] graph) 
    {
        //linear graphs are bipartite
        //cyclic graphs of odd length cycle are not bipartite
        //of even length cycle may be bipartite


        //we need a color as there will be colored one
        //not colored one
        int[] color=new int[graph.length];

        //lets make every entry -1 in this color array
        for(int i=0;i<graph.length;i++)
        {
            color[i]=-1;
        }

        Queue<int[]> queue=new LinkedList<>();
        //in this queue ill store the node and the color info 
        //color info will be in integers only

        //queue.add(new int[]{0,color1});

        //color[0]=color1;
        //here graph index starts from 0 so yeys there will be a 0 node
        //also they might be disconnected like 0--1 so we might miss 2,3,.. etc
        //need a solution for this as well...
        //also to our 1st node => 0 im giving 0 as colour so starting from 0 colour
        //here im denoting 0 and 1 as the colours...

        //we had diconnected nodes from each other
        //some might be missed bcuz of this issue..
        //so we are iterating through the whole graph

        for(int i=0;i<graph.length;i++)
        {
            if(color[i]==notColored)
            {
                color[i]=color1; //default
                queue.add(new int[]{i,color1});
            
        //while loop
        while(!queue.isEmpty())
        {
            int[] removed=queue.poll();

            int node=removed[0];
            int cl=removed[1];

            //for each loop
            for(int neighbour: graph[node])
            {
                if(color[neighbour]==notColored)
                {
                    if(color[node]==color1)
                    {
                        color[neighbour]=color2;
                        queue.add(new int[]{neighbour,color2});
                    }
                    else
                    {
                        color[neighbour]=color1;
                        queue.add(new int[]{neighbour,color1});
                    }
                }
                //but if colored
                else
                {
                    if(cl==color[neighbour])
                    {
                        return false;
                    }
                }
            }
        }
        }
        }

return true;
    }
}
public class Bipartite {
    
}
