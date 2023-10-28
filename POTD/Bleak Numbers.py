class Solution:
	def is_bleak(self, n):
	    def count_set_bits(x):
	        ans = 0
	        while x != 0:
	            if x & 1 == 1:
	                ans += 1
	            x >>= 1
	        return ans
	        
	    def count_bits(x):
	       # x -= 1
	        ans = 0
	        while x != 0:
	            x >>= 1
	            ans += 1
	        return ans
	   
	    for i in range(n - count_bits(n), n):
	        if i + count_set_bits(i) == n:
	            return 0
	   
	    return 1
        