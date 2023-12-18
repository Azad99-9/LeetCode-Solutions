class Solution
{
    public void dfs(int node , int vis[] , ArrayList<ArrayList<Integer>> adj ,Stack<Integer> st ){
        
        vis[node] = 1;
        
        for(Integer it : adj.get(node)){
            if(vis[it] == 0){
                dfs(it , vis , adj , st);
            }
        }
        st.push(node);
    }
    
     public void dfs_2(int node , int vis[] , ArrayList<ArrayList<Integer>> adjT){
        
        vis[node] = 1;
        
        for(Integer it : adjT.get(node)){
            if(vis[it] == 0){
                dfs_2(it , vis , adjT);
            }
        }
    }
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
       int vis[] = new int[V];
       Stack<Integer> st = new Stack<Integer>();
       
       //step-1 Sort the nodes acc to thier finishing time
       for(int i = 0 ; i<V ; i++){
           if(vis[i] == 0){
               dfs(i , vis , adj , st);
           }
       }
       
       System.out.println(st);
       
       //step-2 Reverse the Graph
       
       ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
       
       for(int i = 0 ; i<V ; i++){
           adjT.add(new ArrayList<>());
       }
       
       for(int i = 0 ; i<V ; i++){
           vis[i] = 0;
         for(Integer it : adj.get(i)){
           adjT.get(it).add(i);
          }
       }
       
      //Step-3  again do dfs_2 to count the scc's from the stack
      
      int cnt = 0 ;
      
      while(!st.isEmpty()){
          int node = st.pop();
          
          if(vis[node] == 0){
              cnt++;
              dfs_2(node , vis , adjT);
          }
      }
      
       return cnt;
       
    }
} 
