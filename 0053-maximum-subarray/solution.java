class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int cur=nums[0];
        for(int i=1;i<n;i++){
            cur+=nums[i];
            if(cur<nums[i]){
                cur=nums[i];
            }
            max=Math.max(max,cur);
        }
        return max;
    }
}
