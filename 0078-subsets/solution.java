class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        recur(0,res,new ArrayList<>(),nums,n);
        return res;
    }
    
    public static void recur(int i,List<List<Integer>> res, List<Integer> cur,int[] nums,int n){
        if(i==n){
            res.add(cur);
            return;
        }
        List<Integer> newarr =  new ArrayList<>(cur);
        newarr.add(nums[i]);
        recur(i+1,res,newarr,nums,n);
        recur(i+1,res,cur,nums,n);
    }

}
