
class Solution:
    def transitiveClosure(self, N, graph):
        for k in range(N):
            for j in range(N):
                for i in range(N):
                    graph[i][j] = graph[i][j] or (graph[i][k] and graph[k][j]) if i != j else 1
                    
        return graph
