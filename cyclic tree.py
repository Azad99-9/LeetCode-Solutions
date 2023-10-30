from typing import List


class Solution:
    
    def cyclicTree(self, N : int, edges : List[List[int]]) -> str:
        adj = [[] for _ in range(N + 1)]

        for i in edges:
            adj[i[0]].append(i[1])
            adj[i[1]].append(i[0])

        f = 0
        for i in range(1, N + 1):
            if len(adj[i]) != 2:
                f = 1
                break

        if f == 1:
            return "Yes"
        else:
            return "No"
