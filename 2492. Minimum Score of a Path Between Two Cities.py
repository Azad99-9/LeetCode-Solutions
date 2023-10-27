class Solution:
    def minScore(self, n: int, roads: List[List[int]]) -> int:
        def make_graph(roads, n):
            graph = [[] for _ in range(n+1)]

            for u,v,wt in roads:
                graph[u].append((v, wt))
                graph[v].append((u, wt))

            return graph

        def bfs(graph, n):
            q = [1]
            vis = [False]*(n+1)
            mini = float('inf')

            while q:
                cur_node = q.pop(0)
                vis[cur_node] = True
                for adj_node, adj_wt in graph[cur_node]:
                    if not vis[adj_node]:
                        q.append(adj_node)
                        mini = min(mini, adj_wt)

            return mini

        graph = make_graph(roads, n)
        return bfs(graph, n)

       