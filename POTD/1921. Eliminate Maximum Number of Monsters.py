lass Solution:
    def eliminateMaximum(self, dist: List[int], speed: List[int]) -> int:
        n = len(dist)
        times = [math.ceil(dist[0]/speed[0])]

        ans = 0

        for i in range(1,n):
            time = math.ceil(dist[i]/speed[i])
            times.append(time)

        times.sort()
        curtime = 1

        for i in range(n):
            if times[i] - curtime < 0:
                return ans
            ans += 1
            curtime += 1

        return ans
             

