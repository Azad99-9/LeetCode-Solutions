import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> divisibleSet(int[] arr) {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n, 1));
        ArrayList<Integer> hash = new ArrayList<>(Collections.nCopies(n, 1));

        for (int i = 0; i <= n - 1; i++) {
            hash.set(i, i); // initializing with current index
            for (int prevIndex = 0; prevIndex <= i - 1; prevIndex++) {
                if (arr[i] % arr[prevIndex] == 0 && 1 + dp.get(prevIndex) > dp.get(i)) {
                    dp.set(i, 1 + dp.get(prevIndex));
                    hash.set(i, prevIndex);
                }
            }
        }

        int ans = -1;
        int lastIndex = -1;

        for (int i = 0; i <= n - 1; i++) {
            if (dp.get(i) > ans) {
                ans = dp.get(i);
                lastIndex = i;
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[lastIndex]);

        while (hash.get(lastIndex) != lastIndex) { // till not reach the initialization value
            lastIndex = hash.get(lastIndex);
            temp.add(arr[lastIndex]);
        }

        // Reverse the array
        Collections.reverse(temp);

        return temp;
    }
}