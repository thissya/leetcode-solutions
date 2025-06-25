class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        bt(1,n,k,new ArrayList<>());
        return res;
    }
    public void bt(int start,int n,int k,List<Integer> cur){
        if(cur.size()==k){
            res.add(new ArrayList<>(cur));
            return ;
        }

        for(int i=start;i<=n;i++){
            cur.add(i);
            bt(i+1,n,k,cur);
            cur.remove(cur.size()-1);
        }
    }
}
