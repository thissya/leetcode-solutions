class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){return 0;}
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(nums[i+1]-nums[i],max);
        }  
        return max;
    }
}
