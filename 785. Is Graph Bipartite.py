class Solution(object):
    def isBipartite(self, graph):
        def bfs_check(graph, node, n, colors):
            q = [node]
            colors[node] = 0

            while q:
                cur_node = q.pop(0)
                cur_color = colors[cur_node]

                for adj_node in graph[cur_node]:
                    if colors[adj_node] == -1:
                        colors[adj_node] = 1 - cur_color
                        q.append(adj_node)
                    elif colors[adj_node] == colors[cur_node]:
                        return False

            return True


        n = len(graph)
        colors = [-1]*n
        for node in range(n):
            isBipartite = True
            if colors[node] == -1:
                isBipartite = bfs_check(graph, node, n, colors)
            if not isBipartite: return False


        return True
        