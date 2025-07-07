class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                if(c=='}' && stack.peek()!='{'){
                    return false;
                }else if(c==']' && stack.peek()!='['){
                    return false;
                }else if(c==')' && stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
