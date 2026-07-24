/*
A connected component is a group of vertices where every vertex is reachable from every other vertex in that group.

Example:

0 ----- 1

2 ----- 3 ----- 4

5

Components:

Component 1: 0 1

Component 2: 2 3 4

Component 3: 5

Total Connected Components = 3

To find all components, run BFS/DFS from every unvisited node:

boolean[] visited = new boolean[V];

for (int i = 0; i < V; i++) {
    if (!visited[i]) {
        dfs(graph, i, visited); // or bfs(graph, i)
    }

-> if node is visited then move to next one
-> if not then traverse it like it and all the other ones in that group
*/
package graph;

public class ConnectedComponents 
{
    
}
