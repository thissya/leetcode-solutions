class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length, i = 0; 
        for(i=0;i< n;i++){
            if(i != 0 && i < n && nums[i] == nums[i - 1]) {
                continue;
            }
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }    
                if(sum>0){
                    r--;
                }else if(sum<0){
                    l++;
                }
            }
        }
        return res;
    }
}
