class Solution {
    public int splitNum(int num) {
        List<Integer> digits = new LinkedList<>();

        while (num != 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        int n = digits.size();
        Collections.sort(digits);
        int i = 0;
        int j = 1;
        int sum = 0;
        int n1 = 0;
        int n2 = 0;
        while (i < n || j < n) {
            if (i < n) n1 = (n1 * 10) + digits.get(i);
            if (j < n) n2 = (n2 * 10) + digits.get(j);
            i = i+2;
            j = j+2;
        }

        return n1+n2;
    }
}