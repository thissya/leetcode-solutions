class Solution {
    int[] nums;
    int target;
    public int findTargetSumWays(int[] nums, int target) {
        this.nums=nums;
        this.target=target;

        return recur(0,0);
    }
    public int recur(int ind,int cursum){
        if(ind==nums.length){
            if(cursum==target){
                return 1;
            }
            return 0;
        }
        return recur(ind+1,cursum+nums[ind]) + recur(ind+1,cursum-nums[ind]);
    }
}
