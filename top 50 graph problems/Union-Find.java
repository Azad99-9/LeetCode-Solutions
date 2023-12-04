class Solution
{
    
    public int find(int a, int par[]) {
        if (par[a] == a) return a;
        return par[a] = find(par[a], par);
    }
    
    //Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[])
    {
        int upa = find(a, par);
        int upb = find(b, par);
        if (upa == upb) return;
        else if (rank[upa] > rank[upb]) {
            rank[upa] += rank[upb];
            par[upb] = upa;
        } else {
            rank[upb] += rank[upa];
            par[upa] = upb;
        }
    }

    //Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        int upa = find(a, par);
        int upb = find(b, par);
        return upa == upb;
    }

}
