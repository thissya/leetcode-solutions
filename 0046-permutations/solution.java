class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    
    public void bt(int[] nums,List<Integer> cur){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(cur.contains(nums[i]))
                continue;
            cur.add(nums[i]);
            bt(nums,cur);
            cur.remove(cur.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        bt(nums,new ArrayList<>());
        return res;
    }
}
