class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int pow = ((int)Math.pow(2,maximumBit))-1;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }   
        int k=0;
        int[] ans=new int[nums.length];     
        for(int i=nums.length-1;i>=0;i--){
            ans[k++] =xor^pow;
            xor^=nums[i];
        }
        return ans;

    }
}
