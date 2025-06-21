class MinStack {
    Stack<Integer> minTrack = new Stack<>();
    Stack<Integer> stk = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        stk.push(val);
        if(minTrack.isEmpty() || minTrack.peek()>=val)
            minTrack.push(val);
    }
    
    public void pop() {
        int val = stk.pop();
        if(!minTrack.isEmpty() && val==minTrack.peek()){
            minTrack.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minTrack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
