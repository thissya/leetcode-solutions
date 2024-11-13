class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){

            int left=i+1;
            int right=nums.length-1;
            
            while(left<=right){
                int mid=(left+right)/2;
                if(nums[i]+nums[mid] >=lower){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            int start=left;

            left= i+1;
            right=nums.length-1;

            while(left<=right){
                int mid = (left+right)/2;
                if(nums[i]+nums[mid] <=upper){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            int end=right;

            if(start<=end){
                ans+=(end-start)+1;
            }
        }
        return ans;
    }
}
