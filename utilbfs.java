public static void bfsutil(ArrayList<Edge>[] graph, boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                vis[curr] = true;
                //explore dest, src etc
                for(int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis); 
            }
        }
    }
