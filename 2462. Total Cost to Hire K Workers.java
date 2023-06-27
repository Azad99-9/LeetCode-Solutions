// class Solution {
//     public long totalCost(int[] costs, int k, int candidates) {
//         PriorityQueue<Integer> p1 = new PriorityQueue<>();
//         PriorityQueue<Integer> p2 = new PriorityQueue<>();
//         int l = candidates - 1;
//         int h = (costs.length - (candidates - 1)) - 1;
//         int ans = 0;
//         int i = 0;
//         while (i < costs.length && i < candidates) p1.offer(costs[i++]);
//         if (i >= h) while (i < costs.length) p2.offer(costs[i++]);
//         else {
//             i = h;
//             while (i < costs.length) p2.offer(costs[i++]);
//         } 
        
//         while(k > 0 && (!p1.isEmpty() || !p2.isEmpty())) {
//             System.out.println(k);
//             int fSmall = Integer.MAX_VALUE;
//             int rSmall = Integer.MAX_VALUE;
//             if (!p1.isEmpty()) fSmall = p1.peek();
//             if (!p2.isEmpty()) rSmall = p2.peek();
//             System.out.println(p1);
//             System.out.println(p2);
//             if(fSmall > rSmall) {
//                 ans += rSmall;
//                 k--;
//                 p2.poll();
//                 h--;
//                 if (l < h) p2.offer(costs[h]);

//             } else {
//                 ans += fSmall;
//                 k--;
//                 p1.poll();
//                 l++;
//                 if (l < h) p1.offer(costs[l]);
//             }
//             if (l == h) p1.offer(costs[l]);

//             System.out.println(fSmall);
//             System.out.println(rSmall);
            
//             System.out.println(ans);
            
//             System.out.println();

//         }

//         return ans;

//     }
// }

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        // The worker with the lowest cost has the highest priority, if two players has the
        // same cost, break the tie by their indices (0 or 1).
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];});
        
        // Add the first k workers with section id of 0 and 
        // the last k workers with section id of 1 (without duplication) to pq.
        for (int i = 0; i < candidates; i++) {
            pq.offer(new int[] {costs[i], 0});
        }
        for (int i = Math.max(candidates, costs.length - candidates); i < costs.length; i++) {
            pq.offer(new int[] {costs[i], 1});
        }

        long answer = 0;
        int nextHead = candidates;
        int nextTail = costs.length - 1 - candidates;

        for (int i = 0; i < k; i++) {
            int[] curWorker = pq.poll();
            int curCost = curWorker[0], curSectionId = curWorker[1];
            answer += curCost;
            
            // Only refill pq if there are workers outside.
            if (nextHead <= nextTail) {
                if (curSectionId == 0) {
                    pq.offer(new int[]{costs[nextHead], 0});
                    nextHead++;
                } else {
                    pq.offer(new int[]{costs[nextTail], 1});
                    nextTail--;
                }
            }
        }

        return answer;
    }
}