class Solution {
    public int numSubarrayBoundedMax(int[] nums, int l, int r) {
        int n=nums.length;
        int start=-1,end=-1;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]>r){
                start=end=i;
            }
            if(nums[i]>=l){
                end=i;
            }
            res+=(end-start);
        }
        return res;
    }
}
/*
class Solution {
    public boolean find(int s,int e,int[] nums,int l,int r){
        int mx=0;
        for(int i=s;i<=e;i++){
            mx=Math.max(mx,nums[i]);
        }
        if(mx>=l && mx<=r){
            return true;
        }
        return false;
    }
    public int numSubarrayBoundedMax(int[] nums, int l, int r) {
        int n=nums.length;
        int res =0;

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(find(i,j,nums,l,r)){
                    res++;
                }
            }
        }
        return res;
    }
}
*/
