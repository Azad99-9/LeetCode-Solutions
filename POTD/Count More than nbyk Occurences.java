class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer, Integer> mp = new HashMap<>();
        int target = n/k;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            int curElement = arr[i];
            int ct = 0;
            if (mp.containsKey(curElement)) ct = mp.get(curElement);
            
            if (ct == target) ans++;
            
            mp.put(curElement, ct + 1);
        }
        
        return ans;
    }
}

