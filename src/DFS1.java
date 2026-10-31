
import java.util.ArrayList;
import java.util.List;

//lets try getting the dfs in a graph done

class DFS
{
    public boolean dfs(List<List<Integer>> adj,int V,int start,boolean[] vis)
    {
        //boolean visited array
        //boolean[] vis=new boolean[V];
        
        vis[start]=true; //mark vis true 
        
        System.out.print(start+" ");
        
        
        
        //for each loop
        for(Integer node:adj.get(start))
        {
           if(!vis[node])
           {
               dfs(adj,V,node,vis);
           }
        
        }
        
        //if all nodes are visited means
        //all are connected
        //means a connected graph 
        //else not
        for(int i=0;i<vis.length;i++)
        {
            if(!vis[i])
            {
                return false;
            }
        }
        
        return true;
    }
}
public class DFS1 
{
    public static void main(String[] args)
    {
        DFS d=new DFS(); //object 
        
        int V=6; //number of vertices
        
        //adjency list here
        List<List<Integer>> adj =new ArrayList<>(); 
        
        boolean[] vis=new boolean[V];
        
        //filling the adj list with the nodes
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>()); //a new adjency list each time
        }
        
        /*
         0
        / \
       1   2
      /\  / 
     3  4 5 
        */
        adj.get(0).add(1);
        adj.get(0).add(2);
        
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        
        adj.get(2).add(0);
        adj.get(2).add(5);
        
        adj.get(3).add(1);
        
        adj.get(4).add(1);
        
        adj.get(5).add(2);
        
        
        
        boolean result=d.dfs(adj,V, 0,vis);
        
        if(result)
        {
            System.out.println("graph is connecetd!");
        }
        else
        {
            System.out.println("graph is not connected!!");
        }
    }
}
/*

import java.io.*;
import java.util.*;

public class Solution {

    public static void dfs(List<List<Integer>> adj, int node, boolean[] vis) {
        vis[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(adj, neighbor, vis);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Read the undirected edges in input order
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[V];

        System.out.print("DFS traversal: ");
        dfs(adj, 0, vis);
        System.out.println();

        // Check connectivity after DFS finishes
        boolean connected = true;

        for (boolean visited : vis) {
            if (!visited) {
                connected = false;
                break;
            }
        }

        if (connected) {
            System.out.println("Graph is Connected.");
        } else {
            System.out.println("Graph is Not Connected.");
        }

        sc.close();
    }
}

*/