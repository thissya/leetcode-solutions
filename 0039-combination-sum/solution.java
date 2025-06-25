class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] can, int target) {
        bt(0,can,target,new ArrayList<>());
        return res;
    }
    public void bt(int start,int[] can,int target, List<Integer> cur){
        if(target<0)return ;
        if(target==0){
            res.add(new ArrayList<>(cur));
            return ;
        }

        for(int i=start;i<can.length;i++){
            cur.add(can[i]);
            bt(i,can,target-can[i],cur);
            cur.remove(cur.size()-1);
        }
    }
}
