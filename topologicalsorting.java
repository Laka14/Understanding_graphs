import java.util.*;
public class graphs2 {
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
    //topological sorting using DFS
    public static void topsortutil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topsortutil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void Topologicalsorting(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i =0; i<graph.length; i++){
            if(!vis[i]){
                topsortutil(graph, i, vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
