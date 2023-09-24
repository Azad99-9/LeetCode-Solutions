class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        for (int i : arr) {
            int index = i % n;
            arr[index] += n;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] / n > 1) ans.add(i);
        }
        
        if (ans.isEmpty()) ans.add(-1);
        return ans;
    }
}
