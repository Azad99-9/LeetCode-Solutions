
from typing import List

class Solution:    
    
    
    def eventualSafeNodes(self, V : int, adj : List[List[int]]) -> List[int]:
            
        def reverse(graph):
            reversedGraph = {}
            for node in range(len(graph)):
                for adjNode in graph[node]:
                    if adjNode not in reversedGraph:
                        reversedGraph[adjNode] = []
                    reversedGraph[adjNode].append(node)
                    
            return reversedGraph
            
        
        terminals = []
        indegree = [0]*V
    
        graph = adj
        
        # find terminal nodes
        for i in range(V):
            if not graph[i]:
                terminals.append(i)
        
        # reverse a graph
        graph = reverse(graph)

        # calculate indegrees
        for node in range(V):
            if node in graph:
                for adjNode in graph[node]:
                    indegree[adjNode] += 1
        
        # apply topological sort
        ans = terminals[:]
        while terminals:
            curNode = terminals.pop(0)
            if curNode in graph:
                for adjNode in graph[curNode]:
                    indegree[adjNode] -= 1
                    if indegree[adjNode] == 0: 
                        ans.append(adjNode)
                        terminals.append(adjNode)
                    
        
        # sort and return nodes
        return sorted(ans)