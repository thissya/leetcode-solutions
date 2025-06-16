class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int ind=Math.abs(nums[i]);
            if(nums[ind]<0){
                return ind;
            }
            nums[ind]=-1*nums[ind];
        }
        return -1;
    }
}
