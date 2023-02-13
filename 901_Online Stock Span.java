class StockSpanner {
    //T-O(n)
    //s-(n)
    ArrayList<Integer> prices;
    Stack<Integer> help = new Stack<>();
    public StockSpanner() {
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        prices.add(price);
        while(!help.isEmpty() && prices.get(help.peek()) <= price)
            help.pop();
        int temp;
        if(help.isEmpty())
            temp = -1;
        else 
            temp = help.peek();
        help.push(prices.size()-1);
        return prices.size()-1-temp;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
