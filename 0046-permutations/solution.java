class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums,new ArrayList<>(),res);
        return res;
    }
    public void bt(int[] nums,List<Integer> cur,List<List<Integer>> res){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(cur.contains(nums[i]))continue;
            cur.add(nums[i]);
            bt(nums,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}
