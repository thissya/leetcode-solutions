class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftsum=new int[nums.length];
        leftsum[0]=0;
        for(int i=1;i<nums.length;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        
        int[] right= new int[nums.length];
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}
