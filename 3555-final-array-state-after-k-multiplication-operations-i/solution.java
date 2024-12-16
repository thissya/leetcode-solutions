class Solution {
    public static void getind(int[] nums,int k){
        int min=Integer.MAX_VALUE;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                ind=i;
            }
        }
        nums[ind]=nums[ind]*k;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            getind(nums,multiplier);
        }
        return nums;
    }
}
