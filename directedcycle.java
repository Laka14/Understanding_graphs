import java.util.*;

public static boolean isdirectedcyclic(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i =0; i<graph.length; i++){
            if(!vis[i]){
                if(isdirectedcyclicutil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
    }
    public static boolean isdirectedcyclicutil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            if(stack[graph[curr][i]]){//cycle
                return true;
            }
            if(!vis[graph[curr][i]] && isdirectedcyclicutil(graph, i, vis, stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
