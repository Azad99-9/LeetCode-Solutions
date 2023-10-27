from queue import PriorityQueue 

class Solution:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        def make_graph(n, edges):

            graph = [[] for _ in range(n)]

            for edge in edges:
                u = edge[0]
                v = edge[1]
                wt = edge[2]

                graph[u].append((v, wt))
                graph[v].append((u, wt))

            return graph


        def bfs(graph, node, th):
            n = len(graph)
            dis = [float('inf')] * n
            q = PriorityQueue()
            q.put((0, node))
            neighbors = 0

            while not q.empty():  # Use not q.empty() to check if the priority queue is not empty
                cur = q.get()  # Retrieve the element with the highest priority
                cur_node = cur[1]
                cur_wt = cur[0]

                for adj_node, adj_wt in graph[cur_node]:
                    if adj_wt + cur_wt < dis[adj_node]:
                        dis[adj_node] = adj_wt + cur_wt
                        q.put((adj_wt + cur_wt, adj_node))

            return dis

        graph = make_graph(n, edges)

        mini = float('inf')
        min_node = 0
        for node in range(n):
            neighbors = bfs(graph, node, distanceThreshold)
            ans = 0
            for i,d in enumerate(neighbors):
                if d <= distanceThreshold and i != node:
                    ans += 1
            if ans <= mini:
                min_node = node
                mini = ans

        return min_node



        