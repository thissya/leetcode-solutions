class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        recur(res,arr,nums);
        return res;
    }
    public static void recur(List<List<Integer>> res,List<Integer> arr,int[] nums){
        if(arr.size()==nums.length){
            res.add(new ArrayList<>(arr));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i]))continue;
            arr.add(nums[i]);
            recur(res,arr,nums);
            arr.remove(arr.size()-1);
        }
    }
}
