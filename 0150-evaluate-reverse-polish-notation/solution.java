class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c = tokens[i];
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") ){
                int b = stk.pop();
                int a = stk.pop();
                int sum =0;
                if(c.equals("+")){
                    sum=a+b;
                }    
                else if(c.equals("-")){
                    sum=a-b;
                }else if(c.equals("*")){
                    sum=a*b;
                }else if(c.equals("/")){
                    sum=a/b;
                }
                stk.push(sum);
            }else{
                stk.push(Integer.valueOf(c));
            }
        }
        return stk.peek();
    }
}
