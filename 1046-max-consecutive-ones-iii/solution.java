class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int n=0;
            if(nums.length-i < max){
                continue;
            }
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }
                else if(n<k){
                    n++;
                    count++;
                }else{
                    break;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
