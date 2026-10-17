
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class SolutionBFS
{
    public boolean bfs(List<List<Integer>> graph, int start, int V)
    {
        Queue<Integer> q=new LinkedList<>(); //queue
        
        boolean[] vis=new boolean[V]; //here V is the node number so
        
        //push the first ekem here
        q.offer(start);
        
        vis[start]=true;
        
        while(!q.isEmpty())
        {
            //till the queue is not empty keep doing this..
            int elem=q.peek(); //peek elem we seeing
            
            q.poll();//remove it now
            
            //how to iterate particular fot that elem***
            //LOOK HOW I GOT THIS DONE
            
                for(Integer lNode:graph.get(elem)) //iterate through each Integer
                {
                    if(!vis[lNode])
                    {
                        q.offer(lNode);
                        vis[lNode]=true;
                    }
                }
            
        }
        //go through vis
        //return true if all true 
        //else false
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
public class BFS1 
{
    public static void main(String[] args)
    {
        SolutionBFS sol=new SolutionBFS();
        
        List<Integer> list=new ArrayList<>(); //list for each list
        
        list.add(1);
        list.add(2);
        list.add(4);
        
        List<Integer> list1=new ArrayList<>(); //list for each list
        
        list.add(2);
        list.add(1);
        list.add(3);
        
        List<Integer> list2=new ArrayList<>(); //list for each list
        
        list.add(3);
        list.add(4);
        list.add(2);
        
        List<Integer> list3=new ArrayList<>(); //list for each list
        
        list.add(4);
        list.add(1);
        list.add(3);
        
        List<List<Integer>> graph=new ArrayList<>(); //for the adjency list here
        
        graph.add(list);
        graph.add(list1);
        graph.add(list2);
        graph.add(list3);
        
        boolean result=sol.bfs(graph, 1, 4); //start node is 1
        
        System.out.println("the graph is connected : "+result);
    }
}
