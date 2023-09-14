class Solution {
  List<Integer>[] adj;
  boolean[] seen;
  int cnt = -1;
  int nodes = 0;
  
  private boolean helper(int i) {
    seen[i] = true;
    nodes++;
    var edges = 0;
    var ret = true;
    
    for (var neighbor : adj[i]) {
      edges++;
      
      if (!seen[neighbor])
        ret &= helper(neighbor);
    }
    if (cnt == -1) cnt = edges;
    return cnt == edges && ret;
  }
  
  public int countCompleteComponents(int n, int[][] edges) {
    adj = new ArrayList[n];
    
    for (var i=0; i<n; i++)
      adj[i] = new ArrayList<>();
    
    for (var e : edges) {
      adj[e[0]].add(e[1]);
      adj[e[1]].add(e[0]);
    }
    seen = new boolean[n];
    var ans = 0;
    
    for (var i=0; i<n; i++) {
      if (!seen[i]) {
        cnt = -1;
        nodes = 0;
        
        if (helper(i) && cnt == nodes-1) ans++;
      }
    }
    return ans;
  }
}