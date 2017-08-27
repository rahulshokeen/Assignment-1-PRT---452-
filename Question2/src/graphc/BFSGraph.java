package graphc;
import java.util.*;
import java.util.LinkedList;

public class BFSGraph{
 private int V;   // No. of vertices
 private LinkedList<Integer> adj[]; //Adjacency List

 public BFSGraph(int v)
 {
     V = v;
     adj = new LinkedList[v];
     for (int i=0; i<v; ++i)
         adj[i] = new LinkedList();
 }

 //Add an edge into graph
 public void addEdge(int v,int w)  {   adj[v].add(w);   }

 public Boolean hasConnection(int s, int d)
 {
     LinkedList<Integer>temp;

     // Marking vertices as not visited
     boolean visited[] = new boolean[V];

     // Queue for BFS
     LinkedList<Integer> queue = new LinkedList<Integer>();

     // Mark current node visited
     visited[s]=true;
     queue.add(s);

     // 'i' used for adjacent vertices of a vertex
     Iterator<Integer> i;
     while (queue.size()!=0)
     {
         s = queue.poll();
         
         int n;
         i = adj[s].listIterator();

         // If a adjacent not visited, marking it visited
         while (i.hasNext())
         {
             n = i.next();

             // Return true if adjacent node is end node
             if (n==d)
                 return true;

             // Else, continue to do BFS
             if (!visited[n])
             {
                 visited[n] = true;
                 queue.add(n);
             }
         }
     }
     
     //BFS complete without visiting "d" then, Falsse
     return false;
 }
}