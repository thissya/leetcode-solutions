class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        bt(1,n,k,0,new ArrayList<>());
        return res;
    }
    public void bt(int ind,int n,int k,int len,List<Integer> cur){
        if(len==k){
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i=ind;i<=n;i++){
            cur.add(i);
            bt(i+1,n,k,len+1,cur);
            cur.remove(cur.size()-1);
        }

    }
}
