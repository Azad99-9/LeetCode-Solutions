class Solution{
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        // code here
       int oddCount = 0;
        for(int i=0;i<V;i++){ 
            if(adj[i].size()%2!=0){
                oddCount+=1;
        }
        }
        if(oddCount==0)return 2;
        else if(oddCount==2)return 1;
        else return 0;
    }
}
