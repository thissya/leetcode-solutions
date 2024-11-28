class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=(double)sum/k;
        double ans=Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++){
            ans=Math.max(ans,avg);
            sum-=nums[i-k];
            sum+=nums[i];
            avg=(double)sum/k;
        }
        ans=Math.max(ans,avg);
        return ans;
    }
}
