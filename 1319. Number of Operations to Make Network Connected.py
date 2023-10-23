class Solution(object):
    def makeConnected(self, n, connections):
        if len(connections)+1<n:
            return -1
        def findParent(u):
            if u==parent[u]:
                return u
            else:
                parent[u]=findParent(parent[u])
                return parent[u]
        def union(u,v):
            pu,pv=findParent(u),findParent(v)
            if pu==pv:
                return 
            elif rank[pu]>rank[pv]:
                parent[pv]=pu
            elif rank[pu]<rank[pv]:
                parent[pu]=pv
            else:
                parent[pv]=pu
                rank[pu]+=1
        parent=[i for i in range(n)]
        rank=[0]*n
        for u,v in connections:
            union(u,v)
        c=0
        for i in range(n):
            if parent[i]==i:
                c+=1
        return c-1