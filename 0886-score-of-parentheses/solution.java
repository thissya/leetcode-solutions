class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack= new Stack<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(res);
                res=0;
            }else{
                res=stack.pop()+Math.max(2*res,1);
            }
        }
        return res;
    }
}
