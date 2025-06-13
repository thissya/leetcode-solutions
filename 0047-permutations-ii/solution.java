class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        //Arrays.sort(nums); to check duplicates option 2
        recur(new ArrayList<>(),nums,res,flag);
        return res;
    }
    public static void recur(List<Integer> arr,int[] nums,List<List<Integer>> res,boolean[] flag){
        if(arr.size()==nums.length){
            if(!res.contains(arr)){ // to check duplicates option1
                res.add(new ArrayList<>(arr));
            }
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(flag[i])continue;
            //if(i>0 && nums[i]==nums[i-1] && !flag[i-1])continue;  // to Check Duplications option2
            arr.add(nums[i]);
            flag[i]=true;
            recur(arr,nums,res,flag);
            flag[i]=false;
            arr.remove(arr.size()-1);
        }
    }
}
