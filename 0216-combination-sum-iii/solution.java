class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        bt(1,0,k,n,new ArrayList<>());
        return res;
    }

    public void bt(int start,int ind,int k,int target,List<Integer> cur){
        if(target<0){
            return ;
        }
        if(ind>=k){
            if(target==0 && ind==k){
                res.add(new ArrayList<>(cur));
            }
            return;
        }


        for(int i=start;i<=9;i++){
            cur.add(i);
            bt(i+1,ind+1,k,target-i,cur);
            cur.remove(cur.size()-1);
        }

    }

}
