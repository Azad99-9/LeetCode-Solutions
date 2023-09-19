class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        if (n == 0) return 0;
            
        if (n % 2 != 0) return 1;
        
        StringBuilder num = new StringBuilder();
        
        while (n != 0) {
            num.append(String.valueOf(n%2));
            n = n/2;
        }
        
        // System.out.println(num);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') return i + 1;
        }
        
        return 0;
    }
}