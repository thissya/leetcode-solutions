class Solution {
    public int singleNumber(int[] nums) {
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            x=x^nums[i];
        }        
        return x;
    }
}
