class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int r=0,l=0;
        int ans =Integer.MAX_VALUE;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return ans!=Integer.MAX_VALUE?ans:0;


    }
}
