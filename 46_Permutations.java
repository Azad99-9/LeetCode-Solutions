//T - O(N!*N)
//S - O(n)

class Solution {
    List<List<Integer>> ans = new LinkedList<>();

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void help(int[] arr, int p) {
        if(p >= arr.length) {
            List<Integer> ds = new LinkedList<>();
            for(int i= 0; i< arr.length; i++)
                ds.add(arr[i]);
            ans.add(ds);
            return;
        }
        for(int i= p; i< arr.length; i++) {
            swap(arr, i, p);
            help(arr, p+1);
            swap(arr, i, p);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        help(nums, 0);
        return ans;
    }
}
