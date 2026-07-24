/*
Breadth First Search (BFS)

Breadth First Search (BFS) is a graph traversal algorithm that visits all vertices level by level, starting from a source vertex. It explores all immediate neighbors of a node before moving to the next level.

How BFS Works

BFS uses a Queue (FIFO – First In, First Out).

Algorithm:

Start from the source node.
Mark it as visited.
Insert it into the queue.
While the queue is not empty:
Remove the front node.
Visit it.
Add all its unvisited neighbors to the queue.
Repeat until the queue becomes empty.
*/
package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GraphBFS
{
    // these both will always be given..
    // number of nodes N 
    // adjency list 
    // returning array lis in which we gonn add the traversed elements one by one..
    public ArrayList<Integer> bfs(int N, ArrayList<ArrayList<Integer>> adj)
    {
        //queue FIFO 
        Queue<Integer> q=new LinkedList<>();
        // array to mention which are visited and which are not visited nodes
        // false -> not visited
        // true  -> visited
        boolean[] vis=new boolean[N];
        
        //arralist to store the elements traversed level by level
        ArrayList<Integer> list=new ArrayList<>();
        
        //lets assume starting node =0 so we are starting from 0
        q.add(0); //queue => [0]
        vis[0]=true; //b => [1,0,0,0,....]
        
        //while loop
        while(!q.isEmpty())
        {
            //remove from queue
            Integer current=q.poll();
            
            //put in arraylist list for result..
            list.add(current);
            
            //now get the neighbours of current from adj list
            //for each
            for(Integer it : adj.get(current))
            {
                //go to each neighnour in the adjency list and get them all
                if(!vis[it]) //if didnt visit the node from adjency list 
                {
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        
        
        return list;
        
    }
    /*
    Step-by-step Dry Run

Suppose the graph is:

      0
     / \
    1   2
    |   |
    3---4

Adjacency List:

adj = [
 [1,2],    //0
 [0,3],    //1
 [0,4],    //2
 [1,4],    //3
 [2,3]     //4
]

Initially

Queue = [0]

Visited

0 1 2 3 4
T F F F F

Result = []
Iteration 1

Remove

current = 0

Result

[0]

Neighbors

1
2

Neither visited.

Queue

[1,2]

Visited

T T T F F
Iteration 2

Remove

current = 1

Result

[0,1]

Neighbors

0
3

0 already visited.

3 not visited.

Queue

[2,3]

Visited

T T T T F
Iteration 3

Remove

current = 2

Result

[0,1,2]

Neighbors

0
4

0 already visited.

4 not visited.

Queue

[3,4]

Visited

T T T T T
Iteration 4

Remove

current = 3

Result

[0,1,2,3]

Neighbors

1
4

Both already visited.

Queue

[4]
Iteration 5

Remove

current = 4

Result

[0,1,2,3,4]

Neighbors

2
3

Already visited.

Queue becomes empty.

Stop.

Final Output
[0,1,2,3,4]
Time Complexity

Every vertex is visited once.

O(V)

Every edge is checked once (or twice in an undirected graph, once from each endpoint).

O(E)

Total:

O(V + E)
Space Complexity

Queue:

O(V)

Visited array:

O(V)

Answer list:

O(V)

Overall auxiliary space (excluding the output list, which is often not counted):

O(V)
    */
}
public class BFS 
{
    public static void main(String[] args)
    {
        GraphBFS obj=new GraphBFS();
    }
}
