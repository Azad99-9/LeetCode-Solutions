class Solution:

	def checkTriplet(self,arr, n):
	    hasher = set()
    	for i in range(n):
    	    arr[i] = arr[i]*arr[i]
    	    hasher.add(arr[i])
    	    
    	    
    	for i in range(n):
    	    for j in range(n):
    	        if i == j: continue
    	    
    	        if (arr[i] - arr[j]) in hasher:
    	            return True
    	            
    	return False
        
