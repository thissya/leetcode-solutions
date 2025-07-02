class Solution {
    public List<List<Integer>> res = new ArrayList<>(); 
    public List<List<Integer>> subsets(int[] nums) {
        recur(0,nums,new ArrayList<>());
        return res;
    }
    public void recur(int i,int[] nums,List<Integer> cur){
        if(i==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        List<Integer> newcur = new ArrayList<>(cur);
        recur(i+1,nums,newcur);
        cur.add(nums[i]);
        recur(i+1,nums,cur);
    }
}
