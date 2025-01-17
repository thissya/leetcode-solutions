class Solution {
public:
    vector<string> res;
    void recur(int n,string cur){
        if(n==0){
            stack<char> stack;
            for(int i=0;i<cur.size();i++){
                if(cur[i]=='('){
                    stack.push('(');
                }
                else if(stack.empty()){
                    return ;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.empty()){
                res.push_back(cur);
            }
        }else{
            recur(n-1,cur+'(');
            recur(n-1,cur+')');
        }
    }
    vector<string> generateParenthesis(int n) {
        recur(n*2,"");
        return res;
    }
};
