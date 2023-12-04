private boolean dfscheck(int node,ArrayList<ArrayList<Integer>> adj, int vis[],int pathVis[]){
        vis[node]=1;
        pathVis[node]=1;
        
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfscheck(it,adj,vis,pathVis)==true){
                    return true;
                }
            }else if(pathVis[it]==1){
                return true;
            }
        }
        pathVis[node]=0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]=new int[V];
        int pathVis[]=new int[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfscheck(i,adj,vis,pathVis)==true){
                    return true;
                }
            }
        }
        return false;
    }
