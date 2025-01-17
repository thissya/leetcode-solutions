class Solution {
    public void recur(int open,int close,int n,String curr,List<String> res){
        if(curr.length()==n*2){
            res.add(curr);
            return ;
        }
        if(open<n){
            recur(open+1,close,n,curr+'(',res);
        }
        if(close<open){
            recur(open,close+1,n,curr+')',res);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        recur(0,0,n,"",res);
        return res;
    }
}
