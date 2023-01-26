//T- O(n^2)
//s- O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(arr);

        for(int i= 0; i<arr.length-2; i++) {
           if(i== 0 || (i > 0 && arr[i] != arr[i-1])) {
            int low = i+1;
            int high = arr.length - 1;
            int d = -1*arr[i];
            while(low < high) {
                if(arr[low] + arr[high] == d) {
                    ans.add(Arrays.asList(arr[i],arr[low],arr[high]));
                    low++; high--;
                    while(low < high && arr[low] == arr[low-1]) low++;
                    while(low < high && arr[high] == arr[high+1]) high--;
                }else if(arr[low] + arr[high] < d) low++;
                 else high--;
            }
           }
        }

        return ans;

    }
}
