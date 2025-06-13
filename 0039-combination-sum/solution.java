class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,new ArrayList<>(),target,can,res);
        return res;
    }
    public void backtrack(int start,List<Integer> cur ,int target,int[] can, List<List<Integer>> res){
        if(target<0){
            return ;
        }
        if(target==0){
            res.add(new ArrayList<>(cur));
            return ;
        }

        for(int i=start;i<can.length;i++){
            cur.add(can[i]);
            backtrack(i,cur,target-can[i],can,res);
            cur.remove(cur.size()-1);
        }
    }
}
