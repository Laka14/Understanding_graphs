public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            col[i]=-1;//no color
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){//perform bfs
                q.add(i);
                col[i] = 0; //giving yellow for first element
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr]; j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] = -1){
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest]=nextcol;
                            q.add(e.dest);
                        }
                        else if(col[curr] == col[e.dest]){
                            return false;
                        }
                    }
                }

            }            
        }
        return true;
    }
