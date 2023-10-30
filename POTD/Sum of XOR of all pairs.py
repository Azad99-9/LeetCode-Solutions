class Solution:
    def sumXOR (self, arr, n) : 
        ans = 0
        
        for pos in range(32):
            
            zc = 0
            oc = 0
            
            for j in range(n):
                
                if arr[j] & 1 == 1: oc += 1
                else: zc += 1
                
                arr[j] = arr[j] >> 1
                
            ans += oc * zc * (1 << pos)
            
        return ans