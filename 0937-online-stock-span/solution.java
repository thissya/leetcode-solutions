class StockSpanner {
    Stack<Integer> stk;
    List<Integer> arr;
    public StockSpanner() {
        arr =  new ArrayList<>();
        stk= new Stack<>();
    }
    int n=0;
    int i=-1;
    public int next(int price) {
        arr.add(price);
        n++;
        i++;
        while(!stk.isEmpty() && arr.get(stk.peek())<=price){
            stk.pop();
        }
        if(stk.isEmpty()){
            stk.add(i);
            return i+1;
        }else{
            int res = i- stk.peek();
            stk.add(i);
            return res;
        }
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
