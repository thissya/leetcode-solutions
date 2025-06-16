class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans=-1;
        int min = (int)1e9;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,nums[i]);
            if(nums[i+1]>min){
            ans=Math.max(ans,nums[i+1]-min);
            }
        }
        return ans;
    }
}
