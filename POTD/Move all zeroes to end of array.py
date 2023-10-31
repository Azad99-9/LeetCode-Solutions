class Solution:
	def pushZerosToEnd(self,arr, n):
    	l = 0
    	r = 0
    	while r < n:
    	    if arr[r] == 0: r+=1
    	    else:
    	        arr[l] = arr[r]
    	        l+=1
    	        r+=1
    	        
    	while l < n:
    	    arr[l] = 0
    	    l+= 1
    	    