class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2=0;
        sum2=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        return sum2-sum1;
    }
}
