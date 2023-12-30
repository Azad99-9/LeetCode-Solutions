class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();

        for (String name : arr) {
            if (countMap.containsKey(name)) {
                countMap.put(name, countMap.get(name) + 1);
            } else {
                countMap.put(name, 1);
            }
        }

        String winner = null;
        int maxCount = 0;

        for (String name : countMap.keySet()) {
            int count = countMap.get(name);
            if (count > maxCount || (count == maxCount && name.compareTo(winner) < 0)) {
                maxCount = count;
                winner = name;
            }
        }

        String[] result = {winner, String.valueOf(maxCount)};
        return result;
    }
}


