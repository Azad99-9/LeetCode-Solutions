class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        freq = [0]*26
        for task in tasks:
            freq[ord(task) - ord('A')] += 1
        maxi = max(freq)
        gap = (maxi - 1)*(n+1)
        freq.sort(reverse = True)
        i = 0
        while gap > 0 and i < len(freq) and freq[i] > 0:
            if freq[i] == maxi: gap -= (freq[i]-1)
            else: gap -= freq[i]
            i+=1
        if gap <= 0: return len(tasks)
        else: return len(tasks)+gap