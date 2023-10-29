class Solution:
    
    #Function to check if Kth bit is set or not.
    def checkKthBit(self, n,k):
        n = n >> k
        if n & 1 == 1: return True
        return False
        #Your code here
