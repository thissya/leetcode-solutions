class Solution {
    public int findLHS(int[] nums) {
       int ans=0;
        int l=0,r=1;
        Arrays.sort(nums);
        int n= nums.length;
        int min=nums[0];

        while(r<n){
            if(nums[r]-min==0){
                r++;
            }
            else if( nums[r]-min==1 ){
                ans=Math.max(ans,r-l+1);
                r++;
            }else{
                l++;
                min=nums[l];
            }
        }
        return ans;
    }
}
