class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] left = new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i-1];
        }

        int[] right = new int[nums.length];
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        } 
        for(int i=0;i<nums.length;i++){
            if(right[i]==left[i]){
                return i;
            }
        }
        return -1;
    }
}
