class Solution:
    def maximumScoreAfterOperations(self, edges: List[List[int]], values: List[int]) -> int:
        total_val = sum(values)
        to_map = defaultdict(list)
        # print(to_map)
        for f, t in edges:
            # print(to_map[f])
            to_map[f].append(t)
            # print(to_map[f])
            to_map[t].append(f)

        def helper(node):
            if not to_map[node]:
                return values[node]
            temp = 0
            for n in to_map[node]:
                to_map[n].remove(node)
                temp += helper(n)
            
            if temp >= values[node]:
                return values[node]
            else:
                return temp

        return total_val - helper(0)
