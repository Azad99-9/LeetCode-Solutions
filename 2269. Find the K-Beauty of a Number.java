lass Solution {
    public int divisorSubstrings(int num, int k) {
        String number = String.valueOf(num);
        int n = number.length();
        if (n < k) return 0;
        int l = 0;
        int r = k-1;
        int kbeauty = 0;

        while (r < n) {
            int curNum = Integer.valueOf(number.substring(l, r+1));
            if (curNum != 0 && num % curNum == 0) kbeauty++;
            l++; r++;
        }

        return kbeauty;
    }
}