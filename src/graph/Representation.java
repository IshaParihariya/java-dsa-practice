// graph representation 
// adjency matrix 
// adjency ..

package graph;

import java.util.ArrayList;

class GraphRepresentation // O(N^2) space complexity
{
    //adjency matrix
    public void method1()
    {
//example here we are taking...
        
        /*
0 ---- 1
|      |
|      |
2 ---- 3

Edges:

0-1
0-2
1-3
2-3

Matrix:

    0 1 2 3

0   0 1 1 0
1   1 0 0 1
2   1 0 0 1
3   0 1 1 0
        */
        
        // N and M are always given for graphs
        // N for nodes and M for edges
        int N=4;
        int M=4;
        int[][] graph=new int[N][M];
        
        graph[0][1]=1;
        graph[1][0]=1;  //undirected graph => fro directed one is taken only
        
        graph[0][2]=1;
        graph[2][0]=1;
        
        graph[1][3] = 1;
        graph[3][1] = 1;

        graph[2][3] = 1;
        graph[3][2] = 1;
    }
    
    
    //adjency list
    public void method2()
    {
        /*
0 ---- 1
|      |
|      |
2 ---- 3

Representation

0 -> 1,2

1 -> 0,3

2 -> 0,3

3 -> 1,2

Each vertex stores its neighbours.
*/
        // arraylist is used 
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        
        int N=4;
                
        for(int i=0;i<N;i++)
        {
            graph.add(new ArrayList<>());
        }
         /*
        
0 -> []

1 -> []

2 -> []

3 -> []

4 -> []
        */

        
graph.get(0).add(1); 
graph.get(1).add(0); // for undirected graph

graph.get(0).add(2);
graph.get(2).add(0);

graph.get(1).add(3);
graph.get(3).add(1);

graph.get(2).add(3);
graph.get(3).add(2);
    }
}
public class Representation 
{
    
}
