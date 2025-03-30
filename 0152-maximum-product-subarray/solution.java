class Solution {
    public int maxProduct(int[] nums) {
        int res=1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            res*=nums[i];
            max=Math.max(res,max);
            if(nums[i]==0){
                res=1;
            }
        }
        res=1;
        for(int i=nums.length-1;i>=0;i--){
            res*=nums[i];
            max=Math.max(max,res);
            if(nums[i]==0){
                res=1;
            }
        }
        return max;
    }
}
