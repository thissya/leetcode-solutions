class Solution {
    public int majorityElement(int[] nums) {
        // moore's Algorithm possible wheneven nums is greater than n/2 times;

        int count = 1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count=1;
                val=nums[i];
            }else{
                count+=(val==nums[i])?1:-1;
            }
        }
        return val;
    }
}
