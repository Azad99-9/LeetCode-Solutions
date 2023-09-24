class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = n-1; i > -1; i--) {
            while (!stk.isEmpty() && stk.peek() <= nums2[i]) stk.pop();
            if (stk.isEmpty()) mp.put(nums2[i], -1);
            else mp.put(nums2[i], stk.peek());
            stk.push(nums2[i]);
        }

        System.out.println(mp);
        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mp.get(nums1[i]);
        }

        return ans;
    }
}