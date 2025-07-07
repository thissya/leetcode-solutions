class MyQueue {
    List<Integer> arr;
    int n=0;
    int top=0;
    public MyQueue() {
        arr= new ArrayList<>();
    }
    
    public void push(int x) {
        arr.add(x);
        n++;
    }
    
    public int pop() {
        top++;
        return arr.get(top-1); 
    }
    
    public int peek() {
        return arr.get(top);
    }
    
    public boolean empty() {
        if(top==n){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
