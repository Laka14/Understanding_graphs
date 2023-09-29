import java.util.*;
public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);//source=0
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){//visited current
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest); //adding 
                }
            }
        }
    }
