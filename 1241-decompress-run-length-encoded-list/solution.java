class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i+=2){
            len+=nums[i];
        }
        int[] res= new int[len];
        int ind=0;

        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                res[ind++]=val;
            }
        }
        return res;
    }
}
