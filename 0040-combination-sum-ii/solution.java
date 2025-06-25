class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        Arrays.sort(can);
        bt(0,can,target,new ArrayList<>());
        return res;
    }

    public void bt(int ind, int[] nums,int target,List<Integer> cur){
        if(target<0)return ;
        if(target==0){    
            res.add(new ArrayList<>(cur));
            return ;
        }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1])continue;
            cur.add(nums[i]);
            bt(i+1,nums,target-nums[i],cur);
            cur.remove(cur.size()-1);
        }
    }

}
