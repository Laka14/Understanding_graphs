public static boolean detectcycleutil(ArrayList<Edge>[] graph, int curr, int parent, boolean vis[]){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            parent = e.par;
            //case neighbor is not visited
            if(!vis[e.dest] && detectcycleutil(graph, e.dest, curr, vis)){
                return true;
            }
            //case neighbour is visited and is not my parent 
            else if(vis[e.dest] && e.dest!=parent){
                return true;
            }

        }
        return false;
    }
    public static boolean detectcycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i =0; i<graph.length; i++){
            vis[i] = false;
        }
        for(int i =0; i<graph.length; i++){
            if(!vis[i]){
                if(detectcycleutil(graph, i, -1, vis)){
                    return true;
                }
            }
        }
        return false;
    }
