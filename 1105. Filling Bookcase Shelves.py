class Solution(object):
    def minHeightShelves(self, books, shelfWidth):
        def recur(i, s_w, max_h, n, c_w, dp):
            if i == n:
                return max_h

            if (i, c_w, max_h) in dp: return dp[(i, c_w, max_h)]
            
            curShelf = 10**9
            nextShelf = 10**9

            if c_w + books[i][0] <= s_w:
                curShelf = recur(i+1, s_w, max(max_h, books[i][1]), n, c_w + books[i][0], dp)

            nextShelf = max_h + recur(i+1, s_w, books[i][1], n, books[i][0], dp)

            dp[(i, c_w, max_h)] = min(curShelf, nextShelf)
            return dp[(i, c_w, max_h)]

        dp = {}
        return recur(0, shelfWidth, 0, len(books), 0, dp)        