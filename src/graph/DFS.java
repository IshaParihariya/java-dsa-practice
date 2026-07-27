//nahi samjh aaya try again 

/*
Depth First Search (DFS)

DFS explores a graph by going as deep as possible before backtracking.

It uses:

Recursion (most common)
Stack (iterative version)

Time Complexity:

O(V + E)

Space Complexity:

O(V)

where

V = Vertices
E = Edges
===================================================================

BFS vs DFS

Feature	        BFS	        DFS
Data Structure	Queue	        Stack / Recursion
Traversal	Level by level	Depth first
Shortest Path (Unweighted) ✅ Yes	❌ No
Space	       O(V)	  O(V)
Time	      O(V + E)	O(V + E)
*/
package graph;
/*
The Function
public static void dfs(int node,
                       boolean vis[],
                       ArrayList<ArrayList<Integer>> adj,
                       ArrayList<Integer> ls)

It has 4 parameters.

1. node
int node

This is the current vertex you're standing on.

Initially:

dfs(0, vis, adj, ls);

So you're starting from node 0.

Later, when DFS moves to node 1, it becomes

dfs(1, vis, adj, ls);

Then

dfs(2, vis, adj, ls);

and so on.

2. vis[]
boolean vis[]

This keeps track of visited nodes.

Initially

false false false false false

Suppose there are 5 nodes.

Node : 0 1 2 3 4
Vis  : F F F F F

When DFS reaches node 0

vis[0] = true;

Now

Node : 0 1 2 3 4
Vis  : T F F F F

Later

Node : 0 1 2 3 4
Vis  : T T F F F
3. adj
ArrayList<ArrayList<Integer>> adj

This is simply the graph.

Example

     0
   / | \
  1  2  4

Adjacency List becomes

adj.get(0) = [1,2,4]
adj.get(1) = [0]
adj.get(2) = [0]
adj.get(3) = []
adj.get(4) = [0]

Whenever you write

adj.get(node)

you're asking:

"Who are the neighbours of this node?"

4. ls
ArrayList<Integer> ls

This stores the DFS traversal.

Initially

[]

Visit node 0

[0]

Visit node 1

[0,1]

Visit node 2

[0,1,2]

and so on.

Now let's read the code
vis[node] = true;

Means

Mark this node as visited.

If node = 0

Vis

0 1 2 3 4

T F F F F
ls.add(node);

Store it.

[0]

Then comes the most important part.

for(Integer it : adj.get(node))

Suppose

node = 0

Then

adj.get(0)

returns

[1,2,4]

So the loop becomes

it = 1

it = 2

it = 4

It goes through every neighbour of node 0.

Then

if(vis[it] == false)

Suppose

it = 1

Has 1 been visited?

No.

So

dfs(1, vis, adj, ls);

Now DFS starts from node 1.

Here's the magic of recursion

Initially

dfs(0)

Inside it

dfs(1)

Inside it maybe

dfs(3)

So the calls look like

dfs(0)

   |

dfs(1)

   |

dfs(3)

Once node 3 is finished,

it returns to

dfs(1)

After node 1 is finished,

it returns to

dfs(0)

Then node 0 continues with

it = 2

Then

dfs(2)
Let's dry run the exact example

Graph

      0
    / | \
   1  2  4

Initially

vis

F F F F F

ls = []

Call

dfs(0)

Visit 0

vis

T F F F F

ls

[0]

Neighbours

1
2
4

First neighbour = 1

Call

dfs(1)

Visit 1

vis

T T F F F

ls

[0,1]

Neighbours of 1

0

Already visited.

Return.

Back to

dfs(0)

Continue loop.

Next neighbour

2

Call

dfs(2)

Visit

ls

[0,1,2]

Return.

Back to 0.

Next neighbour

4

Visit

ls

[0,1,2,4]

Done.

Output

0 1 2 4
The biggest thing to understand

The line

dfs(it, vis, adj, ls);

does not continue from the next neighbour immediately. It says:

"Go completely explore this neighbour and everything reachable from it. Only when you're done, come back to me."

That's why it's called Depth First Search—it goes as deep as possible before coming back (backtracking).
*/

class DFS1
{
    
}
public class DFS 
{
   
    public static void main(String[] args)
    {
        
    }
}
