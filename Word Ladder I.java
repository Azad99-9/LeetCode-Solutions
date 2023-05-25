class Pair {
    String wrd;
    int level;
    Pair(String _wrd, int _level) {
        wrd = _wrd;
        level = _level;
    }
}

class Solution
{
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    { 
        Set<String> lookup = new HashSet<>();
        for (String word: wordList) lookup.add(word);
        
        Queue<Pair> helper = new LinkedList<>();
        helper.offer(new Pair(startWord, 1));
        lookup.remove(startWord);
        
        while(!helper.isEmpty()) {
            Pair cur = helper.poll();
            String curStr = cur.wrd;
            int curLevel = cur.level;
            if (curStr.equals(targetWord)) {
                return curLevel;
            }
            
            for (int i = 0; i < startWord.length(); i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    char[] replaceArray = curStr.toCharArray();
                    replaceArray[i] = j;
                    String possibleStr = new String(replaceArray);
                    
                    if (lookup.contains(possibleStr)) {
                        helper.offer(new Pair(possibleStr, curLevel+1));
                        lookup.remove(possibleStr);
                    }
                }
            }
        }
        
        return 0;
    }
}