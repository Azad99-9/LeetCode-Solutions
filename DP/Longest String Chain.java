import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length() + 1)
            return false;

        int first = 0;
        int second = 0;

        while (first < s1.length()) {
            if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            } else
                first++;
        }

        return first == s1.length() && second == s2.length();
    }

    public static boolean comp(String s1, String s2) {
        return s1.length() < s2.length();
    }

    public static int longestStrChain(int n, String[] arr) {
        List<String> stringList = new ArrayList<>(Arrays.asList(arr));

        // Sort the array
        stringList.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        List<Integer> dp = new ArrayList<>(Arrays.asList(new Integer[n]));
        Collections.fill(dp, 1);

        int maxi = 1;

        for (int i = 0; i <= n - 1; i++) {

            for (int prevIndex = 0; prevIndex <= i - 1; prevIndex++) {

                if (compare(stringList.get(i), stringList.get(prevIndex)) && 1 + dp.get(prevIndex) > dp.get(i)) {
                    dp.set(i, 1 + dp.get(prevIndex));
                }
            }

            if (dp.get(i) > maxi)
                maxi = dp.get(i);
        }

        return maxi;
    }
}