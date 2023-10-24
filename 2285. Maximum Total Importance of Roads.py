class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        degrees = [0]*n

        for road in roads:
            degrees[road[0]] += 1
            degrees[road[1]] += 1

        degrees.sort()

        max_sum = 0
        priority = 1
        for degree in degrees:
            max_sum += degree * priority
            priority += 1

        return max_sum