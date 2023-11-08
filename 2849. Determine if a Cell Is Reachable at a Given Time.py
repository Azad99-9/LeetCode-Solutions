class Solution:
    def isReachableAtTime(self, sx: int, sy: int, fx: int, fy: int, t: int) -> bool:
        if sx == fx and sy == fy:
            if t == 1:
                return False
            return True

        horizontal_moves = abs(sx - fx)
        vertical_moves = abs(sy - fy)

        diagonal_moves = min(horizontal_moves, vertical_moves)

        remaining_moves = abs(diagonal_moves - max(horizontal_moves, vertical_moves))

        if diagonal_moves + remaining_moves <= t: return True
        return False
