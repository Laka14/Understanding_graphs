import java.util.*;
public static void dfsutil(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(graph, e.dest, vis);
            }
        }
    }
public static void dfs(ArrayList<Edge>[] graph, int curr){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                dfsutil(graph, i, vis);
            }
        }
    }
