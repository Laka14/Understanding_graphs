//create an edge
import java.util.*;
public class graphs1{
  static class Edge{
    int src;
    int dest;
    int par;
    public Edge(int s, int d, int p){
      this.src=s;
      this.dest=d;
      this.par=p;
    }
  }
  public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[]){
    System.out.print(curr+" ");//confirming visit
    visited[curr] = true;
    for(int i =0; i<graph[curr].size(); i++){
      Edge e =graph[curr].get(i);
      if(!visited[e.dest]){
        dfs(graph, e.dest, visited);
      }
    }
  }
}

  
