from queue import PriorityQueue
from collections import Counter

class Solution:
    def topK(self, nums, k):
        a = Counter(nums)
        sorted_a = sorted(a.keys(), key=lambda x: (-a[x], -x))
        return sorted_a[:k]

