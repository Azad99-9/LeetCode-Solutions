class Solution:
    
    #Function to find the level of node X.
    def nodeLevel(self, V, adj, X):
        level = -1
        queue = []
        queue.append(0)
        vis = [False]*V
        
        while queue:
            size = len(queue)
            level += 1
            for i in range(size):
                cur = queue.pop(0)
                if cur == X: return level
                vis[cur] = True
                for adj_node in adj[cur]:
                    if not vis[adj_node]:
                        queue.append(adj_node)
        
        return -1
