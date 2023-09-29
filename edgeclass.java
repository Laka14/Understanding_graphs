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
//now we can call the graph neighbors like this: for next neighbor graph[curr].get(i).dest, for parent graph[curr].get(i).par; easier to use at the same time we have a seperate EDGE class
