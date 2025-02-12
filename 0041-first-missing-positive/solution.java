class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int val=1;
        for(int n:nums){
            if(n==val){
                val++;
            }
        }
        return val;
    }
}
