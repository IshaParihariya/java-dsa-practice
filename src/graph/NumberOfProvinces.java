/*

There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.
*/
package graph;
//here i were confused about the city and the valus of city 
// so indeces arent city values
/*
Representation	Time
Adjacency Matrix	O(n²)
Adjacency List	O(V + E)

Approach	Time	Space
DFS (Adjacency Matrix)	O(n²)	O(n)
BFS (Adjacency Matrix)	O(n²)	O(n)
*/
class Solution 
{
    //dfs using the atrix insead of adj list
    // we could have converted matric to adj list as well
    // but in interviews this one preferred
    public void dfs(int[][] isConnected,boolean[] vis,int node)
    {
        vis[node]=true;

for(int j=0;j<isConnected.length;j++)
{
    //this is basically dfs with matrix now..
        if(isConnected[node][j]==1 && !vis[j])
        {
            dfs(isConnected,vis,j); 
        }
}
    }
    public int findCircleNum(int[][] isConnected) 
    {
       int n=isConnected.length;
       boolean[] vis=new boolean[n]; //visited node will be t else f

       int provinces=0;  //count of provinces


       //iterate 
       for(int i=0;i<n;i++)
       {
        if(!vis[i]) //not visited
        {
            provinces++; //increase the count
            // here basocally we got a node which isnt visted so we will dfs or bfs
            // so we can mention all its neighbours as visited
            // like this we wont visit visited ones again
            // in order to get the ryt count
            dfs(isConnected,vis,i); 
        }
       }
       return provinces;
    }
}
public class NumberOfProvinces 
{
    
}
