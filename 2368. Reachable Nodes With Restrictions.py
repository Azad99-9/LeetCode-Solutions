lass Solution:
    def reachableNodes(self, n: int, edges: List[List[int]], restricted: List[int]) -> int:
        def dfs(node, vis, graph):
            if vis[node]: return 0
            print("")
            
            vis[node] = True

            nodes = 1
            for adj_node in graph[node]:
                nodes += dfs(adj_node, vis, graph)

            return nodes

        def make_graph(edges, n, res):
            graph = {}
            for i in range(n): graph[i] = []

            for edge in edges:
                u = edge[0]
                v = edge[1]
                if u not in res and v not in res:
                    graph[u].append(v)
                    graph[v].append(u)

                
            return graph
        vis = [False]*n
        graph = make_graph(edges, n, set(restricted))
        print(graph)
        return dfs(0, vis, graph)

        