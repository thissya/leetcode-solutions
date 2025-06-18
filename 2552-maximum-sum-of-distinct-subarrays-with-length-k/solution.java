class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0,r=0;
        int n=nums.length;
        long max=0;
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        while(l<n && r<n){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            sum+=nums[r];
            r++;
            if(set.size()==k){
                max=Math.max(max,sum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
        }
        return max;
    }
}
