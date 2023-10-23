class Solution(object):
    def findRedundantConnection(self, edges):
        par = [i for i in range(len(edges)+1)]

        def find(u):
            if par[u] == u: return u
            return find(par[u])

        def union(u, v):
            par[find(u)] = find(v)

        ans = []
        for edge in edges:
            u = edge[0]
            v = edge[1]

            if find(u) == find(v):
                ans = [u, v]
            else: union(u, v)

        return ans