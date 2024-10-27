class Solution {
    private ArrayList<String> res= new ArrayList<>();
    public void  generate(int n,String str){
        if(n==0){
            Stack<Character> stack= new Stack<>();
            for(int i=0;i<str.length();i++){
                char temp=str.charAt(i);
                if(temp=='('){
                    stack.push(temp);
                }else if(stack.isEmpty()){
                    return ;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.isEmpty())
                res.add(str);
        }else{
            generate(n-1,str+"(");
            generate(n-1,str+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        generate(n*2,"");
        return res;
    }
}
