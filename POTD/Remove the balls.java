class Pair {
    int color;
    int radius;
    
    Pair (int _c, int _r) {
        color = _c;
        radius = _r;
    }
    
    boolean equals(Pair pair) {
        return (pair.color == color && pair.radius == radius);
    }
}

class Solution {

    public static int finLength(int N, int[] color, int[] radius) {
        Stack<Pair> help = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            if (help.isEmpty()) help.push(new Pair(color[i], radius[i]));
            
            else {
                Pair  cur = new Pair(color[i], radius[i]);
                if (help.peek().equals(cur)) help.pop();
                else help.push(cur);
            }
        }
        return help.size();
    }
}
        